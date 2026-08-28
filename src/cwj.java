import java.util.List;

public class cwj extends cxd {
   public cwj(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      if (!$$3.a(dkg.cv) && !$$3.a(dkg.I)) {
         return bsy.d;
      } else {
         ji $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bsy.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bva> $$8 = $$1.a_(null, new fbs($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bsy.d;
            } else {
               if ($$1 instanceof ard) {
                  cko $$9 = new cko($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ecp.t, $$4);
                  ebp $$10 = ((ard)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bsy.a;
            }
         }
      }
   }
}
