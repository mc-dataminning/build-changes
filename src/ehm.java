public class ehm {
   public static final ehm a = new ehm(0.0F, 0.0F);
   public static final ehm b = new ehm(1.0F, 1.0F);
   public static final ehm c = new ehm(1.0F, 0.0F);
   public static final ehm d = new ehm(-1.0F, 0.0F);
   public static final ehm e = new ehm(0.0F, 1.0F);
   public static final ehm f = new ehm(0.0F, -1.0F);
   public static final ehm g = new ehm(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ehm h = new ehm(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ehm(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ehm a(float $$0) {
      return new ehm(this.i * $$0, this.j * $$0);
   }

   public float a(ehm $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ehm b(ehm $$0) {
      return new ehm(this.i + $$0.i, this.j + $$0.j);
   }

   public ehm b(float $$0) {
      return new ehm(this.i + $$0, this.j + $$0);
   }

   public boolean c(ehm $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ehm a() {
      float $$0 = arw.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ehm(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return arw.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ehm $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ehm d() {
      return new ehm(-this.i, -this.j);
   }
}
