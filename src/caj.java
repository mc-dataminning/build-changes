public abstract class caj extends cbo implements cao {
   private static final aii<Boolean> b = ail.a(caj.class, aik.k);

   public caj(bol<? extends caj> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new caj.a(this);
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 3.0);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   @Override
   public int fM() {
      return 8;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public boolean w() {
      return this.am.b(b);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bwn(this, 1.25));
      this.bP.a(2, new bvb<>(this, cia.class, 8.0F, 1.6, 1.4, bok.f::test));
      this.bP.a(4, new caj.b(this));
   }

   @Override
   protected byi b(cwe $$0) {
      return new byk(this, $$0);
   }

   @Override
   public void a(eov $$0) {
      if (this.cV() && this.aZ()) {
         this.a(0.01F, $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
         if (this.q() == null) {
            this.g(this.dm().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.aZ() && this.aC() && this.P) {
         this.g(this.dm().b((double)((this.af.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.af.i() * 2.0F - 1.0F) * 0.05F)));
         this.c(false);
         this.at = true;
         this.b(this.gm());
      }

      super.d_();
   }

   @Override
   protected bml b(cia $$0, bmk $$1) {
      return cao.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cpq $$0) {
      cao.a(this, $$0);
   }

   @Override
   public void c(sy $$0) {
      cao.a(this, $$0);
   }

   @Override
   public ato A() {
      return atp.dc;
   }

   protected boolean gl() {
      return true;
   }

   protected abstract ato gm();

   @Override
   protected ato aN() {
      return atp.iH;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
   }

   static class a extends bux {
      private final caj l;

      a(caj $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(auj.a)) {
            this.l.g(this.l.dm().b(0.0, 0.005, 0.0));
         }

         if (this.k == bux.a.b && !this.l.N().l()) {
            float $$0 = (float)(this.h * this.l.g(bqe.o));
            this.l.w(awm.i(0.125F, this.l.fh(), $$0));
            double $$1 = this.e - this.l.do();
            double $$2 = this.f - this.l.dq();
            double $$3 = this.g - this.l.du();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.g(this.l.dm().b(0.0, (double)this.l.fh() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(awm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.r(this.a(this.l.dz(), $$5, 90.0F));
               this.l.aV = this.l.dz();
            }
         } else {
            this.l.w(0.0F);
         }
      }
   }

   static class b extends bws {
      private final caj i;

      public b(caj $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gl() && super.a();
      }
   }
}
