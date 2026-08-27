public class dlb extends dkg implements dlj {
   private final dko a = new dko();
   private final dkt b = new dkt() {
      @Override
      protected void a(cwz $$0, ib $$1, dmz $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aty.hO, atz.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cwz $$0, ib $$1, dmz $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aty.hN, atz.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cwz $$0, ib $$1, dmz $$2, int $$3, int $$4) {
         $$0.a(dlb.this.p, dac.fG, 1, $$4);
      }

      @Override
      protected boolean a(cis $$0) {
         return $$0.gm().b(dlb.this);
      }
   };

   public dlb(ib $$0, dmz $$1) {
      super(dki.d, $$0, $$1);
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dlb $$3) {
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

   public void a(cis $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.i(), this.aC_(), this.n());
      }
   }

   public void b(cis $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.i(), this.aC_(), this.n());
      }
   }

   public boolean c(cis $$0) {
      return bmv.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aC_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
