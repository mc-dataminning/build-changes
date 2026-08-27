public class ejy {
   public static final ejy a = new ejy(0.0F, 0.0F);
   public static final ejy b = new ejy(1.0F, 1.0F);
   public static final ejy c = new ejy(1.0F, 0.0F);
   public static final ejy d = new ejy(-1.0F, 0.0F);
   public static final ejy e = new ejy(0.0F, 1.0F);
   public static final ejy f = new ejy(0.0F, -1.0F);
   public static final ejy g = new ejy(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ejy h = new ejy(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public ejy(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public ejy a(float $$0) {
      return new ejy(this.i * $$0, this.j * $$0);
   }

   public float a(ejy $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public ejy b(ejy $$0) {
      return new ejy(this.i + $$0.i, this.j + $$0.j);
   }

   public ejy b(float $$0) {
      return new ejy(this.i + $$0, this.j + $$0);
   }

   public boolean c(ejy $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public ejy a() {
      float $$0 = atq.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new ejy(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return atq.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(ejy $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ejy d() {
      return new ejy(-this.i, -this.j);
   }
}
