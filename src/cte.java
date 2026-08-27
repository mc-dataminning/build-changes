import java.util.List;

public class cte extends cuc {
   public cte(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if (!$$3.a(dfe.cZ) && !$$3.a(dfe.ak)) {
         return bqa.e;
      } else {
         ir $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return bqa.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<brv> $$8 = $$1.a_(null, new ewp($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bqa.e;
            } else {
               if ($$1 instanceof aqt) {
                  cgz $$9 = new cgz($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dxv.t, $$4);
                  dwx $$10 = ((aqt)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bqa.a($$1.C);
            }
         }
      }
   }
}
