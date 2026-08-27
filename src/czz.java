public class czz extends cwj {
   public czz(dfi.d $$0) {
      super($$0);
   }

   @Override
   public void a(cpv $$0, dfj $$1, gw $$2, biq $$3, float $$4) {
      if ($$3.bT()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cpb $$0, biq $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(biq $$0) {
      ehn $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bjg ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, biq $$3) {
      double $$4 = Math.abs($$3.do().d);
      if ($$4 < 0.1 && !$$3.bS()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.do().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
