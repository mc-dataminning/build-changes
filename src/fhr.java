public class fhr {
   public static final fhr a = new fhr(0.0F);
   final float b;
   final float c;
   final float d;

   public fhr(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fhr(float $$0) {
      this($$0, $$0, $$0);
   }

   public fhr a(float $$0) {
      return new fhr(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fhr a(float $$0, float $$1, float $$2) {
      return new fhr(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
