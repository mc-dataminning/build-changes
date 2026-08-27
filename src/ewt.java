public class ewt {
   public static final ewt a = new ewt(0.0F, 0.0F);
   public static final ewt b = new ewt(1.0F, 1.0F);
   public static final ewt c = new ewt(1.0F, 0.0F);
   public static final ewt d = new ewt(-1.0F, 0.0F);
   public static final ewt e = new ewt(0.0F, 1.0F);
   public static final ewt f = new ewt(0.0F, -1.0F);
   public static final ewt g = new ewt(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ewt h = new ewt(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ewt(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ewt a(float $$0) {
      return new ewt(this.i * $$0, this.j * $$0);
   }

   public float a(ewt $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ewt b(ewt $$0) {
      return new ewt(this.i + $$0.i, this.j + $$0.j);
   }

   public ewt b(float $$0) {
      return new ewt(this.i + $$0, this.j + $$0);
   }

   public boolean c(ewt $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ewt a() {
      float $$0 = aym.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ewt(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aym.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ewt $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ewt d() {
      return new ewt(-this.i, -this.j);
   }
}
