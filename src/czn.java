import java.util.List;

public class czn extends dag {
   public czn(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      if (!$$3.a(dnq.cy) && !$$3.a(dnq.I)) {
         return bvc.d;
      } else {
         iw $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bvc.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bxe> $$8 = $$1.a_(null, new ffx($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bvc.d;
            } else {
               if ($$1 instanceof asb) {
                  cnf $$9 = new cnf($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), egq.t, $$4);
                  efq $$10 = ((asb)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bvc.a;
            }
         }
      }
   }
}
