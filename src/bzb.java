import javax.annotation.Nullable;

public class bzb extends bzn implements bzh {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehi[][] bW;

   public bzb(bip<? extends bzb> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehi[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehi.b;
         this.bW[1][$$2] = ehi.b;
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bzn.b());
      this.bO.a(4, new bzb.b());
      this.bO.a(5, new bzb.a());
      this.bO.a(6, new bqw<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bqt(this, 0.6));
      this.bO.a(9, new bqe(this, cbp.class, 3.0F, 1.0F));
      this.bO.a(10, new bqe(this, bjd.class, 8.0F));
      this.bP.a(1, new bro(this, ccx.class).a());
      this.bP.a(2, new brp<>(this, cbp.class, true).c(300));
      this.bP.a(3, new brp<>(this, cax.class, false).c(300));
      this.bP.a(3, new brp<>(this, buy.class, false).c(300));
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.d, 0.5).a(bkh.b, 18.0).a(bkh.a, 32.0);
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.a(biq.a, new cja(cjd.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public ehd k_() {
      return this.cG().c(3.0, 0.0, 3.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dK().B && this.cd()) {
         this.bV--;
         if (this.bV < 0) {
            this.bV = 0;
         }

         if (this.aK == 1 || this.ah % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new ehi(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dK().a(ix.f, this.d(0.5), this.ds(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dK().a(this.dp(), this.dr(), this.dv(), aoz.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehi(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aoy X_() {
      return aoz.lC;
   }

   public ehi[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehi[] $$2 = new ehi[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bil $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjb && ((bjb)$$0).eQ() == bjg.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aoy r() {
      return aoz.lC;
   }

   @Override
   protected aoy h_() {
      return aoz.lE;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.lF;
   }

   @Override
   protected aoy ga() {
      return aoz.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bjb $$0, float $$1) {
      cja $$2 = this.g(this.b(cci.a(this, cjd.nG)));
      cbv $$3 = cci.a(this, $$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aoz.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   @Override
   public byl.a p() {
      if (this.gk()) {
         return byl.a.c;
      } else {
         return this.fS() ? byl.a.d : byl.a.a;
      }
   }

   class a extends bzn.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (bzb.this.j() == null) {
            return false;
         } else {
            return bzb.this.j().ah() == this.e ? false : bzb.this.dK().d_(bzb.this.dk()).a((float)bgq.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bjb $$0 = bzb.this.j();
         if ($$0 != null) {
            this.e = $$0.ah();
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
         bzb.this.j().b(new bhy(bia.o, 400), bzb.this);
      }

      @Override
      protected aoy l() {
         return aoz.lH;
      }

      @Override
      protected bzn.a m() {
         return bzn.a.f;
      }
   }

   class b extends bzn.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !bzb.this.a(bia.n);
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
         bzb.this.b(new bhy(bia.n, 1200));
      }

      @Nullable
      @Override
      protected aoy l() {
         return aoz.lI;
      }

      @Override
      protected bzn.a m() {
         return bzn.a.e;
      }
   }
}
