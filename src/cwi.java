import java.util.List;

public class cwi extends cxc {
   public cwi(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      if (!$$3.a(dkf.cv) && !$$3.a(dkf.I)) {
         return bta.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bta.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bvb> $$8 = $$1.a_(null, new fbm($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bta.d;
            } else {
               if ($$1 instanceof arx) {
                  ckk $$9 = new ckk($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eck.t, $$4);
                  ebm $$10 = ((arx)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bta.a;
            }
         }
      }
   }
}
