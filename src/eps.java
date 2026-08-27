public class eps {
   public static final eps a = new eps(0.0F, 0.0F);
   public static final eps b = new eps(1.0F, 1.0F);
   public static final eps c = new eps(1.0F, 0.0F);
   public static final eps d = new eps(-1.0F, 0.0F);
   public static final eps e = new eps(0.0F, 1.0F);
   public static final eps f = new eps(0.0F, -1.0F);
   public static final eps g = new eps(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eps h = new eps(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eps(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eps a(float $$0) {
      return new eps(this.i * $$0, this.j * $$0);
   }

   public float a(eps $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eps b(eps $$0) {
      return new eps(this.i + $$0.i, this.j + $$0.j);
   }

   public eps b(float $$0) {
      return new eps(this.i + $$0, this.j + $$0);
   }

   public boolean c(eps $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eps a() {
      float $$0 = aww.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eps(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aww.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eps $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eps d() {
      return new eps(-this.i, -this.j);
   }
}
