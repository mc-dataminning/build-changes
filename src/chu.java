import java.util.List;

public class chu extends cir {
   public chu(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if (!$$3.a(csl.co) && !$$3.a(csl.F)) {
         return bgo.e;
      } else {
         gv $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bgo.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<big> $$8 = $$1.a_(null, new eha($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bgo.e;
            } else {
               if ($$1 instanceof aki) {
                  bwx $$9 = new bwx($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), dji.t, $$4);
                  dik $$10 = ((aki)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bgo.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(ciw $$0) {
      return true;
   }
}
