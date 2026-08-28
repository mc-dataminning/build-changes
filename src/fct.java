public class fct {
   public static final fct a = new fct(0.0F, 0.0F);
   public static final fct b = new fct(1.0F, 1.0F);
   public static final fct c = new fct(1.0F, 0.0F);
   public static final fct d = new fct(-1.0F, 0.0F);
   public static final fct e = new fct(0.0F, 1.0F);
   public static final fct f = new fct(0.0F, -1.0F);
   public static final fct g = new fct(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fct h = new fct(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fct(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fct a(float $$0) {
      return new fct(this.i * $$0, this.j * $$0);
   }

   public float a(fct $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fct b(fct $$0) {
      return new fct(this.i + $$0.i, this.j + $$0.j);
   }

   public fct b(float $$0) {
      return new fct(this.i + $$0, this.j + $$0);
   }

   public boolean c(fct $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fct a() {
      float $$0 = azk.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fct(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azk.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fct $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fct d() {
      return new fct(-this.i, -this.j);
   }
}
