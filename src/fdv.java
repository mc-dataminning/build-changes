public class fdv {
   public static final fdv a = new fdv(0.0F, 0.0F);
   public static final fdv b = new fdv(1.0F, 1.0F);
   public static final fdv c = new fdv(1.0F, 0.0F);
   public static final fdv d = new fdv(-1.0F, 0.0F);
   public static final fdv e = new fdv(0.0F, 1.0F);
   public static final fdv f = new fdv(0.0F, -1.0F);
   public static final fdv g = new fdv(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fdv h = new fdv(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fdv(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fdv a(float $$0) {
      return new fdv(this.i * $$0, this.j * $$0);
   }

   public float a(fdv $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fdv b(fdv $$0) {
      return new fdv(this.i + $$0.i, this.j + $$0.j);
   }

   public fdv b(float $$0) {
      return new fdv(this.i + $$0, this.j + $$0);
   }

   public boolean c(fdv $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fdv a() {
      float $$0 = azk.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fdv(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azk.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fdv $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fdv d() {
      return new fdv(-this.i, -this.j);
   }
}
