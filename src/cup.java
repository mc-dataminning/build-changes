import java.util.List;

public class cup extends cvk {
   public cup(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      if (!$$3.a(dhl.co) && !$$3.a(dhl.F)) {
         return brp.d;
      } else {
         je $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return brp.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bto> $$8 = $$1.a_(null, new eyn($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return brp.d;
            } else {
               if ($$1 instanceof arh) {
                  ciw $$9 = new ciw($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dzl.t, $$4);
                  dyn $$10 = ((arh)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return brp.a;
            }
         }
      }
   }
}
