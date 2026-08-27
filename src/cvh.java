public class cvh extends csk {
   protected static final eii a = csx.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected cvh(dfk.d $$0) {
      super($$0);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dem($$0, $$1);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if ($$1 instanceof aks && $$3.cs() && eif.c(eif.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), eht.i)) {
         aex<cpx> $$4 = $$1.ac() == cpx.j ? cpx.h : cpx.j;
         aks $$5 = ((aks)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return cjh.b;
   }

   @Override
   public boolean a(dfl $$0, ean $$1) {
      return false;
   }
}
