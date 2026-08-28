public class evy {
   public static final evy a = new evy(0.0F, 0.0F);
   public static final evy b = new evy(1.0F, 1.0F);
   public static final evy c = new evy(1.0F, 0.0F);
   public static final evy d = new evy(-1.0F, 0.0F);
   public static final evy e = new evy(0.0F, 1.0F);
   public static final evy f = new evy(0.0F, -1.0F);
   public static final evy g = new evy(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evy h = new evy(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evy(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evy a(float $$0) {
      return new evy(this.i * $$0, this.j * $$0);
   }

   public float a(evy $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evy b(evy $$0) {
      return new evy(this.i + $$0.i, this.j + $$0.j);
   }

   public evy b(float $$0) {
      return new evy(this.i + $$0, this.j + $$0);
   }

   public boolean c(evy $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evy a() {
      float $$0 = aye.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evy(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aye.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evy $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evy d() {
      return new evy(-this.i, -this.j);
   }
}
