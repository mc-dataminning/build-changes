public class evo {
   public static final evo a = new evo(0.0F, 0.0F);
   public static final evo b = new evo(1.0F, 1.0F);
   public static final evo c = new evo(1.0F, 0.0F);
   public static final evo d = new evo(-1.0F, 0.0F);
   public static final evo e = new evo(0.0F, 1.0F);
   public static final evo f = new evo(0.0F, -1.0F);
   public static final evo g = new evo(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evo h = new evo(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evo(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evo a(float $$0) {
      return new evo(this.i * $$0, this.j * $$0);
   }

   public float a(evo $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evo b(evo $$0) {
      return new evo(this.i + $$0.i, this.j + $$0.j);
   }

   public evo b(float $$0) {
      return new evo(this.i + $$0, this.j + $$0);
   }

   public boolean c(evo $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evo a() {
      float $$0 = ayx.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evo(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayx.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evo $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evo d() {
      return new evo(-this.i, -this.j);
   }
}
