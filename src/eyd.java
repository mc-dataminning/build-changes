public class eyd {
   public static final eyd a = new eyd(0.0F, 0.0F);
   public static final eyd b = new eyd(1.0F, 1.0F);
   public static final eyd c = new eyd(1.0F, 0.0F);
   public static final eyd d = new eyd(-1.0F, 0.0F);
   public static final eyd e = new eyd(0.0F, 1.0F);
   public static final eyd f = new eyd(0.0F, -1.0F);
   public static final eyd g = new eyd(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eyd h = new eyd(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eyd(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eyd a(float $$0) {
      return new eyd(this.i * $$0, this.j * $$0);
   }

   public float a(eyd $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eyd b(eyd $$0) {
      return new eyd(this.i + $$0.i, this.j + $$0.j);
   }

   public eyd b(float $$0) {
      return new eyd(this.i + $$0, this.j + $$0);
   }

   public boolean c(eyd $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eyd a() {
      float $$0 = azc.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eyd(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azc.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eyd $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eyd d() {
      return new eyd(-this.i, -this.j);
   }
}
