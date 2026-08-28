import java.util.List;

public class cwm extends cxg {
   public cwm(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      if (!$$3.a(dkg.cv) && !$$3.a(dkg.I)) {
         return bte.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bte.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bvf> $$8 = $$1.a_(null, new fbn($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bte.d;
            } else {
               if ($$1 instanceof ash) {
                  cko $$9 = new cko($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ecj.t, $$4);
                  ebl $$10 = ((ash)$$1).E();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bte.a;
            }
         }
      }
   }
}
