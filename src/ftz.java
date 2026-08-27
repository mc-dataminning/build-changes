public class ftz {
   public static final ftz a = new ftz(0.0F);
   final float b;
   final float c;
   final float d;

   public ftz(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ftz(float $$0) {
      this($$0, $$0, $$0);
   }

   public ftz a(float $$0) {
      return new ftz(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public ftz a(float $$0, float $$1, float $$2) {
      return new ftz(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
