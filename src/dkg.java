public class dkg extends djl implements dko {
   private final djt a = new djt();
   private final djy b = new djy() {
      @Override
      protected void a(cwe $$0, ib $$1, dme $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atp.hL, atq.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cwe $$0, ib $$1, dme $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atp.hK, atq.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cwe $$0, ib $$1, dme $$2, int $$3, int $$4) {
         $$0.a(dkg.this.p, czh.fG, 1, $$4);
      }

      @Override
      protected boolean a(cia $$0) {
         return $$0.gi().b(dkg.this);
      }
   };

   public dkg(ib $$0, dme $$1) {
      super(djn.d, $$0, $$1);
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dkg $$3) {
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

   public void a(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aD_(), this.n());
      }
   }

   public void b(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aD_(), this.n());
      }
   }

   public boolean c(cia $$0) {
      return bme.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aD_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
