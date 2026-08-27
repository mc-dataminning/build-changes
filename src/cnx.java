import java.util.List;

public class cnx extends cou {
   public cnx(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if (!$$3.a(cyq.co) && !$$3.a(cyq.F)) {
         return blu.e;
      } else {
         hz $$4 = $$2.c();
         if (!$$1.u($$4)) {
            return blu.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bno> $$8 = $$1.a_(null, new enn($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return blu.e;
            } else {
               if ($$1 instanceof aov) {
                  ccl $$9 = new ccl($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dpp.t, $$4);
                  dor $$10 = ((aov)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return blu.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(coz $$0) {
      return true;
   }
}
