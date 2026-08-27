public class fmv {
   private final fmx a;
   private final fmw b;

   private fmv(fmx $$0, fmw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fmp a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fmv a(fmx $$0, int $$1, int $$2) {
      return new fmv($$0, new fmw($$1, $$2));
   }
}
