import java.util.List;

public class clv extends cms {
   public clv(cms.a $$0) {
      super($$0);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if (!$$3.a(cwr.co) && !$$3.a(cwr.F)) {
         return bka.e;
      } else {
         hx $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bka.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<blu> $$8 = $$1.a_(null, new eln($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bka.e;
            } else {
               if ($$1 instanceof and) {
                  cam $$9 = new cam($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dnq.t, $$4);
                  dms $$10 = ((and)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bka.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cmx $$0) {
      return true;
   }
}
