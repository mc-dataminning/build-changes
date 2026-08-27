public class dde extends dck implements ddm {
   private final dcs a = new dcs();
   private final dcx b = new dcx() {
      @Override
      protected void a(cpk $$0, gv $$1, dey $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aou.gS, aov.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cpk $$0, gv $$1, dey $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aou.gR, aov.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cpk $$0, gv $$1, dey $$2, int $$3, int $$4) {
         $$0.a(dde.this.p, csl.fG, 1, $$4);
      }

      @Override
      protected boolean a(cbl $$0) {
         return $$0.gd().b(dde.this);
      }
   };

   public dde(gv $$0, dey $$1) {
      super(dcm.d, $$0, $$1);
   }

   public static void a(cpk $$0, gv $$1, dey $$2, dde $$3) {
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

   public void a(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cbl $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cbl $$0) {
      return bgh.a(this, $$0);
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
