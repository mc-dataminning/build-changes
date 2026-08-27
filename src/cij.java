import java.util.List;

public class cij extends cjg {
   public cij(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if (!$$3.a(cte.co) && !$$3.a(cte.F)) {
         return bhe.e;
      } else {
         gw $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bhe.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<biw> $$8 = $$1.a_(null, new ehc($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bhe.e;
            } else {
               if ($$1 instanceof akt) {
                  bxm $$9 = new bxm($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), djn.t, $$4);
                  dip $$10 = ((akt)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bhe.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cjl $$0) {
      return true;
   }
}
