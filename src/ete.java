public class ete {
   public static final ete a = new ete(0.0F, 0.0F);
   public static final ete b = new ete(1.0F, 1.0F);
   public static final ete c = new ete(1.0F, 0.0F);
   public static final ete d = new ete(-1.0F, 0.0F);
   public static final ete e = new ete(0.0F, 1.0F);
   public static final ete f = new ete(0.0F, -1.0F);
   public static final ete g = new ete(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ete h = new ete(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ete(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ete a(float $$0) {
      return new ete(this.i * $$0, this.j * $$0);
   }

   public float a(ete $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ete b(ete $$0) {
      return new ete(this.i + $$0.i, this.j + $$0.j);
   }

   public ete b(float $$0) {
      return new ete(this.i + $$0, this.j + $$0);
   }

   public boolean c(ete $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ete a() {
      float $$0 = axw.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ete(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return axw.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ete $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ete d() {
      return new ete(-this.i, -this.j);
   }
}
