import java.util.List;

public class czb extends czu {
   public czb(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      if (!$$3.a(dne.cy) && !$$3.a(dne.I)) {
         return bur.d;
      } else {
         iv $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bur.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwt> $$8 = $$1.a_(null, new ffl($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bur.d;
            } else {
               if ($$1 instanceof ars) {
                  cmu $$9 = new cmu($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), ege.t, $$4);
                  efe $$10 = ((ars)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bur.a;
            }
         }
      }
   }
}
