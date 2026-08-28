public class feh {
   public static final feh a = new feh(0.0F, 0.0F);
   public static final feh b = new feh(1.0F, 1.0F);
   public static final feh c = new feh(1.0F, 0.0F);
   public static final feh d = new feh(-1.0F, 0.0F);
   public static final feh e = new feh(0.0F, 1.0F);
   public static final feh f = new feh(0.0F, -1.0F);
   public static final feh g = new feh(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final feh h = new feh(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public feh(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public feh a(float $$0) {
      return new feh(this.i * $$0, this.j * $$0);
   }

   public float a(feh $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public feh b(feh $$0) {
      return new feh(this.i + $$0.i, this.j + $$0.j);
   }

   public feh b(float $$0) {
      return new feh(this.i + $$0, this.j + $$0);
   }

   public boolean c(feh $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public feh a() {
      float $$0 = azm.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new feh(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azm.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(feh $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public feh d() {
      return new feh(-this.i, -this.j);
   }
}
