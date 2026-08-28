public class cti extends cui implements cvf {
   public cti(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.hN, awa.h, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnw $$4 = new cnw($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dH(), $$1.dF(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(awj.c.b(this));
      $$3.a(1, $$1);
      return bqt.a($$3, $$0.x_());
   }

   @Override
   public cnn a(dbw $$0, js $$1, cun $$2, je $$3) {
      cnw $$4 = new cnw($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }
}
