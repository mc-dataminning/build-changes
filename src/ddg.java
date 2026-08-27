public class ddg extends dcm implements ddo {
   private final dcu a = new dcu();
   private final dcz b = new dcz() {
      @Override
      protected void a(cpm $$0, gu $$1, dfa $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aow.gS, aox.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(cpm $$0, gu $$1, dfa $$2) {
         $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aow.gR, aox.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(cpm $$0, gu $$1, dfa $$2, int $$3, int $$4) {
         $$0.a(ddg.this.p, csn.fG, 1, $$4);
      }

      @Override
      protected boolean a(cbn $$0) {
         return $$0.gd().b(ddg.this);
      }
   };

   public ddg(gu $$0, dfa $$1) {
      super(dco.d, $$0, $$1);
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, ddg $$3) {
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

   public void a(cbn $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.a($$0, this.k(), this.p(), this.q());
      }
   }

   public void b(cbn $$0) {
      if (!this.q && !$$0.G_()) {
         this.b.b($$0, this.k(), this.p(), this.q());
      }
   }

   public boolean c(cbn $$0) {
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
