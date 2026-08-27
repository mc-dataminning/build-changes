public class ehg {
   public static final ehg a = new ehg(0.0F, 0.0F);
   public static final ehg b = new ehg(1.0F, 1.0F);
   public static final ehg c = new ehg(1.0F, 0.0F);
   public static final ehg d = new ehg(-1.0F, 0.0F);
   public static final ehg e = new ehg(0.0F, 1.0F);
   public static final ehg f = new ehg(0.0F, -1.0F);
   public static final ehg g = new ehg(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ehg h = new ehg(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ehg(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ehg a(float $$0) {
      return new ehg(this.i * $$0, this.j * $$0);
   }

   public float a(ehg $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ehg b(ehg $$0) {
      return new ehg(this.i + $$0.i, this.j + $$0.j);
   }

   public ehg b(float $$0) {
      return new ehg(this.i + $$0, this.j + $$0);
   }

   public boolean c(ehg $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ehg a() {
      float $$0 = asb.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ehg(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return asb.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ehg $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ehg d() {
      return new ehg(-this.i, -this.j);
   }
}
