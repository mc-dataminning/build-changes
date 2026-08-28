import java.util.List;

public class cvp extends cwj {
   public cvp(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      if (!$$3.a(djm.cv) && !$$3.a(djm.I)) {
         return bsi.d;
      } else {
         ji $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return bsi.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<buj> $$8 = $$1.a_(null, new fat($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bsi.d;
            } else {
               if ($$1 instanceof arc) {
                  cjs $$9 = new cjs($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ebr.t, $$4);
                  eat $$10 = ((arc)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bsi.a;
            }
         }
      }
   }
}
