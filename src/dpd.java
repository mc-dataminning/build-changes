public class dpd extends doi implements dpl {
   private final doq a = new doq();
   private final dov b = new dov() {
      @Override
      protected void a(daz $$0, io $$1, drd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avi.hZ, avj.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(daz $$0, io $$1, drd $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avi.hY, avj.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(daz $$0, io $$1, drd $$2, int $$3, int $$4) {
         $$0.a(dpd.this.o, dec.fG, 1, $$4);
      }

      @Override
      protected boolean a(cly $$0) {
         return $$0.gp().b(dpd.this);
      }
   };

   public dpd(io $$0, drd $$1) {
      super(dok.d, $$0, $$1);
   }

   public static void a(daz $$0, io $$1, drd $$2, dpd $$3) {
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

   public void a(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.aA_(), this.n());
      }
   }

   public void b(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.aA_(), this.n());
      }
   }

   public boolean c(cly $$0) {
      return bpp.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.aA_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
