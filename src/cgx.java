import javax.annotation.Nullable;

public class cgx extends chj implements chd {
   private static final int e = 4;
   private static final int bX = 3;
   private static final int bY = 3;
   private int bZ;
   private final esa[][] ca;

   public cgx(bqb<? extends cgx> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.ca = new esa[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.ca[0][$$2] = esa.b;
         this.ca[1][$$2] = esa.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new chj.b());
      this.bR.a(4, new cgx.b());
      this.bR.a(5, new cgx.a());
      this.bR.a(6, new byl<>(this, 0.5, 20, 15.0F));
      this.bR.a(8, new byi(this, 0.6));
      this.bR.a(9, new bxt(this, cjt.class, 3.0F, 1.0F));
      this.bR.a(10, new bxt(this, bqq.class, 8.0F));
      this.bS.a(1, new bzd(this, clf.class).a());
      this.bS.a(2, new bze<>(this, cjt.class, true).c(300));
      this.bS.a(3, new bze<>(this, cjb.class, false).c(300));
      this.bS.a(3, new bze<>(this, ccp.class, false).c(300));
   }

   public static bru.a u() {
      return cgz.gt().a(brv.r, 0.5).a(brv.k, 18.0).a(brv.q, 32.0);
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.a(bqc.a, new crj(crm.ot));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public erv h_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void n_() {
      super.n_();
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
               this.ca[1][$$2] = new esa(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(kl.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), aum.mT, this.db(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bZ = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.ca[0][$$4] = this.ca[1][$$4];
               this.ca[1][$$4] = new esa(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aul ae_() {
      return aum.mP;
   }

   public esa[] G(float $$0) {
      if (this.bZ <= 0) {
         return this.ca[1];
      } else {
         double $$1 = (double)(((float)this.bZ - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         esa[] $$2 = new esa[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.ca[1][$$3].a(1.0 - $$1).e(this.ca[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected aul v() {
      return aum.mP;
   }

   @Override
   protected aul o_() {
      return aum.mR;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.mS;
   }

   @Override
   protected aul gn() {
      return aum.mQ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bqo $$0, float $$1) {
      crj $$2 = this.g(this.b(ckn.a(this, crm.ot)));
      cjz $$3 = ckn.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(aum.wR, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cgg.a r() {
      if (this.gx()) {
         return cgg.a.c;
      } else {
         return this.gf() ? cgg.a.d : cgg.a.a;
      }
   }

   class a extends chj.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cgx.this.p() == null) {
            return false;
         } else {
            return cgx.this.p().aj() == this.e ? false : cgx.this.dM().d_(cgx.this.dm()).a((float)bnx.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bqo $$0 = cgx.this.p();
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
         cgx.this.p().b(new bph(bpj.o, 400), cgx.this);
      }

      @Override
      protected aul l() {
         return aum.mU;
      }

      @Override
      protected chj.a m() {
         return chj.a.f;
      }
   }

   class b extends chj.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cgx.this.b(bpj.n);
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
         cgx.this.b(new bph(bpj.n, 1200));
      }

      @Nullable
      @Override
      protected aul l() {
         return aum.mV;
      }

      @Override
      protected chj.a m() {
         return chj.a.e;
      }
   }
}
