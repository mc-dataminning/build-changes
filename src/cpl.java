import java.util.List;

public class cpl extends cqh {
   public cpl(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      if (!$$3.a(dae.co) && !$$3.a(dae.F)) {
         return bnd.e;
      } else {
         ib $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bnd.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<box> $$8 = $$1.a_(null, new epo($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bnd.e;
            } else {
               if ($$1 instanceof apf) {
                  cdx $$9 = new cdx($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), drp.t, $$4);
                  dqr $$10 = ((apf)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bnd.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cqm $$0) {
      return true;
   }
}
