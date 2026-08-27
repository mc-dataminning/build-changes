public class eie {
   public static final eie a = new eie(0.0F, 0.0F);
   public static final eie b = new eie(1.0F, 1.0F);
   public static final eie c = new eie(1.0F, 0.0F);
   public static final eie d = new eie(-1.0F, 0.0F);
   public static final eie e = new eie(0.0F, 1.0F);
   public static final eie f = new eie(0.0F, -1.0F);
   public static final eie g = new eie(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eie h = new eie(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eie(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eie a(float $$0) {
      return new eie(this.i * $$0, this.j * $$0);
   }

   public float a(eie $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eie b(eie $$0) {
      return new eie(this.i + $$0.i, this.j + $$0.j);
   }

   public eie b(float $$0) {
      return new eie(this.i + $$0, this.j + $$0);
   }

   public boolean c(eie $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eie a() {
      float $$0 = asy.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eie(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return asy.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eie $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eie d() {
      return new eie(-this.i, -this.j);
   }
}
