import javax.annotation.Nullable;

public class cfw extends cgi implements cgc {
   private static final int e = 4;
   private static final int bX = 3;
   private static final int bY = 3;
   private int bZ;
   private final epr[][] ca;

   public cfw(bpc<? extends cfw> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.ca = new epr[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.ca[0][$$2] = epr.b;
         this.ca[1][$$2] = epr.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new cgi.b());
      this.bR.a(4, new cfw.b());
      this.bR.a(5, new cfw.a());
      this.bR.a(6, new bxl<>(this, 0.5, 20, 15.0F));
      this.bR.a(8, new bxi(this, 0.6));
      this.bR.a(9, new bwt(this, cis.class, 3.0F, 1.0F));
      this.bR.a(10, new bwt(this, bpq.class, 8.0F));
      this.bS.a(1, new byd(this, cke.class).a());
      this.bS.a(2, new bye<>(this, cis.class, true).c(300));
      this.bS.a(3, new bye<>(this, cia.class, false).c(300));
      this.bS.a(3, new bye<>(this, cbp.class, false).c(300));
   }

   public static bqu.a s() {
      return cfy.gt().a(bqv.r, 0.5).a(bqv.k, 18.0).a(bqv.q, 32.0);
   }

   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      this.a(bpd.a, new cqk(cqn.ot));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public epm h_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dM().B && this.ce()) {
         this.bZ--;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.aN == 1 || this.ah % 1200 == 0) {
            this.bZ = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.ca[0][$$2] = this.ca[1][$$2];
               this.ca[1][$$2] = new epr(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(kc.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), aty.mN, this.db(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bZ = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.ca[0][$$4] = this.ca[1][$$4];
               this.ca[1][$$4] = new epr(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public atx ae_() {
      return aty.mJ;
   }

   public epr[] G(float $$0) {
      if (this.bZ <= 0) {
         return this.ca[1];
      } else {
         double $$1 = (double)(((float)this.bZ - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         epr[] $$2 = new epr[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.ca[1][$$3].a(1.0 - $$1).e(this.ca[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected atx v() {
      return aty.mJ;
   }

   @Override
   protected atx n_() {
      return aty.mL;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.mM;
   }

   @Override
   protected atx gn() {
      return aty.mK;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bpo $$0, float $$1) {
      cqk $$2 = this.g(this.b(cjm.a(this, cqn.ot)));
      ciy $$3 = cjm.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(aty.wJ, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cfg.a r() {
      if (this.gx()) {
         return cfg.a.c;
      } else {
         return this.gf() ? cfg.a.d : cfg.a.a;
      }
   }

   class a extends cgi.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cfw.this.p() == null) {
            return false;
         } else {
            return cfw.this.p().aj() == this.e ? false : cfw.this.dM().d_(cfw.this.dm()).a((float)bmz.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bpo $$0 = cfw.this.p();
         if ($$0 != null) {
            this.e = $$0.aj();
         }
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 180;
      }

      @Override
      protected void k() {
         cfw.this.p().b(new boj(bol.o, 400), cfw.this);
      }

      @Override
      protected atx l() {
         return aty.mO;
      }

      @Override
      protected cgi.a m() {
         return cgi.a.f;
      }
   }

   class b extends cgi.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cfw.this.a(bol.n);
      }

      @Override
      protected int h() {
         return 20;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         cfw.this.b(new boj(bol.n, 1200));
      }

      @Nullable
      @Override
      protected atx l() {
         return aty.mP;
      }

      @Override
      protected cgi.a m() {
         return cgi.a.e;
      }
   }
}
