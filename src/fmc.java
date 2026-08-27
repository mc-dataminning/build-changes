public class fmc {
   public static final fmc a = new fmc(0.0F);
   final float b;
   final float c;
   final float d;

   public fmc(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fmc(float $$0) {
      this($$0, $$0, $$0);
   }

   public fmc a(float $$0) {
      return new fmc(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fmc a(float $$0, float $$1, float $$2) {
      return new fmc(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
