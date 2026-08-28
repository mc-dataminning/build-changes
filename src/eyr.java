public class eyr {
   public static final eyr a = new eyr(0.0F, 0.0F);
   public static final eyr b = new eyr(1.0F, 1.0F);
   public static final eyr c = new eyr(1.0F, 0.0F);
   public static final eyr d = new eyr(-1.0F, 0.0F);
   public static final eyr e = new eyr(0.0F, 1.0F);
   public static final eyr f = new eyr(0.0F, -1.0F);
   public static final eyr g = new eyr(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final eyr h = new eyr(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public eyr(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public eyr a(float $$0) {
      return new eyr(this.i * $$0, this.j * $$0);
   }

   public float a(eyr $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public eyr b(eyr $$0) {
      return new eyr(this.i + $$0.i, this.j + $$0.j);
   }

   public eyr b(float $$0) {
      return new eyr(this.i + $$0, this.j + $$0);
   }

   public boolean c(eyr $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public eyr a() {
      float $$0 = azd.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new eyr(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azd.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(eyr $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public eyr d() {
      return new eyr(-this.i, -this.j);
   }
}
