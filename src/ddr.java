public class ddr extends dcx implements ddz {
   private final ddf a = new ddf();
   private final ddk b = new ddk() {
      @Override
      protected void a(cpx $$0, gw $$1, dfl $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apf.gS, apg.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cpx $$0, gw $$1, dfl $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, apf.gR, apg.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cpx $$0, gw $$1, dfl $$2, int $$3, int $$4) {
         $$0.a(ddr.this.p, csy.fG, 1, $$4);
      }

      @Override
      protected boolean a(cbw $$0) {
         return $$0.ge().b(ddr.this);
      }
   };

   public ddr(gw $$0, dfl $$1) {
      super(dcz.d, $$0, $$1);
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, ddr $$3) {
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

   public void a(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cbw $$0) {
      if (!this.q && !$$0.M_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cbw $$0) {
      return bgt.a(this, $$0);
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
