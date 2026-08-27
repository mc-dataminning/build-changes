public class erz {
   public static final erz a = new erz(0.0F, 0.0F);
   public static final erz b = new erz(1.0F, 1.0F);
   public static final erz c = new erz(1.0F, 0.0F);
   public static final erz d = new erz(-1.0F, 0.0F);
   public static final erz e = new erz(0.0F, 1.0F);
   public static final erz f = new erz(0.0F, -1.0F);
   public static final erz g = new erz(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final erz h = new erz(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public erz(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public erz a(float $$0) {
      return new erz(this.i * $$0, this.j * $$0);
   }

   public float a(erz $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public erz b(erz $$0) {
      return new erz(this.i + $$0.i, this.j + $$0.j);
   }

   public erz b(float $$0) {
      return new erz(this.i + $$0, this.j + $$0);
   }

   public boolean c(erz $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public erz a() {
      float $$0 = axk.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new erz(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return axk.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(erz $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public erz d() {
      return new erz(-this.i, -this.j);
   }
}
