public class dvu extends dux implements dwd {
   private final dvf a = new dvf();
   private final dvk b = new dvk() {
      @Override
      protected void a(dhi $$0, jh $$1, dxv $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.it, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dhi $$0, jh $$1, dxv $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, axf.is, axg.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dhi $$0, jh $$1, dxv $$2, int $$3, int $$4) {
         $$0.a(dvu.this.p, dko.fU, 1, $$4);
      }

      @Override
      protected boolean a(cpx $$0) {
         return $$0.gw().b(dvu.this);
      }
   };

   public dvu(jh $$0, dxv $$1) {
      super(duz.d, $$0, $$1);
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dvu $$3) {
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

   public void a(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   public void b(cpx $$0) {
      if (!this.q && !$$0.aa_()) {
         this.b.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   public boolean c(cpx $$0) {
      return btc.a(this, $$0);
   }

   public void b() {
      if (!this.q) {
         this.b.c(this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
