public class epq {
   public static final epq a = new epq(0.0F, 0.0F);
   public static final epq b = new epq(1.0F, 1.0F);
   public static final epq c = new epq(1.0F, 0.0F);
   public static final epq d = new epq(-1.0F, 0.0F);
   public static final epq e = new epq(0.0F, 1.0F);
   public static final epq f = new epq(0.0F, -1.0F);
   public static final epq g = new epq(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final epq h = new epq(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public epq(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public epq a(float $$0) {
      return new epq(this.i * $$0, this.j * $$0);
   }

   public float a(epq $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public epq b(epq $$0) {
      return new epq(this.i + $$0.i, this.j + $$0.j);
   }

   public epq b(float $$0) {
      return new epq(this.i + $$0, this.j + $$0);
   }

   public boolean c(epq $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public epq a() {
      float $$0 = aww.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new epq(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return aww.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(epq $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public epq d() {
      return new epq(-this.i, -this.j);
   }
}
