public class fiy extends hkx {
   private final fuk a;
   private final fiy.a b;
   private fpl c = fpl.a;

   public fiy(fig $$0, fuk $$1) {
      super(fla.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fiy(wo $$0, fuk $$1) {
      super(fla.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fiy(wo $$0, wo $$1, fuk $$2) {
      super(fla.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fiy.a a(fig $$0) {
      fgm $$1 = $$0.a;
      return a(wo.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fiy.a a(wo $$0) {
      return a(wo.c("mco.errorMessage.generic"), $$0);
   }

   private static fiy.a a(wo $$0, wo $$1) {
      return new fiy.a($$0, $$1);
   }

   @Override
   public void aR_() {
      this.c(fos.a(wn.h, $$0 -> this.aO_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fpl.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   @Override
   public wo i() {
      return wo.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wo a, wo b) {
   }
}
