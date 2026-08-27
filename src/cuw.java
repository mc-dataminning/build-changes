public class cuw extends crz {
   protected static final ehx a = csm.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected cuw(dez.d $$0) {
      super($$0);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new deb($$0, $$1);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if ($$1 instanceof akk && $$3.cs() && ehu.c(ehu.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ehi.i)) {
         aeq<cpm> $$4 = $$1.ac() == cpm.j ? cpm.h : cpm.j;
         akk $$5 = ((akk)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return ciy.b;
   }

   @Override
   public boolean a(dfa $$0, eac $$1) {
      return false;
   }
}
