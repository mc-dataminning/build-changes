public class ckd extends ckw {
   public ckd(ckw.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(clb $$0) {
      return true;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqn.hD, aqo.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         ceo $$4 = new ceo($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dD(), $$1.dB(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(aqx.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bir.a($$3, $$0.x_());
   }
}
