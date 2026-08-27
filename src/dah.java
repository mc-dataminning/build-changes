public class dah extends czn implements dap {
   private final czv a = new czv();
   private final daa b = new daa() {
      @Override
      protected void a(cmm $$0, gu $$1, dcb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, amh.gS, ami.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cmm $$0, gu $$1, dcb $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, amh.gR, ami.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cmm $$0, gu $$1, dcb $$2, int $$3, int $$4) {
         $$0.a(dah.this.p, cpo.fG, 1, $$4);
      }

      @Override
      protected boolean a(byo $$0) {
         return $$0.ga().b(dah.this);
      }
   };

   public dah(gu $$0, dcb $$1) {
      super(czp.d, $$0, $$1);
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, dah $$3) {
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

   public void a(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(byo $$0) {
      return bdq.a(this, $$0);
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
