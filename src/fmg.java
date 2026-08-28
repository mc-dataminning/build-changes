public class fmg extends hpb {
   private final fxu a;
   private final fmg.a b;
   private fsv c = fsv.a;

   public fmg(flo $$0, fxu $$1) {
      super(foi.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fmg(wy $$0, fxu $$1) {
      super(foi.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fmg(wy $$0, wy $$1, fxu $$2) {
      super(foi.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fmg.a a(flo $$0) {
      fju $$1 = $$0.a;
      return a(wy.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fmg.a a(wy $$0) {
      return a(wy.c("mco.errorMessage.generic"), $$0);
   }

   private static fmg.a a(wy $$0, wy $$1) {
      return new fmg.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(fsc.a(wx.h, $$0 -> this.aK_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fsv.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aK_() {
      this.m.a(this.a);
   }

   @Override
   public wy i() {
      return wy.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wy a, wy b) {
   }
}
