public abstract class cfr extends cgx implements cfx {
   private static final akg<Boolean> b = akk.a(cfr.class, aki.k);

   public cfr(btq<? extends cfr> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cfr.a(this);
   }

   public static bvl.a q() {
      return buh.E().a(bvm.s, 3.0);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ak();
   }

   @Override
   public int fR() {
      return 8;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean t() {
      return this.am.a(b);
   }

   @Override
   public void x(boolean $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new cbv(this, 1.25));
      this.bT.a(2, new caj<>(this, cnp.class, 8.0F, 1.6, 1.4, bto.f::test));
      this.bT.a(4, new cfr.b(this));
   }

   @Override
   protected cdq b(dds $$0) {
      return new cds(this, $$0);
   }

   @Override
   public void a_(eye $$0) {
      if (this.de() && this.bi()) {
         this.a(0.01F, $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
         if (this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void m_() {
      if (!this.bi() && this.aH() && this.R) {
         this.h(this.dv().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.as = true;
         this.b(this.gp());
      }

      super.m_();
   }

   @Override
   protected brk b(cnp $$0, brj $$1) {
      return cfx.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void o(cvl $$0) {
      cfx.a(this, $$0);
   }

   @Override
   public void h(uf $$0) {
      cfx.a(this, $$0);
   }

   @Override
   public awc y() {
      return awd.dk;
   }

   protected boolean go() {
      return true;
   }

   protected abstract awc gp();

   @Override
   protected awc aT() {
      return awd.iW;
   }

   @Override
   protected void b(je $$0, dua $$1) {
   }

   static class a extends caf {
      private final cfr l;

      a(cfr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awy.a)) {
            this.l.h(this.l.dv().b(0.0, 0.005, 0.0));
         }

         if (this.k == caf.a.b && !this.l.P().m()) {
            float $$0 = (float)(this.h * this.l.h(bvm.v));
            this.l.C(azc.h(0.125F, this.l.fm(), $$0));
            double $$1 = this.e - this.l.dx();
            double $$2 = this.f - this.l.dz();
            double $$3 = this.g - this.l.dD();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dv().b(0.0, (double)this.l.fm() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azc.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.a(this.l.dI(), $$5, 90.0F));
               this.l.aU = this.l.dI();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cca {
      private final cfr i;

      public b(cfr $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.go() && super.b();
      }
   }
}
