public class cin extends cjg {
   public cin(cjg.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cjl $$0) {
      return true;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apg.hz, aph.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cdc $$4 = new cdc($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dD(), $$1.dB(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(apq.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bhf.a($$3, $$0.w_());
   }
}
