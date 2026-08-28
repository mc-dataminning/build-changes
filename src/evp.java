public class evp {
   public static final evp a = new evp(0.0F, 0.0F);
   public static final evp b = new evp(1.0F, 1.0F);
   public static final evp c = new evp(1.0F, 0.0F);
   public static final evp d = new evp(-1.0F, 0.0F);
   public static final evp e = new evp(0.0F, 1.0F);
   public static final evp f = new evp(0.0F, -1.0F);
   public static final evp g = new evp(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evp h = new evp(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evp(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evp a(float $$0) {
      return new evp(this.i * $$0, this.j * $$0);
   }

   public float a(evp $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evp b(evp $$0) {
      return new evp(this.i + $$0.i, this.j + $$0.j);
   }

   public evp b(float $$0) {
      return new evp(this.i + $$0, this.j + $$0);
   }

   public boolean c(evp $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evp a() {
      float $$0 = ayy.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evp(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayy.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evp $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evp d() {
      return new evp(-this.i, -this.j);
   }
}
