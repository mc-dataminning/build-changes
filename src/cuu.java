public class cuu extends crx {
   protected static final ehy a = csk.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   protected cuu(dex.d $$0) {
      super($$0);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddz($$0, $$1);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$1 instanceof aki && $$3.cs() && ehv.c(ehv.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ehj.i)) {
         aeo<cpk> $$4 = $$1.ac() == cpk.j ? cpk.h : cpk.j;
         aki $$5 = ((aki)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(iw.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return ciw.b;
   }

   @Override
   public boolean a(dey $$0, eaa $$1) {
      return false;
   }
}
