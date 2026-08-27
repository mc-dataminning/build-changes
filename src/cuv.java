public class cuv extends cry {
   protected static final ehw a = csl.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected cuv(dey.d $$0) {
      super($$0);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dea($$0, $$1);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if ($$1 instanceof akk && $$3.cs() && eht.c(eht.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ehh.i)) {
         aeq<cpl> $$4 = $$1.ac() == cpl.j ? cpl.h : cpl.j;
         akk $$5 = ((akk)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return cix.b;
   }

   @Override
   public boolean a(dez $$0, eab $$1) {
      return false;
   }
}
