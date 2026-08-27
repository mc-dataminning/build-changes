public class dld extends dki implements dll {
   private final dkq a = new dkq();
   private final dkv b = new dkv() {
      @Override
      protected void a(cxb $$0, ib $$1, dnb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aty.hS, atz.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cxb $$0, ib $$1, dnb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aty.hR, atz.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cxb $$0, ib $$1, dnb $$2, int $$3, int $$4) {
         $$0.a(dld.this.p, dae.fG, 1, $$4);
      }

      @Override
      protected boolean a(ciu $$0) {
         return $$0.gm().b(dld.this);
      }
   };

   public dld(ib $$0, dnb $$1) {
      super(dkk.d, $$0, $$1);
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dld $$3) {
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

   public void a(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.a($$0, this.i(), this.aC_(), this.n());
      }
   }

   public void b(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.b.b($$0, this.i(), this.aC_(), this.n());
      }
   }

   public boolean c(ciu $$0) {
      return bmw.a(this, $$0);
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
