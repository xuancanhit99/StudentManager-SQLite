package com.xuancanh.studentmanagement.presentation.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.xuancanh.studentmanagement.domain.model.Student;

import java.io.Serializable;

@Entity(tableName = "student_table")
public class StudentDTO extends Student implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "stuId")
    private int stu_id;

    @ColumnInfo(name = "stuName")
    private String stu_name;

    @ColumnInfo(name = "stuNo")
    private String stu_no;

    @ColumnInfo(name = "stuEmail")
    private String stu_email;

    @ColumnInfo(name = "stuGender")
    private int stu_gender;

    @ColumnInfo(name = "stuDob")
    private String stu_dob;

    @ColumnInfo(name = "stuClass")
    private String stu_class;

    @ColumnInfo(name = "stuAvt")
    private byte[] stu_avt;

    @ColumnInfo(name = "stuPhone")
    private String stu_phone;

    public StudentDTO() {
    }

    @Ignore
    public StudentDTO(String stu_name, String stu_no, String stu_email, int stu_gender, String stu_dob, String stu_class, byte[] stu_avt, String stu_phone) {
        this.stu_name = stu_name;
        this.stu_no = stu_no;
        this.stu_email = stu_email;
        this.stu_gender = stu_gender;
        this.stu_dob = stu_dob;
        this.stu_class = stu_class;
        this.stu_avt = stu_avt;
        this.stu_phone = stu_phone;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_no() {
        return stu_no;
    }

    public void setStu_no(String stu_no) {
        this.stu_no = stu_no;
    }

    public String getStu_email() {
        return stu_email;
    }

    public void setStu_email(String stu_email) {
        this.stu_email = stu_email;
    }

    public int getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(int stu_gender) {
        this.stu_gender = stu_gender;
    }

    public String getStu_dob() {
        return stu_dob;
    }

    public void setStu_dob(String stu_dob) {
        this.stu_dob = stu_dob;
    }

    public String getStu_class() {
        return stu_class;
    }

    public void setStu_class(String stu_class) {
        this.stu_class = stu_class;
    }

    public byte[] getStu_avt() {
        return stu_avt;
    }

    public void setStu_avt(byte[] stu_avt) {
        this.stu_avt = stu_avt;
    }

    public String getStu_phone() {
        return stu_phone;
    }

    public void setStu_phone(String stu_phone) {
        this.stu_phone = stu_phone;
    }

    public static StudentDTO convertFromStudent(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setStu_id(student.getStu_id());
        dto.setStu_phone(student.getStu_phone());
        dto.setStu_avt(student.getStu_avt());
        dto.setStu_class(student.getStu_class());
        dto.setStu_dob(student.getStu_dob());
        dto.setStu_gender(student.getStu_gender());
        dto.setStu_no(student.getStu_no());
        dto.setStu_email(student.getStu_email());
        dto.setStu_name(student.getStu_name());
        return dto;
    }

    public static Student convertFromStudentDTO(StudentDTO student) {
        Student stu = new Student();
        stu.setStu_id(student.getStu_id());
        stu.setStu_phone(student.getStu_phone());
        stu.setStu_avt(student.getStu_avt());
        stu.setStu_class(student.getStu_class());
        stu.setStu_dob(student.getStu_dob());
        stu.setStu_gender(student.getStu_gender());
        stu.setStu_no(student.getStu_no());
        stu.setStu_email(student.getStu_email());
        stu.setStu_name(student.getStu_name());
        return stu;
    }
}
