public class eho {
   public static final eho a = new eho(0.0F, 0.0F);
   public static final eho b = new eho(1.0F, 1.0F);
   public static final eho c = new eho(1.0F, 0.0F);
   public static final eho d = new eho(-1.0F, 0.0F);
   public static final eho e = new eho(0.0F, 1.0F);
   public static final eho f = new eho(0.0F, -1.0F);
   public static final eho g = new eho(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eho h = new eho(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eho(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eho a(float $$0) {
      return new eho(this.i * $$0, this.j * $$0);
   }

   public float a(eho $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eho b(eho $$0) {
      return new eho(this.i + $$0.i, this.j + $$0.j);
   }

   public eho b(float $$0) {
      return new eho(this.i + $$0, this.j + $$0);
   }

   public boolean c(eho $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eho a() {
      float $$0 = ary.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eho(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ary.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eho $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eho d() {
      return new eho(-this.i, -this.j);
   }
}
