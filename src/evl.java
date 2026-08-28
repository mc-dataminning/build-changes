public class evl {
   public static final evl a = new evl(0.0F, 0.0F);
   public static final evl b = new evl(1.0F, 1.0F);
   public static final evl c = new evl(1.0F, 0.0F);
   public static final evl d = new evl(-1.0F, 0.0F);
   public static final evl e = new evl(0.0F, 1.0F);
   public static final evl f = new evl(0.0F, -1.0F);
   public static final evl g = new evl(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evl h = new evl(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evl(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evl a(float $$0) {
      return new evl(this.i * $$0, this.j * $$0);
   }

   public float a(evl $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evl b(evl $$0) {
      return new evl(this.i + $$0.i, this.j + $$0.j);
   }

   public evl b(float $$0) {
      return new evl(this.i + $$0, this.j + $$0);
   }

   public boolean c(evl $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evl a() {
      float $$0 = ayu.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evl(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayu.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evl $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evl d() {
      return new evl(-this.i, -this.j);
   }
}
