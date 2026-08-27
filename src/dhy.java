public class dhy extends dhd implements dig {
   private final dhl a = new dhl();
   private final dhq b = new dhq() {
      @Override
      protected void a(ctx $$0, hx $$1, djp $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, art.hK, aru.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(ctx $$0, hx $$1, djp $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, art.hJ, aru.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(ctx $$0, hx $$1, djp $$2, int $$3, int $$4) {
         $$0.a(dhy.this.p, cxa.fG, 1, $$4);
      }

      @Override
      protected boolean a(cfq $$0) {
         return $$0.gf().b(dhy.this);
      }
   };

   public dhy(hx $$0, djp $$1) {
      super(dhf.d, $$0, $$1);
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dhy $$3) {
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

   public void a(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.a($$0, this.i(), this.aE_(), this.r());
      }
   }

   public void b(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.b.b($$0, this.i(), this.aE_(), this.r());
      }
   }

   public boolean c(cfq $$0) {
      return bjv.a(this, $$0);
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
