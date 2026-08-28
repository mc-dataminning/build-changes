import java.util.List;

public class cyb extends cyu {
   public cyb(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      if (!$$3.a(dmc.cw) && !$$3.a(dmc.I)) {
         return bub.d;
      } else {
         iu $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bub.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwd> $$8 = $$1.a_(null, new fed($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bub.d;
            } else {
               if ($$1 instanceof arq) {
                  clv $$9 = new clv($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eez.t, $$4);
                  edz $$10 = ((arq)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bub.a;
            }
         }
      }
   }
}
