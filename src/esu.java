public class esu extends gko {
   private final fda a;
   private final esu.a b;
   private exy c = exy.a;

   public esu(esd $$0, fda $$1) {
      super(euz.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public esu(vf $$0, fda $$1) {
      super(euz.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public esu(vf $$0, vf $$1, fda $$2) {
      super(euz.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static esu.a a(esd $$0) {
      eqs $$1 = $$0.a;
      return a(vf.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static esu.a a(vf $$0) {
      return a(vf.c("mco.errorMessage.generic"), $$0);
   }

   private static esu.a a(vf $$0, vf $$1) {
      return new esu.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.d(exf.a(ve.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = exy.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public vf h() {
      return vf.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vf a, vf b) {
   }
}
