public class elr {
   public static final elr a = new elr(0.0F, 0.0F);
   public static final elr b = new elr(1.0F, 1.0F);
   public static final elr c = new elr(1.0F, 0.0F);
   public static final elr d = new elr(-1.0F, 0.0F);
   public static final elr e = new elr(0.0F, 1.0F);
   public static final elr f = new elr(0.0F, -1.0F);
   public static final elr g = new elr(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final elr h = new elr(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public elr(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public elr a(float $$0) {
      return new elr(this.i * $$0, this.j * $$0);
   }

   public float a(elr $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public elr b(elr $$0) {
      return new elr(this.i + $$0.i, this.j + $$0.j);
   }

   public elr b(float $$0) {
      return new elr(this.i + $$0, this.j + $$0);
   }

   public boolean c(elr $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public elr a() {
      float $$0 = aun.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new elr(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aun.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(elr $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public elr d() {
      return new elr(-this.i, -this.j);
   }
}
