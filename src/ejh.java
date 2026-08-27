public class ejh {
   public static final ejh a = new ejh(0.0F, 0.0F);
   public static final ejh b = new ejh(1.0F, 1.0F);
   public static final ejh c = new ejh(1.0F, 0.0F);
   public static final ejh d = new ejh(-1.0F, 0.0F);
   public static final ejh e = new ejh(0.0F, 1.0F);
   public static final ejh f = new ejh(0.0F, -1.0F);
   public static final ejh g = new ejh(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ejh h = new ejh(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ejh(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ejh a(float $$0) {
      return new ejh(this.i * $$0, this.j * $$0);
   }

   public float a(ejh $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ejh b(ejh $$0) {
      return new ejh(this.i + $$0.i, this.j + $$0.j);
   }

   public ejh b(float $$0) {
      return new ejh(this.i + $$0, this.j + $$0);
   }

   public boolean c(ejh $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ejh a() {
      float $$0 = ati.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ejh(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ati.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ejh $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ejh d() {
      return new ejh(-this.i, -this.j);
   }
}
