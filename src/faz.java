public class faz {
   public static final faz a = new faz(0.0F, 0.0F);
   public static final faz b = new faz(1.0F, 1.0F);
   public static final faz c = new faz(1.0F, 0.0F);
   public static final faz d = new faz(-1.0F, 0.0F);
   public static final faz e = new faz(0.0F, 1.0F);
   public static final faz f = new faz(0.0F, -1.0F);
   public static final faz g = new faz(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final faz h = new faz(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public faz(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public faz a(float $$0) {
      return new faz(this.i * $$0, this.j * $$0);
   }

   public float a(faz $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public faz b(faz $$0) {
      return new faz(this.i + $$0.i, this.j + $$0.j);
   }

   public faz b(float $$0) {
      return new faz(this.i + $$0, this.j + $$0);
   }

   public boolean c(faz $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public faz a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new faz(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(faz $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public faz d() {
      return new faz(-this.i, -this.j);
   }
}
