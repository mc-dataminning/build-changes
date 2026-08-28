import java.util.List;

public class cus extends cvn {
   public cus(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      if (!$$3.a(dho.co) && !$$3.a(dho.F)) {
         return brs.d;
      } else {
         jf $$4 = $$2.d();
         if (!$$1.u($$4)) {
            return brs.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<btr> $$8 = $$1.a_(null, new eyr($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return brs.d;
            } else {
               if ($$1 instanceof arj) {
                  ciz $$9 = new ciz($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dzp.t, $$4);
                  dyr $$10 = ((arj)$$1).D();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return brs.a;
            }
         }
      }
   }
}
