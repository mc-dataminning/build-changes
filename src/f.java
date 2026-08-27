import org.apache.commons.lang3.tuple.Triple;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class f {
   private static final float a = 3.0F + 2.0F * Math.sqrt(2.0F);
   private static final e b = e.a((float) (java.lang.Math.PI / 4));

   private f() {
   }

   public static Matrix4f a(Matrix4f $$0, float $$1) {
      return $$0.set(
         $$0.m00() * $$1,
         $$0.m01() * $$1,
         $$0.m02() * $$1,
         $$0.m03() * $$1,
         $$0.m10() * $$1,
         $$0.m11() * $$1,
         $$0.m12() * $$1,
         $$0.m13() * $$1,
         $$0.m20() * $$1,
         $$0.m21() * $$1,
         $$0.m22() * $$1,
         $$0.m23() * $$1,
         $$0.m30() * $$1,
         $$0.m31() * $$1,
         $$0.m32() * $$1,
         $$0.m33() * $$1
      );
   }

   private static e a(float $$0, float $$1, float $$2) {
      float $$3 = 2.0F * ($$0 - $$2);
      return a * $$1 * $$1 < $$3 * $$3 ? e.a($$1, $$3) : b;
   }

   private static e a(float $$0, float $$1) {
      float $$2 = (float)java.lang.Math.hypot((double)$$0, (double)$$1);
      float $$3 = $$2 > 1.0E-6F ? $$1 : 0.0F;
      float $$4 = Math.abs($$0) + Math.max($$2, 1.0E-6F);
      if ($$0 < 0.0F) {
         float $$5 = $$3;
         $$3 = $$4;
         $$4 = $$5;
      }

      return e.a($$3, $$4);
   }

   private static void a(Matrix3f $$0, Matrix3f $$1) {
      $$0.mul($$1);
      $$1.transpose();
      $$1.mul($$0);
      $$0.set($$1);
   }

   private static void a(Matrix3f $$0, Matrix3f $$1, Quaternionf $$2, Quaternionf $$3) {
      if ($$0.m01 * $$0.m01 + $$0.m10 * $$0.m10 > 1.0E-6F) {
         e $$4 = a($$0.m00, 0.5F * ($$0.m01 + $$0.m10), $$0.m11);
         Quaternionf $$5 = $$4.c($$2);
         $$3.mul($$5);
         $$4.c($$1);
         a($$0, $$1);
      }

      if ($$0.m02 * $$0.m02 + $$0.m20 * $$0.m20 > 1.0E-6F) {
         e $$6 = a($$0.m00, 0.5F * ($$0.m02 + $$0.m20), $$0.m22).a();
         Quaternionf $$7 = $$6.b($$2);
         $$3.mul($$7);
         $$6.b($$1);
         a($$0, $$1);
      }

      if ($$0.m12 * $$0.m12 + $$0.m21 * $$0.m21 > 1.0E-6F) {
         e $$8 = a($$0.m11, 0.5F * ($$0.m12 + $$0.m21), $$0.m22);
         Quaternionf $$9 = $$8.a($$2);
         $$3.mul($$9);
         $$8.a($$1);
         a($$0, $$1);
      }
   }

   public static Quaternionf a(Matrix3f $$0, int $$1) {
      Quaternionf $$2 = new Quaternionf();
      Matrix3f $$3 = new Matrix3f();
      Quaternionf $$4 = new Quaternionf();

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         a($$0, $$3, $$4, $$2);
      }

      $$2.normalize();
      return $$2;
   }

   public static Triple<Quaternionf, Vector3f, Quaternionf> a(Matrix3f $$0) {
      Matrix3f $$1 = new Matrix3f($$0);
      $$1.transpose();
      $$1.mul($$0);
      Quaternionf $$2 = a($$1, 5);
      float $$3 = $$1.m00;
      float $$4 = $$1.m11;
      boolean $$5 = (double)$$3 < 1.0E-6;
      boolean $$6 = (double)$$4 < 1.0E-6;
      Matrix3f $$8 = $$0.rotate($$2);
      Quaternionf $$9 = new Quaternionf();
      Quaternionf $$10 = new Quaternionf();
      e $$11;
      if ($$5) {
         $$11 = a($$8.m11, -$$8.m10);
      } else {
         $$11 = a($$8.m00, $$8.m01);
      }

      Quaternionf $$13 = $$11.c($$10);
      Matrix3f $$14 = $$11.c($$1);
      $$9.mul($$13);
      $$14.transpose().mul($$8);
      if ($$5) {
         $$11 = a($$14.m22, -$$14.m20);
      } else {
         $$11 = a($$14.m00, $$14.m02);
      }

      $$11 = $$11.a();
      Quaternionf $$15 = $$11.b($$10);
      Matrix3f $$16 = $$11.b($$8);
      $$9.mul($$15);
      $$16.transpose().mul($$14);
      if ($$6) {
         $$11 = a($$16.m22, -$$16.m21);
      } else {
         $$11 = a($$16.m11, $$16.m12);
      }

      Quaternionf $$17 = $$11.a($$10);
      Matrix3f $$18 = $$11.a($$14);
      $$9.mul($$17);
      $$18.transpose().mul($$16);
      Vector3f $$19 = new Vector3f($$18.m00, $$18.m11, $$18.m22);
      return Triple.of($$9, $$19, $$2.conjugate());
   }
}
