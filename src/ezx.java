public class ezx {
   public static final ezx a = new ezx(0.0F, 0.0F);
   public static final ezx b = new ezx(1.0F, 1.0F);
   public static final ezx c = new ezx(1.0F, 0.0F);
   public static final ezx d = new ezx(-1.0F, 0.0F);
   public static final ezx e = new ezx(0.0F, 1.0F);
   public static final ezx f = new ezx(0.0F, -1.0F);
   public static final ezx g = new ezx(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ezx h = new ezx(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ezx(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ezx a(float $$0) {
      return new ezx(this.i * $$0, this.j * $$0);
   }

   public float a(ezx $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ezx b(ezx $$0) {
      return new ezx(this.i + $$0.i, this.j + $$0.j);
   }

   public ezx b(float $$0) {
      return new ezx(this.i + $$0, this.j + $$0);
   }

   public boolean c(ezx $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ezx a() {
      float $$0 = azm.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ezx(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azm.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ezx $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ezx d() {
      return new ezx(-this.i, -this.j);
   }
}
