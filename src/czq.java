public class czq extends cwa {
   public czq(dez.d $$0) {
      super($$0);
   }

   @Override
   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      if ($$3.bT()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cos $$0, bii $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bii $$0) {
      ehe $$1 = $$0.dn();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof biy ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      double $$4 = Math.abs($$3.dn().d);
      if ($$4 < 0.1 && !$$3.bS()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.dn().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
