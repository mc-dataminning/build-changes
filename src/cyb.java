public class cyb extends csv implements csx {
   public cyb(dfi.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      if (!$$0.a_($$1.c()).a((cpb)$$0, $$1)) {
         return false;
      } else {
         for (gw $$3 : gw.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aps.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gw $$6 : gw.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dfj $$7 = $$0.a_($$6);
         if ($$7.a(csw.on)) {
            $$5 = true;
         }

         if ($$7.a(csw.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? csw.on.n() : csw.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, csw.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, csw.ow.n(), 3);
      }
   }
}
