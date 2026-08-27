import java.util.List;

public class chy extends civ {
   public chy(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if (!$$3.a(csr.co) && !$$3.a(csr.F)) {
         return bgt.e;
      } else {
         gw $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bgt.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bil> $$8 = $$1.a_(null, new ehd($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bgt.e;
            } else {
               if ($$1 instanceof akn) {
                  bxb $$9 = new bxb($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), djo.t, $$4);
                  diq $$10 = ((akn)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bgt.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cja $$0) {
      return true;
   }
}
