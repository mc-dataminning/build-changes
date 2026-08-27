public class fme {
   private final fmg a;
   private final fmf b;

   private fme(fmg $$0, fmf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fly a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fme a(fmg $$0, int $$1, int $$2) {
      return new fme($$0, new fmf($$1, $$2));
   }
}
