public class cvf extends csi {
   protected static final eig a = csv.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected cvf(dfi.d $$0) {
      super($$0);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dek($$0, $$1);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$1 instanceof akr && $$3.ct() && eid.c(eid.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ehr.i)) {
         aew<cpv> $$4 = $$1.ac() == cpv.j ? cpv.h : cpv.j;
         akr $$5 = ((akr)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return cjf.b;
   }

   @Override
   public boolean a(dfj $$0, eal $$1) {
      return false;
   }
}
