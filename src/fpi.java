public class fpi {
   private final fpk a;
   private final fpj b;

   private fpi(fpk $$0, fpj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fpc a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fpi a(fpk $$0, int $$1, int $$2) {
      return new fpi($$0, new fpj($$1, $$2));
   }
}
