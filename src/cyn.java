import java.util.List;

public class cyn extends czg {
   public cyn(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      if (!$$3.a(dmo.cy) && !$$3.a(dmo.I)) {
         return bug.d;
      } else {
         iv $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bug.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwi> $$8 = $$1.a_(null, new fes($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bug.d;
            } else {
               if ($$1 instanceof arq) {
                  cmg $$9 = new cmg($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), efo.t, $$4);
                  eeo $$10 = ((arq)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bug.a;
            }
         }
      }
   }
}
