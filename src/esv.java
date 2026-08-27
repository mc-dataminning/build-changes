public class esv extends gkp {
   private final fdb a;
   private final esv.a b;
   private exz c = exz.a;

   public esv(ese $$0, fdb $$1) {
      super(eva.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public esv(vf $$0, fdb $$1) {
      super(eva.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public esv(vf $$0, vf $$1, fdb $$2) {
      super(eva.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static esv.a a(ese $$0) {
      eqt $$1 = $$0.a;
      return a(vf.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static esv.a a(vf $$0) {
      return a(vf.c("mco.errorMessage.generic"), $$0);
   }

   private static esv.a a(vf $$0, vf $$1) {
      return new esv.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.d(exg.a(ve.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = exz.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public vf h() {
      return vf.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vf a, vf b) {
   }
}
