public class ddp extends dcv implements ddx {
   private final ddd a = new ddd();
   private final ddi b = new ddi() {
      @Override
      protected void a(cpv $$0, gw $$1, dfj $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apd.gS, ape.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cpv $$0, gw $$1, dfj $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apd.gR, ape.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cpv $$0, gw $$1, dfj $$2, int $$3, int $$4) {
         $$0.a(ddp.this.p, csw.fG, 1, $$4);
      }

      @Override
      protected boolean a(cbu $$0) {
         return $$0.ge().b(ddp.this);
      }
   };

   public ddp(gw $$0, dfj $$1) {
      super(dcx.d, $$0, $$1);
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, ddp $$3) {
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

   public void a(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cbu $$0) {
      if (!this.q && !$$0.M_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cbu $$0) {
      return bgr.a(this, $$0);
   }

   public void c() {
      if (!this.q) {
         this.b.c(this.k(), this.p(), this.q());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
