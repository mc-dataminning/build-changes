import java.util.List;

public class cvh extends cwb {
   public cvh(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      if (!$$3.a(dil.co) && !$$3.a(dil.F)) {
         return bsh.d;
      } else {
         jh $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bsh.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bui> $$8 = $$1.a_(null, new ezm($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bsh.d;
            } else {
               if ($$1 instanceof arq) {
                  cjr $$9 = new cjr($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eak.t, $$4);
                  dzm $$10 = ((arq)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bsh.a;
            }
         }
      }
   }
}
