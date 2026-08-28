public class foe extends hrc {
   private final fzq a;
   private final foe.a b;
   private fur c = fur.a;

   public foe(fnm $$0, fzq $$1) {
      super(fqh.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public foe(xg $$0, fzq $$1) {
      super(fqh.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public foe(xg $$0, xg $$1, fzq $$2) {
      super(fqh.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static foe.a a(fnm $$0) {
      fls $$1 = $$0.a;
      return a(xg.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static foe.a a(xg $$0) {
      return a(xg.c("mco.errorMessage.generic"), $$0);
   }

   private static foe.a a(xg $$0, xg $$1) {
      return new foe.a($$0, $$1);
   }

   @Override
   public void aT_() {
      this.c(fty.a(xf.h, $$0 -> this.aQ_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fur.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aQ_() {
      this.m.a(this.a);
   }

   @Override
   public xg i() {
      return xg.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xg a, xg b) {
   }
}
