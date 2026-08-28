public class fep {
   public static final fep a = new fep(0.0F, 0.0F);
   public static final fep b = new fep(1.0F, 1.0F);
   public static final fep c = new fep(1.0F, 0.0F);
   public static final fep d = new fep(-1.0F, 0.0F);
   public static final fep e = new fep(0.0F, 1.0F);
   public static final fep f = new fep(0.0F, -1.0F);
   public static final fep g = new fep(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fep h = new fep(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fep(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fep a(float $$0) {
      return new fep(this.i * $$0, this.j * $$0);
   }

   public float a(fep $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fep b(fep $$0) {
      return new fep(this.i + $$0.i, this.j + $$0.j);
   }

   public fep b(float $$0) {
      return new fep(this.i + $$0, this.j + $$0);
   }

   public boolean c(fep $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fep a() {
      float $$0 = azm.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fep(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azm.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fep $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fep d() {
      return new fep(-this.i, -this.j);
   }
}
