public class ddf extends dcl implements ddn {
   private final dct a = new dct();
   private final dcy b = new dcy() {
      @Override
      protected void a(cpl $$0, gu $$1, dez $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aow.gS, aox.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cpl $$0, gu $$1, dez $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aow.gR, aox.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cpl $$0, gu $$1, dez $$2, int $$3, int $$4) {
         $$0.a(ddf.this.p, csm.fG, 1, $$4);
      }

      @Override
      protected boolean a(cbm $$0) {
         return $$0.gd().b(ddf.this);
      }
   };

   public ddf(gu $$0, dez $$1) {
      super(dcn.d, $$0, $$1);
   }

   public static void a(cpl $$0, gu $$1, dez $$2, ddf $$3) {
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

   public void a(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cbm $$0) {
      return bgj.a(this, $$0);
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
