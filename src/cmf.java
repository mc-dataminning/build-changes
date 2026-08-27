import java.util.List;

public class cmf extends cnb {
   public cmf(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if (!$$3.a(cxa.co) && !$$3.a(cxa.F)) {
         return bkc.e;
      } else {
         hx $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bkc.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<blw> $$8 = $$1.a_(null, new elx($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bkc.e;
            } else {
               if ($$1 instanceof ane) {
                  cau $$9 = new cau($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dnz.t, $$4);
                  dnb $$10 = ((ane)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bkc.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cng $$0) {
      return true;
   }
}
