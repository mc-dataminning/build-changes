public class cyd extends csx implements csz {
   public cyd(dfk.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      if (!$$0.a_($$1.c()).a((cpd)$$0, $$1)) {
         return false;
      } else {
         for (gw $$3 : gw.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(apu.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gw $$6 : gw.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dfl $$7 = $$0.a_($$6);
         if ($$7.a(csy.on)) {
            $$5 = true;
         }

         if ($$7.a(csy.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? csy.on.n() : csy.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, csy.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, csy.ow.n(), 3);
      }
   }
}
