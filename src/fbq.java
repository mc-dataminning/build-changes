public class fbq {
   public static final fbq a = new fbq(0.0F, 0.0F);
   public static final fbq b = new fbq(1.0F, 1.0F);
   public static final fbq c = new fbq(1.0F, 0.0F);
   public static final fbq d = new fbq(-1.0F, 0.0F);
   public static final fbq e = new fbq(0.0F, 1.0F);
   public static final fbq f = new fbq(0.0F, -1.0F);
   public static final fbq g = new fbq(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fbq h = new fbq(Float.MIN_VALUE, Float.MIN_VALUE);
   public final float i;
   public final float j;

   public fbq(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public fbq a(float $$0) {
      return new fbq(this.i * $$0, this.j * $$0);
   }

   public float a(fbq $$0) {
      return this.i * $$0.i + this.j * $$0.j;
   }

   public fbq b(fbq $$0) {
      return new fbq(this.i + $$0.i, this.j + $$0.j);
   }

   public fbq b(float $$0) {
      return new fbq(this.i + $$0, this.j + $$0);
   }

   public boolean c(fbq $$0) {
      return this.i == $$0.i && this.j == $$0.j;
   }

   public fbq a() {
      float $$0 = azu.c(this.i * this.i + this.j * this.j);
      return $$0 < 1.0E-4F ? a : new fbq(this.i / $$0, this.j / $$0);
   }

   public float b() {
      return azu.c(this.i * this.i + this.j * this.j);
   }

   public float c() {
      return this.i * this.i + this.j * this.j;
   }

   public float d(fbq $$0) {
      float $$1 = $$0.i - this.i;
      float $$2 = $$0.j - this.j;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fbq d() {
      return new fbq(-this.i, -this.j);
   }
}
