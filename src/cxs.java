public class cxs extends csm implements cso {
   public cxs(dez.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      if (!$$0.a_($$1.c()).a((cos)$$0, $$1)) {
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
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gu $$6 : gu.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dfa $$7 = $$0.a_($$6);
         if ($$7.a(csn.on)) {
            $$5 = true;
         }

         if ($$7.a(csn.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? csn.on.n() : csn.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, csn.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, csn.ow.n(), 3);
      }
   }
}
