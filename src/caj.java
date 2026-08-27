import javax.annotation.Nullable;

public class caj extends cav implements cap {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final eif[][] bW;

   public caj(bjx<? extends caj> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new eif[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = eif.b;
         this.bW[1][$$2] = eif.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new cav.b());
      this.bO.a(4, new caj.b());
      this.bO.a(5, new caj.a());
      this.bO.a(6, new bse<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bsb(this, 0.6));
      this.bO.a(9, new brm(this, ccx.class, 3.0F, 1.0F));
      this.bO.a(10, new brm(this, bkl.class, 8.0F));
      this.bP.a(1, new bsw(this, cef.class).a());
      this.bP.a(2, new bsx<>(this, ccx.class, true).c(300));
      this.bP.a(3, new bsx<>(this, ccf.class, false).c(300));
      this.bP.a(3, new bsx<>(this, bwg.class, false).c(300));
   }

   public static blo.a t() {
      return cal.gk().a(blp.m, 0.5).a(blp.g, 18.0).a(blp.l, 32.0);
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.a(bjy.a, new ckj(ckm.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b_() {
      super.b_();
   }

   @Override
   public eia h_() {
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
               this.bW[1][$$2] = new eif(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dL().a(js.f, this.d(0.5), this.dt(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dL().a(this.dq(), this.ds(), this.dw(), aqd.lI, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new eif(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aqc ad_() {
      return aqd.lE;
   }

   public eif[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eif[] $$2 = new eif[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bjt $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bkj && ((bkj)$$0).eR() == bko.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aqc w() {
      return aqd.lE;
   }

   @Override
   protected aqc m_() {
      return aqd.lG;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.lH;
   }

   @Override
   protected aqc ge() {
      return aqd.lF;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bkj $$0, float $$1) {
      ckj $$2 = this.g(this.b(cdq.a(this, ckm.nG)));
      cdd $$3 = cdq.a(this, $$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(aqd.vC, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   @Override
   public bzt.a s() {
      if (this.go()) {
         return bzt.a.c;
      } else {
         return this.fW() ? bzt.a.d : bzt.a.a;
      }
   }

   class a extends cav.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (caj.this.q() == null) {
            return false;
         } else {
            return caj.this.q().ah() == this.e ? false : caj.this.dL().d_(caj.this.dl()).a((float)bhy.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bkj $$0 = caj.this.q();
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
         caj.this.q().b(new bjg(bji.o, 400), caj.this);
      }

      @Override
      protected aqc l() {
         return aqd.lJ;
      }

      @Override
      protected cav.a m() {
         return cav.a.f;
      }
   }

   class b extends cav.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !caj.this.a(bji.n);
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
         caj.this.b(new bjg(bji.n, 1200));
      }

      @Nullable
      @Override
      protected aqc l() {
         return aqd.lK;
      }

      @Override
      protected cav.a m() {
         return cav.a.e;
      }
   }
}
