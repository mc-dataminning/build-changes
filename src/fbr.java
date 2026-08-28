public class fbr {
   public static final fbr a = new fbr(0.0F, 0.0F);
   public static final fbr b = new fbr(1.0F, 1.0F);
   public static final fbr c = new fbr(1.0F, 0.0F);
   public static final fbr d = new fbr(-1.0F, 0.0F);
   public static final fbr e = new fbr(0.0F, 1.0F);
   public static final fbr f = new fbr(0.0F, -1.0F);
   public static final fbr g = new fbr(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fbr h = new fbr(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fbr(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fbr a(float $$0) {
      return new fbr(this.i * $$0, this.j * $$0);
   }

   public float a(fbr $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fbr b(fbr $$0) {
      return new fbr(this.i + $$0.i, this.j + $$0.j);
   }

   public fbr b(float $$0) {
      return new fbr(this.i + $$0, this.j + $$0);
   }

   public boolean c(fbr $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fbr a() {
      float $$0 = bae.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fbr(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return bae.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fbr $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fbr d() {
      return new fbr(-this.i, -this.j);
   }
}
