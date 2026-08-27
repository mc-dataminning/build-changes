public class cxq extends csk implements csm {
   public cxq(dex.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      if (!$$0.a_($$1.c()).a((coq)$$0, $$1)) {
         return false;
      } else {
         for (gv $$3 : gv.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(apj.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (gv $$6 : gv.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dey $$7 = $$0.a_($$6);
         if ($$7.a(csl.on)) {
            $$5 = true;
         }

         if ($$7.a(csl.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? csl.on.n() : csl.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, csl.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, csl.ow.n(), 3);
      }
   }
}
