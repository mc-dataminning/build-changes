public class cjl extends cke {
   public cjl(cke.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(ckj $$0) {
      return true;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqd.hB, aqe.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cdz $$4 = new cdz($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dD(), $$1.dB(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(aqn.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bic.a($$3, $$0.x_());
   }
}
