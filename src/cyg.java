import java.util.List;

public class cyg extends cyz {
   public cyg(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      if (!$$3.a(dmh.cy) && !$$3.a(dmh.I)) {
         return bud.d;
      } else {
         iu $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bud.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwf> $$8 = $$1.a_(null, new fel($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bud.d;
            } else {
               if ($$1 instanceof arq) {
                  clz $$9 = new clz($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), efh.t, $$4);
                  eeh $$10 = ((arq)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bud.a;
            }
         }
      }
   }
}
