public class dpb extends dog implements dpj {
   private final doo a = new doo();
   private final dot b = new dot() {
      @Override
      protected void a(dax $$0, io $$1, drb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.hZ, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dax $$0, io $$1, drb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, avh.hY, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dax $$0, io $$1, drb $$2, int $$3, int $$4) {
         $$0.a(dpb.this.o, dea.fG, 1, $$4);
      }

      @Override
      protected boolean a(clw $$0) {
         return $$0.gp().b(dpb.this);
      }
   };

   public dpb(io $$0, drb $$1) {
      super(doi.d, $$0, $$1);
   }

   public static void a(dax $$0, io $$1, drb $$2, dpb $$3) {
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

   public void a(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.a($$0, this.i(), this.az_(), this.n());
      }
   }

   public void b(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.b.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public boolean c(clw $$0) {
      return bpn.a(this, $$0);
   }

   public void b() {
      if (!this.p) {
         this.b.c(this.i(), this.az_(), this.n());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
