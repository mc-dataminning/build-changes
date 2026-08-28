public abstract class cjr extends cld implements cjx {
   private static final aku<Boolean> a = aky.a(cjr.class, akw.k);
   private static final boolean b = false;

   public cjr(bxn<? extends cjr> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new cjr.a(this);
   }

   public static bzk.a j() {
      return byh.E().a(bzl.s, 3.0);
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
   protected void a(aky.a $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("FromBucket", false));
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cfu(this, 1.25));
      this.bF.a(2, new cei<>(this, csi.class, 8.0F, 1.6, 1.4, bxl.f::test));
      this.bF.a(4, new cjr.b(this));
   }

   @Override
   protected chp b(dkj $$0) {
      return new chr(this, $$0);
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(0.01F, $$0);
         this.a(byj.a, this.dy());
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
   protected bvc b(csi $$0, bvb $$1) {
      return cjx.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(dak $$0) {
      cjx.a(this, $$0);
   }

   @Override
   public void d(ua $$0) {
      cjx.a(this, $$0);
   }

   @Override
   public awx n() {
      return awy.dl;
   }

   protected boolean q() {
      return true;
   }

   protected abstract awx t();

   @Override
   protected awx aU() {
      return awy.jz;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
   }

   static class a extends cee {
      private final cjr l;

      a(cjr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axs.a)) {
            this.l.i(this.l.dy().b(0.0, 0.005, 0.0));
         }

         if (this.k == cee.a.b && !this.l.O().k()) {
            float $$0 = (float)(this.h * this.l.h(bzl.v));
            this.l.B(azz.h(0.125F, this.l.fo(), $$0));
            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dy().b(0.0, (double)this.l.fo() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.w(this.b(this.l.dL(), $$5, 90.0F));
               this.l.aV = this.l.dL();
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class b extends cfz {
      private final cjr i;

      public b(cjr $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.q() && super.b();
      }
   }
}
