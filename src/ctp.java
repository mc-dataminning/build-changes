import java.util.List;

public class ctp extends cul {
   public ctp(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if (!$$3.a(dga.co) && !$$3.a(dga.F)) {
         return bqr.f;
      } else {
         jd $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bqr.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsr> $$8 = $$1.a_(null, new ewv($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqr.f;
            } else {
               if ($$1 instanceof aqu) {
                  chz $$9 = new chz($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dxz.t, $$4);
                  dxb $$10 = ((aqu)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqr.a($$1.B);
            }
         }
      }
   }
}
