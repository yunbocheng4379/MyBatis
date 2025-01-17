package com.yunbocheng.dao;

import com.yunbocheng.entity.Student;

import java.util.List;

/**
 * 这是一个接口操作Student表
 */
public interface StudentDao {

    // 查询student表的所有的数据，数据库中的每一行数据可以看做是一个student对象
    // 数据库中可能存在多个数据，返回的数据应该放到一个集合里边
    // 以下方法对应select的执行，查询数据库。
    // 使用MyBatis查询数据库的方法
    public List<Student> selectStudents();

    // 使用MyBatis插入数据的方法。
    // 参数 ：student，表示要插入到数据库的数据 （这个数据就是student对象中的属性值）
    // 返回值 ：int，代表执行insert操作后，影响数据库的行数。也就是最后成功添加了几行数据。
    // 添加一行就返回1，添加两行就返回2
    public int insertStudent(Student student);
}
