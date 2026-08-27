public class fhw {
   public static final fhw a = new fhw(0.0F);
   final float b;
   final float c;
   final float d;

   public fhw(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fhw(float $$0) {
      this($$0, $$0, $$0);
   }

   public fhw a(float $$0) {
      return new fhw(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fhw a(float $$0, float $$1, float $$2) {
      return new fhw(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
