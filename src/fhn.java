public class fhn {
   public static final fhn a = new fhn(0.0F);
   final float b;
   final float c;
   final float d;

   public fhn(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fhn(float $$0) {
      this($$0, $$0, $$0);
   }

   public fhn a(float $$0) {
      return new fhn(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fhn a(float $$0, float $$1, float $$2) {
      return new fhn(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
