public class cut extends cpn implements cpp {
   public cut(dca.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      if (!$$0.a_($$1.c()).a((cls)$$0, $$1)) {
         return false;
      } else {
         for (gu $$4 : gu.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$4).a(amw.aJ)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gu $$6 : gu.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dcb $$7 = $$0.a_($$6);
         if ($$7.a(cpo.on)) {
            $$5 = true;
         }

         if ($$7.a(cpo.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cpo.on.n() : cpo.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, cpo.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, cpo.ow.n(), 3);
      }
   }
}
