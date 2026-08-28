public class fay {
   public static final fay a = new fay(0.0F, 0.0F);
   public static final fay b = new fay(1.0F, 1.0F);
   public static final fay c = new fay(1.0F, 0.0F);
   public static final fay d = new fay(-1.0F, 0.0F);
   public static final fay e = new fay(0.0F, 1.0F);
   public static final fay f = new fay(0.0F, -1.0F);
   public static final fay g = new fay(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fay h = new fay(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fay(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fay a(float $$0) {
      return new fay(this.i * $$0, this.j * $$0);
   }

   public float a(fay $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fay b(fay $$0) {
      return new fay(this.i + $$0.i, this.j + $$0.j);
   }

   public fay b(float $$0) {
      return new fay(this.i + $$0, this.j + $$0);
   }

   public boolean c(fay $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fay a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fay(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fay $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fay d() {
      return new fay(-this.i, -this.j);
   }
}
