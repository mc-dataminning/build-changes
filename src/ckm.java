import java.util.List;

public class ckm extends clj {
   public ckm(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if (!$$3.a(cvh.co) && !$$3.a(cvh.F)) {
         return bjb.e;
      } else {
         hx $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bjb.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bkv> $$8 = $$1.a_(null, new eju($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bjb.e;
            } else {
               if ($$1 instanceof ami) {
                  bzl $$9 = new bzl($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dlx.t, $$4);
                  dkz $$10 = ((ami)$$1).C();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bjb.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(clo $$0) {
      return true;
   }
}
