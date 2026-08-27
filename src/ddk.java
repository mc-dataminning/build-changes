public class ddk extends dcq implements dds {
   private final dcy a = new dcy();
   private final ddd b = new ddd() {
      @Override
      protected void a(cpq $$0, gw $$1, dfe $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aoz.gS, apa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cpq $$0, gw $$1, dfe $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aoz.gR, apa.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cpq $$0, gw $$1, dfe $$2, int $$3, int $$4) {
         $$0.a(ddk.this.p, csr.fG, 1, $$4);
      }

      @Override
      protected boolean a(cbp $$0) {
         return $$0.gd().b(ddk.this);
      }
   };

   public ddk(gw $$0, dfe $$1) {
      super(dcs.d, $$0, $$1);
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, ddk $$3) {
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

   public void a(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cbp $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cbp $$0) {
      return bgm.a(this, $$0);
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
