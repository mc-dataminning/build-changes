public class djs extends dix implements dka {
   private final djf a = new djf();
   private final djk b = new djk() {
      @Override
      protected void a(cvr $$0, hz $$1, dlj $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atl.hL, atm.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cvr $$0, hz $$1, dlj $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atl.hK, atm.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cvr $$0, hz $$1, dlj $$2, int $$3, int $$4) {
         $$0.a(djs.this.p, cyu.fG, 1, $$4);
      }

      @Override
      protected boolean a(chl $$0) {
         return $$0.gg().b(djs.this);
      }
   };

   public djs(hz $$0, dlj $$1) {
      super(diz.d, $$0, $$1);
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, djs $$3) {
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

   public void a(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   public void b(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   public boolean c(chl $$0) {
      return blp.a(this, $$0);
   }

   public void c() {
      if (!this.q) {
         this.b.c(this.i(), this.aE_(), this.r());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
