public class fba {
   public static final fba a = new fba(0.0F, 0.0F);
   public static final fba b = new fba(1.0F, 1.0F);
   public static final fba c = new fba(1.0F, 0.0F);
   public static final fba d = new fba(-1.0F, 0.0F);
   public static final fba e = new fba(0.0F, 1.0F);
   public static final fba f = new fba(0.0F, -1.0F);
   public static final fba g = new fba(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fba h = new fba(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fba(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fba a(float $$0) {
      return new fba(this.i * $$0, this.j * $$0);
   }

   public float a(fba $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fba b(fba $$0) {
      return new fba(this.i + $$0.i, this.j + $$0.j);
   }

   public fba b(float $$0) {
      return new fba(this.i + $$0, this.j + $$0);
   }

   public boolean c(fba $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fba a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fba(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fba $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fba d() {
      return new fba(-this.i, -this.j);
   }
}
