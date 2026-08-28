public class exb {
   public static final exb a = new exb(0.0F, 0.0F);
   public static final exb b = new exb(1.0F, 1.0F);
   public static final exb c = new exb(1.0F, 0.0F);
   public static final exb d = new exb(-1.0F, 0.0F);
   public static final exb e = new exb(0.0F, 1.0F);
   public static final exb f = new exb(0.0F, -1.0F);
   public static final exb g = new exb(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final exb h = new exb(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public exb(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public exb a(float $$0) {
      return new exb(this.i * $$0, this.j * $$0);
   }

   public float a(exb $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public exb b(exb $$0) {
      return new exb(this.i + $$0.i, this.j + $$0.j);
   }

   public exb b(float $$0) {
      return new exb(this.i + $$0, this.j + $$0);
   }

   public boolean c(exb $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public exb a() {
      float $$0 = ayo.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new exb(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayo.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(exb $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public exb d() {
      return new exb(-this.i, -this.j);
   }
}
