public abstract class cjg extends cks implements cjm {
   private static final akl<Boolean> a = akp.a(cjg.class, akn.k);
   private static final boolean b = false;

   public cjg(bxc<? extends cjg> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cjg.a(this);
   }

   public static byz.a j() {
      return bxw.E().a(bza.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && !this.h_();
   }

   @Override
   public int fX() {
      return 8;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean m() {
      return this.al.a(a);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("FromBucket", false));
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cfj(this, 1.25));
      this.bF.a(2, new cdx<>(this, crx.class, 8.0F, 1.6, 1.4, bxa.f::test));
      this.bF.a(4, new cjg.b(this));
   }

   @Override
   protected che b(djx $$0) {
      return new chg(this, $$0);
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(0.01F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void k_() {
      if (!this.bi() && this.aH() && this.Q) {
         this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.t());
      }

      super.k_();
   }

   @Override
   protected bur b(crx $$0, buq $$1) {
      return cjm.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czy $$0) {
      cjm.a(this, $$0);
   }

   @Override
   public void d(tz $$0) {
      cjm.a(this, $$0);
   }

   @Override
   public awo n() {
      return awp.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract awo t();

   @Override
   protected awo aU() {
      return awp.jz;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
   }

   static class a extends cdt {
      private final cjg l;

      a(cjg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axj.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == cdt.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(bza.v));
            this.l.B(azo.h(0.125F, this.l.fo(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fo() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azo.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aV = this.l.dL();
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class b extends cfo {
      private final cjg i;

      public b(cjg $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
