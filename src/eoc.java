public class eoc extends ged {
   private final exv a;
   private final eoc.a b;
   private etb c = etb.a;

   public eoc(enk $$0, exv $$1) {
      super(eqf.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoc(te $$0, exv $$1) {
      super(eqf.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoc(te $$0, te $$1, exv $$2) {
      super(eqf.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eoc.a a(enk $$0) {
      elz $$1 = $$0.a;
      return a(te.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eoc.a a(te $$0) {
      return a(te.c("mco.errorMessage.generic"), $$0);
   }

   private static eoc.a a(te $$0, te $$1) {
      return new eoc.a($$0, $$1);
   }

   @Override
   public void aE_() {
      this.d(esi.a(td.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = etb.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public te e() {
      return te.h().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -65536);
   }

   static record a(te a, te b) {
   }
}
