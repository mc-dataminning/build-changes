import java.util.List;

public class cto extends cuk {
   public cto(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if (!$$3.a(dfb.co) && !$$3.a(dfb.F)) {
         return bqu.f;
      } else {
         iz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqu.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bsu> $$8 = $$1.a_(null, new evm($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqu.f;
            } else {
               if ($$1 instanceof arf) {
                  cia $$9 = new cia($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dwv.t, $$4);
                  dvx $$10 = ((arf)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqu.a($$1.B);
            }
         }
      }
   }
}
