import java.util.List;

public class ctn extends cuj {
   public ctn(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      if (!$$3.a(dfy.co) && !$$3.a(dfy.F)) {
         return bqq.f;
      } else {
         jd $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqq.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsq> $$8 = $$1.a_(null, new ewr($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqq.f;
            } else {
               if ($$1 instanceof aqt) {
                  chx $$9 = new chx($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dxw.t, $$4);
                  dwy $$10 = ((aqt)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqq.a($$1.B);
            }
         }
      }
   }
}
