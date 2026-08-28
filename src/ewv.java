public class ewv {
   public static final ewv a = new ewv(0.0F, 0.0F);
   public static final ewv b = new ewv(1.0F, 1.0F);
   public static final ewv c = new ewv(1.0F, 0.0F);
   public static final ewv d = new ewv(-1.0F, 0.0F);
   public static final ewv e = new ewv(0.0F, 1.0F);
   public static final ewv f = new ewv(0.0F, -1.0F);
   public static final ewv g = new ewv(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ewv h = new ewv(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ewv(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ewv a(float $$0) {
      return new ewv(this.i * $$0, this.j * $$0);
   }

   public float a(ewv $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ewv b(ewv $$0) {
      return new ewv(this.i + $$0.i, this.j + $$0.j);
   }

   public ewv b(float $$0) {
      return new ewv(this.i + $$0, this.j + $$0);
   }

   public boolean c(ewv $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ewv a() {
      float $$0 = ayn.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ewv(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayn.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ewv $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ewv d() {
      return new ewv(-this.i, -this.j);
   }
}
