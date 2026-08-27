public class ejt {
   public static final ejt a = new ejt(0.0F, 0.0F);
   public static final ejt b = new ejt(1.0F, 1.0F);
   public static final ejt c = new ejt(1.0F, 0.0F);
   public static final ejt d = new ejt(-1.0F, 0.0F);
   public static final ejt e = new ejt(0.0F, 1.0F);
   public static final ejt f = new ejt(0.0F, -1.0F);
   public static final ejt g = new ejt(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ejt h = new ejt(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ejt(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ejt a(float $$0) {
      return new ejt(this.i * $$0, this.j * $$0);
   }

   public float a(ejt $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ejt b(ejt $$0) {
      return new ejt(this.i + $$0.i, this.j + $$0.j);
   }

   public ejt b(float $$0) {
      return new ejt(this.i + $$0, this.j + $$0);
   }

   public boolean c(ejt $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ejt a() {
      float $$0 = atm.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ejt(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return atm.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ejt $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ejt d() {
      return new ejt(-this.i, -this.j);
   }
}
