import java.util.List;

public class cid extends cja {
   public cid(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if (!$$3.a(csw.co) && !$$3.a(csw.F)) {
         return bgy.e;
      } else {
         gw $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bgy.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<biq> $$8 = $$1.a_(null, new ehi($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bgy.e;
            } else {
               if ($$1 instanceof akq) {
                  bxg $$9 = new bxg($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), djt.t, $$4);
                  div $$10 = ((akq)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bgy.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cjf $$0) {
      return true;
   }
}
