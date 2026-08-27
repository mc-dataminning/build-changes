public class cxl extends csv {
   private static final int a = 20;

   public cxl(dfi.d $$0) {
      super($$0);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, biq $$3) {
      if (!$$3.bS() && $$3 instanceof bjg && !cnq.j((bjg)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      cta.b($$1, $$2.c(), $$0);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && $$2.a(csw.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
