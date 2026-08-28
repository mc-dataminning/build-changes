public class ewz {
   public static final ewz a = new ewz(0.0F, 0.0F);
   public static final ewz b = new ewz(1.0F, 1.0F);
   public static final ewz c = new ewz(1.0F, 0.0F);
   public static final ewz d = new ewz(-1.0F, 0.0F);
   public static final ewz e = new ewz(0.0F, 1.0F);
   public static final ewz f = new ewz(0.0F, -1.0F);
   public static final ewz g = new ewz(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ewz h = new ewz(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ewz(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ewz a(float $$0) {
      return new ewz(this.i * $$0, this.j * $$0);
   }

   public float a(ewz $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ewz b(ewz $$0) {
      return new ewz(this.i + $$0.i, this.j + $$0.j);
   }

   public ewz b(float $$0) {
      return new ewz(this.i + $$0, this.j + $$0);
   }

   public boolean c(ewz $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ewz a() {
      float $$0 = ayo.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ewz(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayo.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ewz $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ewz d() {
      return new ewz(-this.i, -this.j);
   }
}
