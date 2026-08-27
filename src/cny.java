public class cny extends cni {
   public cny(coy.a $$0) {
      super($$0);
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if ($$0.B) {
         return blx.a($$3);
      } else {
         if (!$$1.fU().d) {
            $$3.h(1);
         }

         $$1.b(atv.c.b(this));
         $$1.dM().a(null, $$1, atl.zN, $$1.db(), 1.0F, 1.0F);
         cpd $$4 = cpk.a($$0, $$1.dq(), $$1.dw(), (byte)0, true, false);
         if ($$3.b()) {
            return blx.b($$4);
         } else {
            if (!$$1.fT().e($$4.q())) {
               $$1.a($$4, false);
            }

            return blx.b($$3);
         }
      }
   }
}
