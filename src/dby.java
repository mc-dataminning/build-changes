public class dby extends ctf {
   protected static final eii a = csx.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   protected dby(dfk.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aks && $$3 instanceof cdp) {
         $$1.a(new gw($$2), true, $$3);
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      eao $$3 = $$1.b_($$2);
      eao $$4 = $$1.b_($$2.c());
      return ($$3.a() == eap.c || $$0.b() instanceof cws) && $$4.a() == eap.a;
   }
}
