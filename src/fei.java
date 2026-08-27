public class fei {
   public static final fei a = new fei(0.0F);
   final float b;
   final float c;
   final float d;

   public fei(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fei(float $$0) {
      this($$0, $$0, $$0);
   }

   public fei a(float $$0) {
      return new fei(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fei a(float $$0, float $$1, float $$2) {
      return new fei(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
