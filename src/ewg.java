public class ewg {
   public static final ewg a = new ewg(0.0F, 0.0F);
   public static final ewg b = new ewg(1.0F, 1.0F);
   public static final ewg c = new ewg(1.0F, 0.0F);
   public static final ewg d = new ewg(-1.0F, 0.0F);
   public static final ewg e = new ewg(0.0F, 1.0F);
   public static final ewg f = new ewg(0.0F, -1.0F);
   public static final ewg g = new ewg(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ewg h = new ewg(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ewg(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ewg a(float $$0) {
      return new ewg(this.i * $$0, this.j * $$0);
   }

   public float a(ewg $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ewg b(ewg $$0) {
      return new ewg(this.i + $$0.i, this.j + $$0.j);
   }

   public ewg b(float $$0) {
      return new ewg(this.i + $$0, this.j + $$0);
   }

   public boolean c(ewg $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ewg a() {
      float $$0 = ayg.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ewg(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayg.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ewg $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ewg d() {
      return new ewg(-this.i, -this.j);
   }
}
