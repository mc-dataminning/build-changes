public class fib {
   public static final fib a = new fib(0.0F);
   final float b;
   final float c;
   final float d;

   public fib(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fib(float $$0) {
      this($$0, $$0, $$0);
   }

   public fib a(float $$0) {
      return new fib(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fib a(float $$0, float $$1, float $$2) {
      return new fib(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
