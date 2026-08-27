import java.util.List;

public class cpj extends cqf {
   public cpj(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if (!$$3.a(dac.co) && !$$3.a(dac.F)) {
         return bnc.e;
      } else {
         ib $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bnc.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bow> $$8 = $$1.a_(null, new epm($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bnc.e;
            } else {
               if ($$1 instanceof apf) {
                  cdw $$9 = new cdw($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), drn.t, $$4);
                  dqp $$10 = ((apf)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bnc.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cqk $$0) {
      return true;
   }
}
