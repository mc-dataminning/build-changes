import java.util.List;

public class cex extends cfu {
   public cex(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      if (!$$3.a(cpo.co) && !$$3.a(cpo.F)) {
         return bdx.e;
      } else {
         gu $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bdx.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bfj> $$8 = $$1.a_(null, new eed($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bdx.e;
            } else {
               if ($$1 instanceof aif) {
                  bua $$9 = new bua($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dgl.t, $$4);
                  dfn $$10 = ((aif)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bdx.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cfz $$0) {
      return true;
   }
}
