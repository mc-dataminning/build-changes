public class ezm {
   public static final ezm a = new ezm(0.0F, 0.0F);
   public static final ezm b = new ezm(1.0F, 1.0F);
   public static final ezm c = new ezm(1.0F, 0.0F);
   public static final ezm d = new ezm(-1.0F, 0.0F);
   public static final ezm e = new ezm(0.0F, 1.0F);
   public static final ezm f = new ezm(0.0F, -1.0F);
   public static final ezm g = new ezm(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ezm h = new ezm(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ezm(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ezm a(float $$0) {
      return new ezm(this.i * $$0, this.j * $$0);
   }

   public float a(ezm $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ezm b(ezm $$0) {
      return new ezm(this.i + $$0.i, this.j + $$0.j);
   }

   public ezm b(float $$0) {
      return new ezm(this.i + $$0, this.j + $$0);
   }

   public boolean c(ezm $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ezm a() {
      float $$0 = azk.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ezm(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azk.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ezm $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ezm d() {
      return new ezm(-this.i, -this.j);
   }
}
