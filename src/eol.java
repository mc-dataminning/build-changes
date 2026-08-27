public class eol extends gfd {
   private final eym a;
   private final eol.a b;
   private etl c = etl.a;

   public eol(enu $$0, eym $$1) {
      super(eqp.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eol(tn $$0, eym $$1) {
      super(eqp.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eol(tn $$0, tn $$1, eym $$2) {
      super(eqp.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eol.a a(enu $$0) {
      emj $$1 = $$0.a;
      return a(tn.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eol.a a(tn $$0) {
      return a(tn.c("mco.errorMessage.generic"), $$0);
   }

   private static eol.a a(tn $$0, tn $$1) {
      return new eol.a($$0, $$1);
   }

   @Override
   public void aH_() {
      this.d(ess.a(tm.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = etl.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public tn g() {
      return tn.h().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -65536);
   }

   static record a(tn a, tn b) {
   }
}
