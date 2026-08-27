public abstract class cca extends cdf implements ccf {
   private static final aiy<Boolean> b = ajc.a(cca.class, aja.k);

   public cca(bqb<? extends cca> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new cca.a(this);
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 3.0);
   }

   @Override
   public boolean V() {
      return super.V() || this.u();
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && !this.ae();
   }

   @Override
   public int fO() {
      return 8;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean u() {
      return this.an.a(b);
   }

   @Override
   public void w(boolean $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bye(this, 1.25));
      this.bR.a(2, new bws<>(this, cjt.class, 8.0F, 1.6, 1.4, bqa.f::test));
      this.bR.a(4, new cca.b(this));
   }

   @Override
   protected bzz b(cyx $$0) {
      return new cab(this, $$0);
   }

   @Override
   public void a(esa $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.01F, $$0);
         this.a(bqt.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void n_() {
      if (!this.bc() && this.aC() && this.Q) {
         this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ag.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.au = true;
         this.b(this.go());
      }

      super.n_();
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      return ccf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(crj $$0) {
      ccf.a(this, $$0);
   }

   @Override
   public void c(tm $$0) {
      ccf.a(this, $$0);
   }

   @Override
   public aul y() {
      return aum.dk;
   }

   protected boolean gn() {
      return true;
   }

   protected abstract aul go();

   @Override
   protected aul aN() {
      return aum.iQ;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
   }

   static class a extends bwo {
      private final cca l;

      a(cca $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(avh.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bwo.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(brv.r));
            this.l.y(axk.i(0.125F, this.l.fk(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.fk() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(axk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aX = this.l.dC();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends byj {
      private final cca i;

      public b(cca $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && super.a();
      }
   }
}
