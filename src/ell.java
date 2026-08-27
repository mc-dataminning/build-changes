public class ell {
   public static final ell a = new ell(0.0F, 0.0F);
   public static final ell b = new ell(1.0F, 1.0F);
   public static final ell c = new ell(1.0F, 0.0F);
   public static final ell d = new ell(-1.0F, 0.0F);
   public static final ell e = new ell(0.0F, 1.0F);
   public static final ell f = new ell(0.0F, -1.0F);
   public static final ell g = new ell(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ell h = new ell(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ell(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ell a(float $$0) {
      return new ell(this.i * $$0, this.j * $$0);
   }

   public float a(ell $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ell b(ell $$0) {
      return new ell(this.i + $$0.i, this.j + $$0.j);
   }

   public ell b(float $$0) {
      return new ell(this.i + $$0, this.j + $$0);
   }

   public boolean c(ell $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ell a() {
      float $$0 = aui.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ell(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aui.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ell $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ell d() {
      return new ell(-this.i, -this.j);
   }
}
