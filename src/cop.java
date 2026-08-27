import java.util.List;

public class cop extends cpl {
   public cop(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if (!$$3.a(czh.co) && !$$3.a(czh.F)) {
         return bml.e;
      } else {
         ib $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bml.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bof> $$8 = $$1.a_(null, new eoq($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bml.e;
            } else {
               if ($$1 instanceof apa) {
                  cde $$9 = new cde($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dqr.t, $$4);
                  dpt $$10 = ((apa)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bml.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cpq $$0) {
      return true;
   }
}
