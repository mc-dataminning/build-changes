import javax.annotation.Nullable;

public class bzg extends bzs implements bzm {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehn[][] bW;

   public bzg(biu<? extends bzg> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehn[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehn.b;
         this.bW[1][$$2] = ehn.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bzs.b());
      this.bO.a(4, new bzg.b());
      this.bO.a(5, new bzg.a());
      this.bO.a(6, new brb<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bqy(this, 0.6));
      this.bO.a(9, new bqj(this, cbu.class, 3.0F, 1.0F));
      this.bO.a(10, new bqj(this, bji.class, 8.0F));
      this.bP.a(1, new brt(this, cdc.class).a());
      this.bP.a(2, new bru<>(this, cbu.class, true).c(300));
      this.bP.a(3, new bru<>(this, cbc.class, false).c(300));
      this.bP.a(3, new bru<>(this, bvd.class, false).c(300));
   }

   public static bkl.a t() {
      return bzi.gj().a(bkm.d, 0.5).a(bkm.b, 18.0).a(bkm.a, 32.0);
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      this.a(biv.a, new cjf(cji.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public ehi g_() {
      return this.cG().c(3.0, 0.0, 3.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dL().B && this.cd()) {
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
               this.bW[1][$$2] = new ehn(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dL().a(iv.f, this.d(0.5), this.dt(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dL().a(this.dq(), this.ds(), this.dw(), apd.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehn(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public apc ac_() {
      return apd.lC;
   }

   public ehn[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehn[] $$2 = new ehn[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(biq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjg && ((bjg)$$0).eR() == bjl.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected apc w() {
      return apd.lC;
   }

   @Override
   protected apc l_() {
      return apd.lE;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.lF;
   }

   @Override
   protected apc gd() {
      return apd.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bjg $$0, float $$1) {
      cjf $$2 = this.g(this.b(ccn.a(this, cji.nG)));
      cca $$3 = ccn.a(this, $$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apd.vA, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   @Override
   public byq.a s() {
      if (this.gn()) {
         return byq.a.c;
      } else {
         return this.fV() ? byq.a.d : byq.a.a;
      }
   }

   class a extends bzs.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (bzg.this.q() == null) {
            return false;
         } else {
            return bzg.this.q().ah() == this.e ? false : bzg.this.dL().d_(bzg.this.dl()).a((float)bgv.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bjg $$0 = bzg.this.q();
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
         bzg.this.q().b(new bid(bif.o, 400), bzg.this);
      }

      @Override
      protected apc l() {
         return apd.lH;
      }

      @Override
      protected bzs.a m() {
         return bzs.a.f;
      }
   }

   class b extends bzs.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !bzg.this.a(bif.n);
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
         bzg.this.b(new bid(bif.n, 1200));
      }

      @Nullable
      @Override
      protected apc l() {
         return apd.lI;
      }

      @Override
      protected bzs.a m() {
         return bzs.a.e;
      }
   }
}
