public class clc extends ckm {
   public clc(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if ($$0.B) {
         return bjm.a($$3);
      } else {
         if (!$$1.fT().d) {
            $$3.h(1);
         }

         $$1.b(arm.c.b(this));
         $$1.dM().a(null, $$1, arc.zx, $$1.db(), 1.0F, 1.0F);
         cmh $$4 = cmo.a($$0, $$1.dq(), $$1.dw(), (byte)0, true, false);
         if ($$3.b()) {
            return bjm.b($$4);
         } else {
            if (!$$1.fS().e($$4.p())) {
               $$1.a($$4, false);
            }

            return bjm.b($$3);
         }
      }
   }
}
