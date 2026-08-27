import javax.annotation.Nullable;

public class cay extends cbk implements cbe {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final eji[][] bW;

   public cay(bkm<? extends cay> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new eji[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = eji.b;
         this.bW[1][$$2] = eji.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brn(this));
      this.bO.a(1, new cbk.b());
      this.bO.a(4, new cay.b());
      this.bO.a(5, new cay.a());
      this.bO.a(6, new bst<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bsq(this, 0.6));
      this.bO.a(9, new bsb(this, cdm.class, 3.0F, 1.0F));
      this.bO.a(10, new bsb(this, bla.class, 8.0F));
      this.bP.a(1, new btl(this, ceu.class).a());
      this.bP.a(2, new btm<>(this, cdm.class, true).c(300));
      this.bP.a(3, new btm<>(this, ccu.class, false).c(300));
      this.bP.a(3, new btm<>(this, bwv.class, false).c(300));
   }

   public static bmd.a t() {
      return cba.gk().a(bme.m, 0.5).a(bme.g, 18.0).a(bme.l, 32.0);
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.a(bkn.a, new clb(cle.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b_() {
      super.b_();
   }

   @Override
   public ejd h_() {
      return this.cG().c(3.0, 0.0, 3.0);
   }

   @Override
   public void c_() {
      super.c_();
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
               this.bW[1][$$2] = new eji(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dL().a(js.f, this.d(0.5), this.dt(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dL().a(this.dq(), this.ds(), this.dw(), aqn.lK, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new eji(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aqm ad_() {
      return aqn.lG;
   }

   public eji[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eji[] $$2 = new eji[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bki $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bky && ((bky)$$0).eR() == bld.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aqm w() {
      return aqn.lG;
   }

   @Override
   protected aqm m_() {
      return aqn.lI;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.lJ;
   }

   @Override
   protected aqm ge() {
      return aqn.lH;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bky $$0, float $$1) {
      clb $$2 = this.g(this.b(cef.a(this, cle.nG)));
      cds $$3 = cef.a(this, $$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(aqn.vE, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   @Override
   public cai.a s() {
      if (this.go()) {
         return cai.a.c;
      } else {
         return this.fW() ? cai.a.d : cai.a.a;
      }
   }

   class a extends cbk.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cay.this.q() == null) {
            return false;
         } else {
            return cay.this.q().ah() == this.e ? false : cay.this.dL().d_(cay.this.dl()).a((float)bin.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bky $$0 = cay.this.q();
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
         cay.this.q().b(new bjv(bjx.o, 400), cay.this);
      }

      @Override
      protected aqm l() {
         return aqn.lL;
      }

      @Override
      protected cbk.a m() {
         return cbk.a.f;
      }
   }

   class b extends cbk.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cay.this.a(bjx.n);
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
         cay.this.b(new bjv(bjx.n, 1200));
      }

      @Nullable
      @Override
      protected aqm l() {
         return aqn.lM;
      }

      @Override
      protected cbk.a m() {
         return cbk.a.e;
      }
   }
}
