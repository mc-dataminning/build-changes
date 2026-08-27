public class eto {
   public static final eto a = new eto(0.0F, 0.0F);
   public static final eto b = new eto(1.0F, 1.0F);
   public static final eto c = new eto(1.0F, 0.0F);
   public static final eto d = new eto(-1.0F, 0.0F);
   public static final eto e = new eto(0.0F, 1.0F);
   public static final eto f = new eto(0.0F, -1.0F);
   public static final eto g = new eto(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eto h = new eto(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eto(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eto a(float $$0) {
      return new eto(this.i * $$0, this.j * $$0);
   }

   public float a(eto $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eto b(eto $$0) {
      return new eto(this.i + $$0.i, this.j + $$0.j);
   }

   public eto b(float $$0) {
      return new eto(this.i + $$0, this.j + $$0);
   }

   public boolean c(eto $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eto a() {
      float $$0 = axz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eto(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return axz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eto $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eto d() {
      return new eto(-this.i, -this.j);
   }
}
