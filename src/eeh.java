public class eeh {
   public static final eeh a = new eeh(0.0F, 0.0F);
   public static final eeh b = new eeh(1.0F, 1.0F);
   public static final eeh c = new eeh(1.0F, 0.0F);
   public static final eeh d = new eeh(-1.0F, 0.0F);
   public static final eeh e = new eeh(0.0F, 1.0F);
   public static final eeh f = new eeh(0.0F, -1.0F);
   public static final eeh g = new eeh(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eeh h = new eeh(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eeh(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eeh a(float $$0) {
      return new eeh(this.i * $$0, this.j * $$0);
   }

   public float a(eeh $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eeh b(eeh $$0) {
      return new eeh(this.i + $$0.i, this.j + $$0.j);
   }

   public eeh b(float $$0) {
      return new eeh(this.i + $$0, this.j + $$0);
   }

   public boolean c(eeh $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eeh a() {
      float $$0 = apa.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eeh(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return apa.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eeh $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eeh d() {
      return new eeh(-this.i, -this.j);
   }
}
