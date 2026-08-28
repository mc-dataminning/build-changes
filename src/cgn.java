public abstract class cgn extends cht implements cgt {
   private static final akl<Boolean> b = akp.a(cgn.class, akn.k);

   public cgn(bul<? extends cgn> $$0, dfb $$1) {
      super($$0, $$1);
      this.bP = new cgn.a(this);
   }

   public static bwh.a q() {
      return bvc.E().a(bwi.s, 3.0);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.an();
   }

   @Override
   public int aj() {
      return 8;
   }

   @Override
   protected void a(akp.a $$0) {
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
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new ccr(this, 1.25));
      this.bS.a(2, new cbf<>(this, com.class, 8.0F, 1.6, 1.4, buj.f::test));
      this.bS.a(4, new cgn.b(this));
   }

   @Override
   protected cem b(dfb $$0) {
      return new ceo(this, $$0);
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj() && this.bk()) {
         this.a(0.01F, $$0);
         this.a(bve.a, this.dA());
         this.h(this.dA().c(0.9));
         if (this.m() == null) {
            this.h(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bk() && this.aK() && this.R) {
         this.h(this.dA().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.as = true;
         this.b(this.gv());
      }

      super.n_();
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      return cgt.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void k(cwb $$0) {
      cgt.a(this, $$0);
   }

   @Override
   public void h(uk $$0) {
      cgt.a(this, $$0);
   }

   @Override
   public awk y() {
      return awl.dk;
   }

   protected boolean gu() {
      return true;
   }

   protected abstract awk gv();

   @Override
   protected awk aW() {
      return awl.iW;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
   }

   static class a extends cbb {
      private final cgn l;

      a(cgn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(axg.a)) {
            this.l.h(this.l.dA().b(0.0, 0.005, 0.0));
         }

         if (this.k == cbb.a.b && !this.l.P().m()) {
            float $$0 = (float)(this.h * this.l.h(bwi.v));
            this.l.C(azk.h(0.125F, this.l.fr(), $$0));
            double $$1 = this.e - this.l.dC();
            double $$2 = this.f - this.l.dE();
            double $$3 = this.g - this.l.dI();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dA().b(0.0, (double)this.l.fr() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(azk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dN(), $$5, 90.0F));
               this.l.aX = this.l.dN();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends ccw {
      private final cgn i;

      public b(cgn $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gu() && super.b();
      }
   }
}
