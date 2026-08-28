public abstract class cfd extends cgi implements cfi {
   private static final akk<Boolean> b = ako.a(cfd.class, akm.k);

   public cfd(btb<? extends cfd> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new cfd.a(this);
   }

   public static bux.a s() {
      return bts.A().a(buy.q, 3.0);
   }

   @Override
   public boolean W() {
      return super.W() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ag();
   }

   @Override
   public int fQ() {
      return 8;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean u() {
      return this.ao.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cbh(this, 1.25));
      this.bS.a(2, new bzv<>(this, cmy.class, 8.0F, 1.6, 1.4, bta.f::test));
      this.bS.a(4, new cfd.b(this));
   }

   @Override
   protected cdc b(dbz $$0) {
      return new cde(this, $$0);
   }

   @Override
   public void a(evs $$0) {
      if (this.db() && this.be()) {
         this.a(0.01F, $$0);
         this.a(btv.a, this.ds());
         this.h(this.ds().a(0.9));
         if (this.p() == null) {
            this.h(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.be() && this.aE() && this.R) {
         this.h(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ah.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.av = true;
         this.b(this.gr());
      }

      super.n_();
   }

   @Override
   protected bqv b(cmy $$0, bqu $$1) {
      return cfi.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuq $$0) {
      cfi.a(this, $$0);
   }

   @Override
   public void c(us $$0) {
      cfi.a(this, $$0);
   }

   @Override
   public avz y() {
      return awa.dk;
   }

   protected boolean gq() {
      return true;
   }

   protected abstract avz gr();

   @Override
   protected avz aP() {
      return awa.iV;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
   }

   static class a extends bzr {
      private final cfd l;

      a(cfd $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awv.a)) {
            this.l.h(this.l.ds().b(0.0, 0.005, 0.0));
         }

         if (this.k == bzr.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(buy.r));
            this.l.y(ayz.i(0.125F, this.l.fn(), $$0));
            double $$1 = this.e - this.l.du();
            double $$2 = this.f - this.l.dw();
            double $$3 = this.g - this.l.dA();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.ds().b(0.0, (double)this.l.fn() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dF(), $$5, 90.0F));
               this.l.aY = this.l.dF();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends cbm {
      private final cfd i;

      public b(cfd $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gq() && super.a();
      }
   }
}
