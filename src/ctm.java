import java.util.List;

public class ctm extends cui {
   public ctm(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if (!$$3.a(dez.co) && !$$3.a(dez.F)) {
         return bqs.f;
      } else {
         iz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqs.f;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bss> $$8 = $$1.a_(null, new evk($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqs.f;
            } else {
               if ($$1 instanceof are) {
                  chy $$9 = new chy($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dwt.t, $$4);
                  dvv $$10 = ((are)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqs.a($$1.B);
            }
         }
      }
   }
}
