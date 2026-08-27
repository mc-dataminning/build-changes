public class cie extends cjg {
   public cie(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apg.gG, aph.h, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cda $$4 = new cda($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dD(), $$1.dB(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(apq.c.b(this));
      if (!$$1.fT().d) {
         $$3.h(1);
      }

      return bhf.a($$3, $$0.w_());
   }
}
