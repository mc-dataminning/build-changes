import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Quaternionf;

public record e(float a, float b) {
   public static e a(float $$0, float $$1) {
      float $$2 = Math.invsqrt($$0 * $$0 + $$1 * $$1);
      return new e($$2 * $$0, $$2 * $$1);
   }

   public static e a(float $$0) {
      float $$1 = Math.sin($$0 / 2.0F);
      float $$2 = Math.cosFromSin($$1, $$0 / 2.0F);
      return new e($$1, $$2);
   }

   public e a() {
      return new e(-this.a, this.b);
   }

   public Quaternionf a(Quaternionf $$0) {
      return $$0.set(this.a, 0.0F, 0.0F, this.b);
   }

   public Quaternionf b(Quaternionf $$0) {
      return $$0.set(0.0F, this.a, 0.0F, this.b);
   }

   public Quaternionf c(Quaternionf $$0) {
      return $$0.set(0.0F, 0.0F, this.a, this.b);
   }

   public float b() {
      return this.b * this.b - this.a * this.a;
   }

   public float c() {
      return 2.0F * this.a * this.b;
   }

   public Matrix3f a(Matrix3f $$0) {
      $$0.m01 = 0.0F;
      $$0.m02 = 0.0F;
      $$0.m10 = 0.0F;
      $$0.m20 = 0.0F;
      float $$1 = this.b();
      float $$2 = this.c();
      $$0.m11 = $$1;
      $$0.m22 = $$1;
      $$0.m12 = $$2;
      $$0.m21 = -$$2;
      $$0.m00 = 1.0F;
      return $$0;
   }

   public Matrix3f b(Matrix3f $$0) {
      $$0.m01 = 0.0F;
      $$0.m10 = 0.0F;
      $$0.m12 = 0.0F;
      $$0.m21 = 0.0F;
      float $$1 = this.b();
      float $$2 = this.c();
      $$0.m00 = $$1;
      $$0.m22 = $$1;
      $$0.m02 = -$$2;
      $$0.m20 = $$2;
      $$0.m11 = 1.0F;
      return $$0;
   }

   public Matrix3f c(Matrix3f $$0) {
      $$0.m02 = 0.0F;
      $$0.m12 = 0.0F;
      $$0.m20 = 0.0F;
      $$0.m21 = 0.0F;
      float $$1 = this.b();
      float $$2 = this.c();
      $$0.m00 = $$1;
      $$0.m11 = $$1;
      $$0.m01 = $$2;
      $$0.m10 = -$$2;
      $$0.m22 = 1.0F;
      return $$0;
   }

   public float d() {
      return this.a;
   }

   public float e() {
      return this.b;
   }
}
