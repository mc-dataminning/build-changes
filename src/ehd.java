public class ehd {
   public static final ehd a = new ehd(0.0F, 0.0F);
   public static final ehd b = new ehd(1.0F, 1.0F);
   public static final ehd c = new ehd(1.0F, 0.0F);
   public static final ehd d = new ehd(-1.0F, 0.0F);
   public static final ehd e = new ehd(0.0F, 1.0F);
   public static final ehd f = new ehd(0.0F, -1.0F);
   public static final ehd g = new ehd(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ehd h = new ehd(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ehd(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ehd a(float $$0) {
      return new ehd(this.i * $$0, this.j * $$0);
   }

   public float a(ehd $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ehd b(ehd $$0) {
      return new ehd(this.i + $$0.i, this.j + $$0.j);
   }

   public ehd b(float $$0) {
      return new ehd(this.i + $$0, this.j + $$0);
   }

   public boolean c(ehd $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ehd a() {
      float $$0 = arp.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ehd(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return arp.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ehd $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ehd d() {
      return new ehd(-this.i, -this.j);
   }
}
