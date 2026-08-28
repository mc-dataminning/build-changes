public class evr {
   public static final evr a = new evr(0.0F, 0.0F);
   public static final evr b = new evr(1.0F, 1.0F);
   public static final evr c = new evr(1.0F, 0.0F);
   public static final evr d = new evr(-1.0F, 0.0F);
   public static final evr e = new evr(0.0F, 1.0F);
   public static final evr f = new evr(0.0F, -1.0F);
   public static final evr g = new evr(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evr h = new evr(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evr(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evr a(float $$0) {
      return new evr(this.i * $$0, this.j * $$0);
   }

   public float a(evr $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evr b(evr $$0) {
      return new evr(this.i + $$0.i, this.j + $$0.j);
   }

   public evr b(float $$0) {
      return new evr(this.i + $$0, this.j + $$0);
   }

   public boolean c(evr $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evr a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evr(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evr $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evr d() {
      return new evr(-this.i, -this.j);
   }
}
