public class evs {
   public static final evs a = new evs(0.0F, 0.0F);
   public static final evs b = new evs(1.0F, 1.0F);
   public static final evs c = new evs(1.0F, 0.0F);
   public static final evs d = new evs(-1.0F, 0.0F);
   public static final evs e = new evs(0.0F, 1.0F);
   public static final evs f = new evs(0.0F, -1.0F);
   public static final evs g = new evs(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final evs h = new evs(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public evs(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public evs a(float $$0) {
      return new evs(this.i * $$0, this.j * $$0);
   }

   public float a(evs $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public evs b(evs $$0) {
      return new evs(this.i + $$0.i, this.j + $$0.j);
   }

   public evs b(float $$0) {
      return new evs(this.i + $$0, this.j + $$0);
   }

   public boolean c(evs $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public evs a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new evs(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(evs $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public evs d() {
      return new evs(-this.i, -this.j);
   }
}
