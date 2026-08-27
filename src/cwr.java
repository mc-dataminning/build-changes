public class cwr extends ctb {
   public cwr(dca.d $$0) {
      super($$0);
   }

   @Override
   public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
      if ($$3.bR()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cls $$0, bfj $$1) {
      if ($$1.bR()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bfj $$0) {
      eei $$1 = $$0.dl();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bfz ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
      double $$4 = Math.abs($$3.dl().d);
      if ($$4 < 0.1 && !$$3.bQ()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.dl().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
