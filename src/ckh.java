import java.util.List;

public class ckh extends cle {
   public ckh(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if (!$$3.a(cvc.co) && !$$3.a(cvc.F)) {
         return bix.e;
      } else {
         ht $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bix.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bkq> $$8 = $$1.a_(null, new ejp($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bix.e;
            } else {
               if ($$1 instanceof ame) {
                  bzg $$9 = new bzg($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dls.t, $$4);
                  dku $$10 = ((ame)$$1).C();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bix.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(clj $$0) {
      return true;
   }
}
