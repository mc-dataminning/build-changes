import java.util.List;

public class csz extends ctv {
   public csz(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if (!$$3.a(dfh.co) && !$$3.a(dfh.F)) {
         return bqd.f;
      } else {
         ja $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqd.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsd> $$8 = $$1.a_(null, new evu($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqd.f;
            } else {
               if ($$1 instanceof aqk) {
                  chj $$9 = new chj($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dxa.t, $$4);
                  dwc $$10 = ((aqk)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqd.a($$1.B);
            }
         }
      }
   }
}
