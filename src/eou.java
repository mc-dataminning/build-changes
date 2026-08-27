public class eou {
   public static final eou a = new eou(0.0F, 0.0F);
   public static final eou b = new eou(1.0F, 1.0F);
   public static final eou c = new eou(1.0F, 0.0F);
   public static final eou d = new eou(-1.0F, 0.0F);
   public static final eou e = new eou(0.0F, 1.0F);
   public static final eou f = new eou(0.0F, -1.0F);
   public static final eou g = new eou(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eou h = new eou(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eou(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eou a(float $$0) {
      return new eou(this.i * $$0, this.j * $$0);
   }

   public float a(eou $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eou b(eou $$0) {
      return new eou(this.i + $$0.i, this.j + $$0.j);
   }

   public eou b(float $$0) {
      return new eou(this.i + $$0, this.j + $$0);
   }

   public boolean c(eou $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eou a() {
      float $$0 = awm.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eou(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return awm.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eou $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eou d() {
      return new eou(-this.i, -this.j);
   }
}
