public class eny {
   public static final eny a = new eny(0.0F, 0.0F);
   public static final eny b = new eny(1.0F, 1.0F);
   public static final eny c = new eny(1.0F, 0.0F);
   public static final eny d = new eny(-1.0F, 0.0F);
   public static final eny e = new eny(0.0F, 1.0F);
   public static final eny f = new eny(0.0F, -1.0F);
   public static final eny g = new eny(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eny h = new eny(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eny(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eny a(float $$0) {
      return new eny(this.i * $$0, this.j * $$0);
   }

   public float a(eny $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eny b(eny $$0) {
      return new eny(this.i + $$0.i, this.j + $$0.j);
   }

   public eny b(float $$0) {
      return new eny(this.i + $$0, this.j + $$0);
   }

   public boolean c(eny $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eny a() {
      float $$0 = awi.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eny(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return awi.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eny $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eny d() {
      return new eny(-this.i, -this.j);
   }
}
