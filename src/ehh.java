public class ehh {
   public static final ehh a = new ehh(0.0F, 0.0F);
   public static final ehh b = new ehh(1.0F, 1.0F);
   public static final ehh c = new ehh(1.0F, 0.0F);
   public static final ehh d = new ehh(-1.0F, 0.0F);
   public static final ehh e = new ehh(0.0F, 1.0F);
   public static final ehh f = new ehh(0.0F, -1.0F);
   public static final ehh g = new ehh(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ehh h = new ehh(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ehh(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ehh a(float $$0) {
      return new ehh(this.i * $$0, this.j * $$0);
   }

   public float a(ehh $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ehh b(ehh $$0) {
      return new ehh(this.i + $$0.i, this.j + $$0.j);
   }

   public ehh b(float $$0) {
      return new ehh(this.i + $$0, this.j + $$0);
   }

   public boolean c(ehh $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ehh a() {
      float $$0 = ars.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ehh(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ars.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ehh $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ehh d() {
      return new ehh(-this.i, -this.j);
   }
}
