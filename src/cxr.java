public class cxr extends csl implements csn {
   public cxr(dey.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      if (!$$0.a_($$1.c()).a((cor)$$0, $$1)) {
         return false;
      } else {
         for (gu $$3 : gu.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(apl.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gu $$6 : gu.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dez $$7 = $$0.a_($$6);
         if ($$7.a(csm.on)) {
            $$5 = true;
         }

         if ($$7.a(csm.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? csm.on.n() : csm.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, csm.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, csm.ow.n(), 3);
      }
   }
}
