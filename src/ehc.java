public class ehc {
   public static final ehc a = new ehc(0.0F, 0.0F);
   public static final ehc b = new ehc(1.0F, 1.0F);
   public static final ehc c = new ehc(1.0F, 0.0F);
   public static final ehc d = new ehc(-1.0F, 0.0F);
   public static final ehc e = new ehc(0.0F, 1.0F);
   public static final ehc f = new ehc(0.0F, -1.0F);
   public static final ehc g = new ehc(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ehc h = new ehc(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ehc(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ehc a(float $$0) {
      return new ehc(this.i * $$0, this.j * $$0);
   }

   public float a(ehc $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ehc b(ehc $$0) {
      return new ehc(this.i + $$0.i, this.j + $$0.j);
   }

   public ehc b(float $$0) {
      return new ehc(this.i + $$0, this.j + $$0);
   }

   public boolean c(ehc $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ehc a() {
      float $$0 = arp.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ehc(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return arp.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ehc $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ehc d() {
      return new ehc(-this.i, -this.j);
   }
}
