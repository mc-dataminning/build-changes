public class esn extends gkc {
   private final fct a;
   private final esn.a b;
   private exr c = exr.a;

   public esn(erw $$0, fct $$1) {
      super(eus.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public esn(vd $$0, fct $$1) {
      super(eus.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public esn(vd $$0, vd $$1, fct $$2) {
      super(eus.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static esn.a a(erw $$0) {
      eql $$1 = $$0.a;
      return a(vd.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static esn.a a(vd $$0) {
      return a(vd.c("mco.errorMessage.generic"), $$0);
   }

   private static esn.a a(vd $$0, vd $$1) {
      return new esn.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.d(ewy.a(vc.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = exr.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public vd h() {
      return vd.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vd a, vd b) {
   }
}
