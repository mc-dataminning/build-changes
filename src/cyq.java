import java.util.List;

public class cyq extends czj {
   public cyq(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      if (!$$3.a(dmt.cy) && !$$3.a(dmt.I)) {
         return bug.d;
      } else {
         iv $$4 = $$2.d();
         if (!$$1.v($$4)) {
            return bug.d;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bwi> $$8 = $$1.a_(null, new fex($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bug.d;
            } else {
               if ($$1 instanceof arq) {
                  cmj $$9 = new cmj($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), eft.t, $$4);
                  eet $$10 = ((arq)$$1).F();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bug.a;
            }
         }
      }
   }
}
