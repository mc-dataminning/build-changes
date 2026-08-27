public class euj {
   public static final euj a = new euj(0.0F, 0.0F);
   public static final euj b = new euj(1.0F, 1.0F);
   public static final euj c = new euj(1.0F, 0.0F);
   public static final euj d = new euj(-1.0F, 0.0F);
   public static final euj e = new euj(0.0F, 1.0F);
   public static final euj f = new euj(0.0F, -1.0F);
   public static final euj g = new euj(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final euj h = new euj(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public euj(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public euj a(float $$0) {
      return new euj(this.i * $$0, this.j * $$0);
   }

   public float a(euj $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public euj b(euj $$0) {
      return new euj(this.i + $$0.i, this.j + $$0.j);
   }

   public euj b(float $$0) {
      return new euj(this.i + $$0, this.j + $$0);
   }

   public boolean c(euj $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public euj a() {
      float $$0 = ayd.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new euj(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayd.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(euj $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public euj d() {
      return new euj(-this.i, -this.j);
   }
}
