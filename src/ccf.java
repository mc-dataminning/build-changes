public abstract class ccf extends cdk implements cck {
   private static final aja<Boolean> b = aje.a(ccf.class, ajc.k);

   public ccf(bqg<? extends ccf> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new ccf.a(this);
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 3.0);
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
   protected void a(aje.a $$0) {
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
   public void b(to $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.u());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new byj(this, 1.25));
      this.bR.a(2, new bwx<>(this, cka.class, 8.0F, 1.6, 1.4, bqf.f::test));
      this.bR.a(4, new ccf.b(this));
   }

   @Override
   protected cae b(czg $$0) {
      return new cag(this, $$0);
   }

   @Override
   public void a(esj $$0) {
      if (this.cY() && this.bc()) {
         this.a(0.01F, $$0);
         this.a(bqy.a, this.dp());
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
   protected bof b(cka $$0, boe $$1) {
      return cck.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(crs $$0) {
      cck.a(this, $$0);
   }

   @Override
   public void c(to $$0) {
      cck.a(this, $$0);
   }

   @Override
   public aun y() {
      return auo.dk;
   }

   protected boolean gn() {
      return true;
   }

   protected abstract aun go();

   @Override
   protected aun aN() {
      return auo.iQ;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
   }

   static class a extends bwt {
      private final ccf l;

      a(ccf $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(avj.a)) {
            this.l.g(this.l.dp().b(0.0, 0.005, 0.0));
         }

         if (this.k == bwt.a.b && !this.l.K().l()) {
            float $$0 = (float)(this.h * this.l.g(bsa.r));
            this.l.y(axm.i(0.125F, this.l.fk(), $$0));
            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dp().b(0.0, (double)this.l.fk() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(axm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dC(), $$5, 90.0F));
               this.l.aX = this.l.dC();
            }
         } else {
            this.l.y(0.0F);
         }
      }
   }

   static class b extends byo {
      private final ccf i;

      public b(ccf $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() && super.a();
      }
   }
}
