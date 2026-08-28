public class ewe {
   public static final ewe a = new ewe(0.0F, 0.0F);
   public static final ewe b = new ewe(1.0F, 1.0F);
   public static final ewe c = new ewe(1.0F, 0.0F);
   public static final ewe d = new ewe(-1.0F, 0.0F);
   public static final ewe e = new ewe(0.0F, 1.0F);
   public static final ewe f = new ewe(0.0F, -1.0F);
   public static final ewe g = new ewe(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ewe h = new ewe(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ewe(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ewe a(float $$0) {
      return new ewe(this.i * $$0, this.j * $$0);
   }

   public float a(ewe $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ewe b(ewe $$0) {
      return new ewe(this.i + $$0.i, this.j + $$0.j);
   }

   public ewe b(float $$0) {
      return new ewe(this.i + $$0, this.j + $$0);
   }

   public boolean c(ewe $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ewe a() {
      float $$0 = ayg.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ewe(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayg.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ewe $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ewe d() {
      return new ewe(-this.i, -this.j);
   }
}
