public class djo extends dit implements djw {
   private final djb a = new djb();
   private final djg b = new djg() {
      @Override
      protected void a(cvn $$0, hz $$1, dlf $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atk.hK, atl.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cvn $$0, hz $$1, dlf $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atk.hJ, atl.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cvn $$0, hz $$1, dlf $$2, int $$3, int $$4) {
         $$0.a(djo.this.p, cyq.fG, 1, $$4);
      }

      @Override
      protected boolean a(chh $$0) {
         return $$0.gg().b(djo.this);
      }
   };

   public djo(hz $$0, dlf $$1) {
      super(div.d, $$0, $$1);
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, djo $$3) {
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

   public void a(chh $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   public void b(chh $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   public boolean c(chh $$0) {
      return bln.a(this, $$0);
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
