public class czu extends cwe {
   public czu(dfd.d $$0) {
      super($$0);
   }

   @Override
   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      if ($$3.bT()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ag().k());
      }
   }

   @Override
   public void a(cow $$0, bil $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bil $$0) {
      ehi $$1 = $$0.dn();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bjb ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
      double $$4 = Math.abs($$3.dn().d);
      if ($$4 < 0.1 && !$$3.bS()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.f($$3.dn().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
