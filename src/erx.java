public class erx extends gjl {
   private final fcc a;
   private final erx.a b;
   private exa c = exa.a;

   public erx(erg $$0, fcc $$1) {
      super(euc.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public erx(vb $$0, fcc $$1) {
      super(euc.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public erx(vb $$0, vb $$1, fcc $$2) {
      super(euc.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static erx.a a(erg $$0) {
      epv $$1 = $$0.a;
      return a(vb.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static erx.a a(vb $$0) {
      return a(vb.c("mco.errorMessage.generic"), $$0);
   }

   private static erx.a a(vb $$0, vb $$1) {
      return new erx.a($$0, $$1);
   }

   @Override
   public void aP_() {
      this.d(ewh.a(va.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = exa.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public vb h() {
      return vb.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vb a, vb b) {
   }
}
