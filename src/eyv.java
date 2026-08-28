public class eyv {
   public static final eyv a = new eyv(0.0F, 0.0F);
   public static final eyv b = new eyv(1.0F, 1.0F);
   public static final eyv c = new eyv(1.0F, 0.0F);
   public static final eyv d = new eyv(-1.0F, 0.0F);
   public static final eyv e = new eyv(0.0F, 1.0F);
   public static final eyv f = new eyv(0.0F, -1.0F);
   public static final eyv g = new eyv(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eyv h = new eyv(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eyv(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eyv a(float $$0) {
      return new eyv(this.i * $$0, this.j * $$0);
   }

   public float a(eyv $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eyv b(eyv $$0) {
      return new eyv(this.i + $$0.i, this.j + $$0.j);
   }

   public eyv b(float $$0) {
      return new eyv(this.i + $$0, this.j + $$0);
   }

   public boolean c(eyv $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eyv a() {
      float $$0 = azf.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eyv(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azf.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eyv $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eyv d() {
      return new eyv(-this.i, -this.j);
   }
}
