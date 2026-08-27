public class fnn {
   public static final fnn a = new fnn(0.0F);
   final float b;
   final float c;
   final float d;

   public fnn(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fnn(float $$0) {
      this($$0, $$0, $$0);
   }

   public fnn a(float $$0) {
      return new fnn(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fnn a(float $$0, float $$1, float $$2) {
      return new fnn(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
