public class cva extends csd {
   protected static final eib a = csq.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected cva(dfd.d $$0) {
      super($$0);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new def($$0, $$1);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$1 instanceof akn && $$3.cs() && ehy.c(ehy.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ehm.i)) {
         aet<cpq> $$4 = $$1.ac() == cpq.j ? cpq.h : cpq.j;
         akn $$5 = ((akn)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return cja.b;
   }

   @Override
   public boolean a(dfe $$0, eag $$1) {
      return false;
   }
}
