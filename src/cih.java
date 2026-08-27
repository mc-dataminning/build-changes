public class cih extends cja {
   public cih(cja.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cjf $$0) {
      return true;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apd.hz, ape.g, 0.5F, 0.4F / ($$0.D_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         ccw $$4 = new ccw($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dD(), $$1.dB(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(apn.c.b(this));
      if (!$$1.fS().d) {
         $$3.h(1);
      }

      return bgz.a($$3, $$0.w_());
   }
}
