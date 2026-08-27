public class fqj {
   public static final fqj a = new fqj(0.0F);
   final float b;
   final float c;
   final float d;

   public fqj(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fqj(float $$0) {
      this($$0, $$0, $$0);
   }

   public fqj a(float $$0) {
      return new fqj(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fqj a(float $$0, float $$1, float $$2) {
      return new fqj(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
