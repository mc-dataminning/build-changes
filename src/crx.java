public class crx extends cpa {
   protected static final efb a = cpn.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected crx(dca.d $$0) {
      super($$0);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dbc($$0, $$1);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if ($$1 instanceof aif && $$3.cq() && eey.c(eey.a($$3.cE().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), eem.i)) {
         acp<cmm> $$4 = $$1.ac() == cmm.j ? cmm.h : cmm.j;
         aif $$5 = ((aif)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return cfz.b;
   }

   @Override
   public boolean a(dcb $$0, dxd $$1) {
      return false;
   }
}
