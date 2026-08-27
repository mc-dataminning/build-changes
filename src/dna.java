public class dna extends dmf implements dni {
   private final dmn a = new dmn();
   private final dms b = new dms() {
      @Override
      protected void a(cyx $$0, ib $$1, doz $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aum.hU, aun.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cyx $$0, ib $$1, doz $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aum.hT, aun.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cyx $$0, ib $$1, doz $$2, int $$3, int $$4) {
         $$0.a(dna.this.p, dca.fG, 1, $$4);
      }

      @Override
      protected boolean a(cjt $$0) {
         return $$0.gm().b(dna.this);
      }
   };

   public dna(ib $$0, doz $$1) {
      super(dmh.d, $$0, $$1);
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dna $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   public void b(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   public boolean c(cjt $$0) {
      return bnt.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
