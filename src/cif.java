import java.util.List;

public class cif extends cjc {
   public cif(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if (!$$3.a(csy.co) && !$$3.a(csy.F)) {
         return bha.e;
      } else {
         gw $$4 = $$2.c();
         if (!$$1.t($$4)) {
            return bha.e;
         } else {
            double $$5 = (double)$$4.u();
            double $$6 = (double)$$4.v();
            double $$7 = (double)$$4.w();
            List<bis> $$8 = $$1.a_(null, new ehk($$5, $$6, $$7, $$5 + 1.0, $$6 + 2.0, $$7 + 1.0));
            if (!$$8.isEmpty()) {
               return bha.e;
            } else {
               if ($$1 instanceof aks) {
                  bxi $$9 = new bxi($$1, $$5 + 0.5, $$6, $$7 + 0.5);
                  $$9.a(false);
                  $$1.b($$9);
                  $$1.a($$0.o(), djv.t, $$4);
                  dix $$10 = ((aks)$$1).B();
                  if ($$10 != null) {
                     $$10.g();
                  }
               }

               $$0.n().h(1);
               return bha.a($$1.B);
            }
         }
      }
   }

   @Override
   public boolean i(cjh $$0) {
      return true;
   }
}
