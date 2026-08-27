public abstract class ceb extends cfg implements ceg {
   private static final ajy<Boolean> b = akc.a(ceb.class, aka.k);

   public ceb(bsb<? extends ceb> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new ceb.a(this);
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 3.0);
   }

   @Override
   public boolean V() {
      return super.V() || this.t();
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ag();
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean t() {
      return this.as.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.as.a(b, $$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new cae(this, 1.25));
      this.cb.a(2, new bys<>(this, cly.class, 8.0F, 1.6, 1.4, bsa.f::test));
      this.cb.a(4, new ceb.b(this));
   }

   @Override
   protected cbz b(dca $$0) {
      return new ccb(this, $$0);
   }

   @Override
   public void a(ewu $$0) {
      if (this.dg() && this.bi()) {
         this.a(0.01F, $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
         if (this.p() == null) {
            this.g(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      if (!this.bi() && this.aE() && this.S) {
         this.g(this.dx().b((double)((this.al.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.al.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.az = true;
         this.b(this.gz());
      }

      super.m_();
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      return ceg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cuh $$0) {
      ceg.a(this, $$0);
   }

   @Override
   public void c(uk $$0) {
      ceg.a(this, $$0);
   }

   @Override
   public avn x() {
      return avo.dp;
   }

   protected boolean gy() {
      return true;
   }

   protected abstract avn gz();

   @Override
   protected avn aT() {
      return avo.ji;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
   }

   static class a extends byo {
      private final ceb l;

      a(ceb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awj.a)) {
            this.l.g(this.l.dx().b(0.0, 0.005, 0.0));
         }

         if (this.k == byo.a.b && !this.l.J().l()) {
            float $$0 = (float)(this.h * this.l.g(btv.r));
            this.l.y(aym.i(0.125F, this.l.fw(), $$0));
            double $$1 = this.e - this.l.dz();
            double $$2 = this.f - this.l.dB();
            double $$3 = this.g - this.l.dF();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dx().b(0.0, (double)this.l.fw() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aym.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dK(), $$5, 90.0F));
               this.l.bj = this.l.dK();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends caj {
      private final ceb i;

      public b(ceb $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gy() && super.a();
      }
   }
}
