public class cpi extends cou {
   public cpi(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      if ($$0.B) {
         return bne.a($$3);
      } else {
         $$3.a(1, $$1);
         $$1.b(aui.c.b(this));
         $$1.dM().a(null, $$1, aty.zV, $$1.db(), 1.0F, 1.0F);
         cqm $$4 = cqt.a($$0, $$1.dq(), $$1.dw(), (byte)0, true, false);
         if ($$3.b()) {
            return bne.b($$4);
         } else {
            if (!$$1.fZ().e($$4.q())) {
               $$1.a($$4, false);
            }

            return bne.b($$3);
         }
      }
   }
}
