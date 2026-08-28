public class evq {
   public static final evq a = new evq(0.0F, 0.0F);
   public static final evq b = new evq(1.0F, 1.0F);
   public static final evq c = new evq(1.0F, 0.0F);
   public static final evq d = new evq(-1.0F, 0.0F);
   public static final evq e = new evq(0.0F, 1.0F);
   public static final evq f = new evq(0.0F, -1.0F);
   public static final evq g = new evq(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evq h = new evq(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evq(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evq a(float $$0) {
      return new evq(this.i * $$0, this.j * $$0);
   }

   public float a(evq $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evq b(evq $$0) {
      return new evq(this.i + $$0.i, this.j + $$0.j);
   }

   public evq b(float $$0) {
      return new evq(this.i + $$0, this.j + $$0);
   }

   public boolean c(evq $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evq a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evq(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evq $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evq d() {
      return new evq(-this.i, -this.j);
   }
}
