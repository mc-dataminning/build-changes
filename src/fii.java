public class fii {
   public static final fii a = new fii(0.0F);
   final float b;
   final float c;
   final float d;

   public fii(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fii(float $$0) {
      this($$0, $$0, $$0);
   }

   public fii a(float $$0) {
      return new fii(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fii a(float $$0, float $$1, float $$2) {
      return new fii(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
