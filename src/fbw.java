public class fbw {
   public static final fbw a = new fbw(0.0F, 0.0F);
   public static final fbw b = new fbw(1.0F, 1.0F);
   public static final fbw c = new fbw(1.0F, 0.0F);
   public static final fbw d = new fbw(-1.0F, 0.0F);
   public static final fbw e = new fbw(0.0F, 1.0F);
   public static final fbw f = new fbw(0.0F, -1.0F);
   public static final fbw g = new fbw(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fbw h = new fbw(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fbw(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fbw a(float $$0) {
      return new fbw(this.i * $$0, this.j * $$0);
   }

   public float a(fbw $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fbw b(fbw $$0) {
      return new fbw(this.i + $$0.i, this.j + $$0.j);
   }

   public fbw b(float $$0) {
      return new fbw(this.i + $$0, this.j + $$0);
   }

   public boolean c(fbw $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fbw a() {
      float $$0 = ayz.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fbw(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayz.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fbw $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fbw d() {
      return new fbw(-this.i, -this.j);
   }
}
