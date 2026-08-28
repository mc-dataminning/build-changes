public class fnc extends hpw {
   private final fyn a;
   private final fnc.a b;
   private fto c = fto.a;

   public fnc(fmk $$0, fyn $$1) {
      super(fpf.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fnc(wy $$0, fyn $$1) {
      super(fpf.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fnc(wy $$0, wy $$1, fyn $$2) {
      super(fpf.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fnc.a a(fmk $$0) {
      fkq $$1 = $$0.a;
      return a(wy.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fnc.a a(wy $$0) {
      return a(wy.c("mco.errorMessage.generic"), $$0);
   }

   private static fnc.a a(wy $$0, wy $$1) {
      return new fnc.a($$0, $$1);
   }

   @Override
   public void aO_() {
      this.c(fsv.a(wx.h, $$0 -> this.aL_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fto.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aL_() {
      this.m.a(this.a);
   }

   @Override
   public wy i() {
      return wy.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wy a, wy b) {
   }
}
