public class ezq {
   public static final ezq a = new ezq(0.0F, 0.0F);
   public static final ezq b = new ezq(1.0F, 1.0F);
   public static final ezq c = new ezq(1.0F, 0.0F);
   public static final ezq d = new ezq(-1.0F, 0.0F);
   public static final ezq e = new ezq(0.0F, 1.0F);
   public static final ezq f = new ezq(0.0F, -1.0F);
   public static final ezq g = new ezq(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ezq h = new ezq(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ezq(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ezq a(float $$0) {
      return new ezq(this.i * $$0, this.j * $$0);
   }

   public float a(ezq $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ezq b(ezq $$0) {
      return new ezq(this.i + $$0.i, this.j + $$0.j);
   }

   public ezq b(float $$0) {
      return new ezq(this.i + $$0, this.j + $$0);
   }

   public boolean c(ezq $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ezq a() {
      float $$0 = azn.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ezq(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azn.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ezq $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ezq d() {
      return new ezq(-this.i, -this.j);
   }
}
