import java.util.List;

public class cwq extends cxk {
   public cwq(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      if (!$$3.a(dkn.cv) && !$$3.a(dkn.I)) {
         return bti.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bti.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bvj> $$8 = $$1.a_(null, new fbs($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bti.d;
            } else {
               if ($$1 instanceof ash) {
                  cks $$9 = new cks($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ecq.t, $$4);
                  ebs $$10 = ((ash)$$1).E();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bti.a;
            }
         }
      }
   }
}
