import java.util.List;

public class cxa extends cxu {
   public cxa(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      if (!$$3.a(dkw.cv) && !$$3.a(dkw.I)) {
         return btq.d;
      } else {
         jj $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return btq.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bvs> $$8 = $$1.a_(null, new fcp($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return btq.d;
            } else {
               if ($$1 instanceof arn) {
                  clf $$9 = new clf($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), edm.t, $$4);
                  ecm $$10 = ((arn)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return btq.a;
            }
         }
      }
   }
}
