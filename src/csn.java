import java.util.List;

public class csn extends ctj {
   public csn(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if (!$$3.a(dea.co) && !$$3.a(dea.F)) {
         return bpu.e;
      } else {
         io $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bpu.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bru> $$8 = $$1.a_(null, new euf($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bpu.e;
            } else {
               if ($$1 instanceof aqm) {
                  cgz $$9 = new cgz($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dvu.t, $$4);
                  duw $$10 = ((aqm)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bpu.a($$1.B);
            }
         }
      }
   }
}
