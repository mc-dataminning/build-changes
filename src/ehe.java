public class ehe {
   public static final ehe a = new ehe(0.0F, 0.0F);
   public static final ehe b = new ehe(1.0F, 1.0F);
   public static final ehe c = new ehe(1.0F, 0.0F);
   public static final ehe d = new ehe(-1.0F, 0.0F);
   public static final ehe e = new ehe(0.0F, 1.0F);
   public static final ehe f = new ehe(0.0F, -1.0F);
   public static final ehe g = new ehe(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ehe h = new ehe(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ehe(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ehe a(float $$0) {
      return new ehe(this.i * $$0, this.j * $$0);
   }

   public float a(ehe $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ehe b(ehe $$0) {
      return new ehe(this.i + $$0.i, this.j + $$0.j);
   }

   public ehe b(float $$0) {
      return new ehe(this.i + $$0, this.j + $$0);
   }

   public boolean c(ehe $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ehe a() {
      float $$0 = aro.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ehe(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aro.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ehe $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ehe d() {
      return new ehe(-this.i, -this.j);
   }
}
