public class ezg {
   public static final ezg a = new ezg(0.0F, 0.0F);
   public static final ezg b = new ezg(1.0F, 1.0F);
   public static final ezg c = new ezg(1.0F, 0.0F);
   public static final ezg d = new ezg(-1.0F, 0.0F);
   public static final ezg e = new ezg(0.0F, 1.0F);
   public static final ezg f = new ezg(0.0F, -1.0F);
   public static final ezg g = new ezg(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ezg h = new ezg(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ezg(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ezg a(float $$0) {
      return new ezg(this.i * $$0, this.j * $$0);
   }

   public float a(ezg $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ezg b(ezg $$0) {
      return new ezg(this.i + $$0.i, this.j + $$0.j);
   }

   public ezg b(float $$0) {
      return new ezg(this.i + $$0, this.j + $$0);
   }

   public boolean c(ezg $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ezg a() {
      float $$0 = azj.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ezg(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azj.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ezg $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ezg d() {
      return new ezg(-this.i, -this.j);
   }
}
