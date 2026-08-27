public class els {
   public static final els a = new els(0.0F, 0.0F);
   public static final els b = new els(1.0F, 1.0F);
   public static final els c = new els(1.0F, 0.0F);
   public static final els d = new els(-1.0F, 0.0F);
   public static final els e = new els(0.0F, 1.0F);
   public static final els f = new els(0.0F, -1.0F);
   public static final els g = new els(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final els h = new els(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public els(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public els a(float $$0) {
      return new els(this.i * $$0, this.j * $$0);
   }

   public float a(els $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public els b(els $$0) {
      return new els(this.i + $$0.i, this.j + $$0.j);
   }

   public els b(float $$0) {
      return new els(this.i + $$0, this.j + $$0);
   }

   public boolean c(els $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public els a() {
      float $$0 = auo.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new els(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return auo.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(els $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public els d() {
      return new els(-this.i, -this.j);
   }
}
