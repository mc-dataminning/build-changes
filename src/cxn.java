public class cxn extends csx {
   private static final int a = 20;

   public cxn(dfk.d $$0) {
      super($$0);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bis $$3) {
      if (!$$3.bS() && $$3 instanceof bji && !cns.j((bji)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      ctc.b($$1, $$2.c(), $$0);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && $$2.a(csy.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
