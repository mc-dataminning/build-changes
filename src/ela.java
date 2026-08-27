public class ela {
   public static final ela a = new ela(0.0F, 0.0F);
   public static final ela b = new ela(1.0F, 1.0F);
   public static final ela c = new ela(1.0F, 0.0F);
   public static final ela d = new ela(-1.0F, 0.0F);
   public static final ela e = new ela(0.0F, 1.0F);
   public static final ela f = new ela(0.0F, -1.0F);
   public static final ela g = new ela(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ela h = new ela(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ela(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ela a(float $$0) {
      return new ela(this.i * $$0, this.j * $$0);
   }

   public float a(ela $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ela b(ela $$0) {
      return new ela(this.i + $$0.i, this.j + $$0.j);
   }

   public ela b(float $$0) {
      return new ela(this.i + $$0, this.j + $$0);
   }

   public boolean c(ela $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ela a() {
      float $$0 = aty.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ela(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aty.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ela $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ela d() {
      return new ela(-this.i, -this.j);
   }
}
