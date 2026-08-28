import java.util.List;

public class cwr extends cxl {
   public cwr(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      if (!$$3.a(dko.cv) && !$$3.a(dko.I)) {
         return btj.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return btj.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bvk> $$8 = $$1.a_(null, new fbt($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return btj.d;
            } else {
               if ($$1 instanceof ash) {
                  ckt $$9 = new ckt($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ecr.t, $$4);
                  ebt $$10 = ((ash)$$1).E();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return btj.a;
            }
         }
      }
   }
}
