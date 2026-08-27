public abstract class cbb extends ccg implements cbg {
   private static final aim<Boolean> b = aiq.a(cbb.class, aio.k);

   public cbb(bpd<? extends cbb> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new cbb.a(this);
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 3.0);
   }

   @Override
   public boolean V() {
      return super.V() || this.s();
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && !this.ae();
   }

   @Override
   public int fO() {
      return 8;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean s() {
      return this.an.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.s());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this, 1.25));
      this.bR.a(2, new bvt<>(this, ciu.class, 8.0F, 1.6, 1.4, bpc.f::test));
      this.bR.a(4, new cbb.b(this));
   }

   @Override
   protected bza b(cxb $$0) {
      return new bzc(this, $$0);
   }

   @Override
   public void a(ept $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.01F, $$0);
         this.a(bpu.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void m_() {
      if (!this.bc() && this.aC() && this.Q) {
         this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.b(this.go());
      }

      super.m_();
   }

   @Override
   protected bnd b(ciu $$0, bnc $$1) {
      return cbg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cqm $$0) {
      cbg.a(this, $$0);
   }

   @Override
   public void c(ta $$0) {
      cbg.a(this, $$0);
   }

   @Override
   public atx y() {
      return aty.dj;
   }

   protected boolean gn() {
      return true;
   }

   protected abstract atx go();

   @Override
   protected atx aN() {
      return aty.iO;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
   }

   static class a extends bvp {
      private final cbb l;

      a(cbb $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(aus.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bvp.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(bqw.r));
            this.l.y(aww.i(0.125F, this.l.fk(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.fk() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(aww.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aX = this.l.dC();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends bxk {
      private final cbb i;

      public b(cbb $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && super.a();
      }
   }
}
