public class cxw extends csq implements css {
   public cxw(dfd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      if (!$$0.a_($$1.c()).a((cow)$$0, $$1)) {
         return false;
      } else {
         for (gw $$3 : gw.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(apo.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gw $$6 : gw.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dfe $$7 = $$0.a_($$6);
         if ($$7.a(csr.on)) {
            $$5 = true;
         }

         if ($$7.a(csr.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? csr.on.n() : csr.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, csr.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, csr.ow.n(), 3);
      }
   }
}
