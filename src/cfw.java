public abstract class cfw extends chc implements cgc {
   private static final akg<Boolean> b = akk.a(cfw.class, aki.k);

   public cfw(btv<? extends cfw> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cfw.a(this);
   }

   public static bvq.a q() {
      return bum.E().a(bvr.s, 3.0);
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
   public int fS() {
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
      this.bS.a(0, new cca(this, 1.25));
      this.bS.a(2, new cao<>(this, cnu.class, 8.0F, 1.6, 1.4, btt.f::test));
      this.bS.a(4, new cfw.b(this));
   }

   @Override
   protected cdv b(deg $$0) {
      return new cdx(this, $$0);
   }

   @Override
   public void a_(eys $$0) {
      if (this.de() && this.bi()) {
         this.a(0.01F, $$0);
         this.a(buo.a, this.dv());
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
         this.b(this.gq());
      }

      super.m_();
   }

   @Override
   protected brp b(cnu $$0, bro $$1) {
      return cgc.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void m(cvp $$0) {
      cgc.a(this, $$0);
   }

   @Override
   public void h(uf $$0) {
      cgc.a(this, $$0);
   }

   @Override
   public awd y() {
      return awe.dk;
   }

   protected boolean gp() {
      return true;
   }

   protected abstract awd gq();

   @Override
   protected awd aT() {
      return awe.iW;
   }

   @Override
   protected void b(je $$0, duo $$1) {
   }

   static class a extends cak {
      private final cfw l;

      a(cfw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awz.a)) {
            this.l.h(this.l.dv().b(0.0, 0.005, 0.0));
         }

         if (this.k == cak.a.b && !this.l.P().m()) {
            float $$0 = (float)(this.h * this.l.h(bvr.v));
            this.l.C(azd.h(0.125F, this.l.fm(), $$0));
            double $$1 = this.e - this.l.dx();
            double $$2 = this.f - this.l.dz();
            double $$3 = this.g - this.l.dD();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dv().b(0.0, (double)this.l.fm() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azd.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.a(this.l.dI(), $$5, 90.0F));
               this.l.aT = this.l.dI();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends ccf {
      private final cfw i;

      public b(cfw $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gp() && super.b();
      }
   }
}
