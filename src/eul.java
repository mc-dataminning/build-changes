public class eul {
   public static final eul a = new eul(0.0F, 0.0F);
   public static final eul b = new eul(1.0F, 1.0F);
   public static final eul c = new eul(1.0F, 0.0F);
   public static final eul d = new eul(-1.0F, 0.0F);
   public static final eul e = new eul(0.0F, 1.0F);
   public static final eul f = new eul(0.0F, -1.0F);
   public static final eul g = new eul(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eul h = new eul(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eul(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eul a(float $$0) {
      return new eul(this.i * $$0, this.j * $$0);
   }

   public float a(eul $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eul b(eul $$0) {
      return new eul(this.i + $$0.i, this.j + $$0.j);
   }

   public eul b(float $$0) {
      return new eul(this.i + $$0, this.j + $$0);
   }

   public boolean c(eul $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eul a() {
      float $$0 = ayf.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eul(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return ayf.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eul $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eul d() {
      return new eul(-this.i, -this.j);
   }
}
