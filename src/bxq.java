public class bxq {
   private float a;
   private float b;
   private float c;
   private float d = 1.0F;

   public void a(float $$0) {
      this.b = $$0;
   }

   public void a(float $$0, float $$1, float $$2) {
      this.a = this.b;
      this.b = this.b + ($$0 - this.b) * $$1;
      this.c = this.c + this.b;
      this.d = $$2;
   }

   public void a() {
      this.a = 0.0F;
      this.b = 0.0F;
      this.c = 0.0F;
   }

   public float b() {
      return this.b;
   }

   public float b(float $$0) {
      return Math.min(azk.h($$0, this.a, this.b), 1.0F);
   }

   public float c() {
      return this.c * this.d;
   }

   public float c(float $$0) {
      return (this.c - this.b * (1.0F - $$0)) * this.d;
   }

   public boolean d() {
      return this.b > 1.0E-5F;
   }
}
