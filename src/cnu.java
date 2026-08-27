public class cnu extends cne {
   public cnu(cou.a $$0) {
      super($$0);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      if ($$0.B) {
         return blv.a($$3);
      } else {
         if (!$$1.fU().d) {
            $$3.h(1);
         }

         $$1.b(atu.c.b(this));
         $$1.dM().a(null, $$1, atk.zM, $$1.db(), 1.0F, 1.0F);
         coz $$4 = cpg.a($$0, $$1.dq(), $$1.dw(), (byte)0, true, false);
         if ($$3.b()) {
            return blv.b($$4);
         } else {
            if (!$$1.fT().e($$4.q())) {
               $$1.a($$4, false);
            }

            return blv.b($$3);
         }
      }
   }
}
