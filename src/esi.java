public class esi {
   public static final esi a = new esi(0.0F, 0.0F);
   public static final esi b = new esi(1.0F, 1.0F);
   public static final esi c = new esi(1.0F, 0.0F);
   public static final esi d = new esi(-1.0F, 0.0F);
   public static final esi e = new esi(0.0F, 1.0F);
   public static final esi f = new esi(0.0F, -1.0F);
   public static final esi g = new esi(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final esi h = new esi(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public esi(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public esi a(float $$0) {
      return new esi(this.i * $$0, this.j * $$0);
   }

   public float a(esi $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public esi b(esi $$0) {
      return new esi(this.i + $$0.i, this.j + $$0.j);
   }

   public esi b(float $$0) {
      return new esi(this.i + $$0, this.j + $$0);
   }

   public boolean c(esi $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public esi a() {
      float $$0 = axm.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new esi(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return axm.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(esi $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public esi d() {
      return new esi(-this.i, -this.j);
   }
}
