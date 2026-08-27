public class eqe extends ghe {
   private final fah a;
   private final eqe.a b;
   private evf c = evf.a;

   public eqe(epn $$0, fah $$1) {
      super(esj.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eqe(ur $$0, fah $$1) {
      super(esj.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eqe(ur $$0, ur $$1, fah $$2) {
      super(esj.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eqe.a a(epn $$0) {
      eoc $$1 = $$0.a;
      return a(ur.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eqe.a a(ur $$0) {
      return a(ur.c("mco.errorMessage.generic"), $$0);
   }

   private static eqe.a a(ur $$0, ur $$1) {
      return new eqe.a($$0, $$1);
   }

   @Override
   public void aO_() {
      this.d(eum.a(uq.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = evf.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public ur h() {
      return ur.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(ur a, ur b) {
   }
}
