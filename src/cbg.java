import javax.annotation.Nullable;

public class cbg extends cbs implements cbm {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final eju[][] bW;

   public cbg(bku<? extends cbg> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new eju[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = eju.b;
         this.bW[1][$$2] = eju.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(1, new cbs.b());
      this.bO.a(4, new cbg.b());
      this.bO.a(5, new cbg.a());
      this.bO.a(6, new btb<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bsy(this, 0.6));
      this.bO.a(9, new bsj(this, cdu.class, 3.0F, 1.0F));
      this.bO.a(10, new bsj(this, bli.class, 8.0F));
      this.bP.a(1, new btt(this, cfc.class).a());
      this.bP.a(2, new btu<>(this, cdu.class, true).c(300));
      this.bP.a(3, new btu<>(this, cdc.class, false).c(300));
      this.bP.a(3, new btu<>(this, bxd.class, false).c(300));
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.m, 0.5).a(bmm.g, 18.0).a(bmm.l, 32.0);
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.a(bkv.a, new clj(clm.or));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b_() {
      super.b_();
   }

   @Override
   public ejp h_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.dN().B && this.ce()) {
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
               this.bW[1][$$2] = new eju(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dN().a(js.f, this.d(0.5), this.dv(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dN().a(this.ds(), this.du(), this.dy(), aqr.ma, this.dc(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new eju(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aqq ae_() {
      return aqr.lW;
   }

   public eju[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eju[] $$2 = new eju[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bkq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof blg && ((blg)$$0).eT() == bll.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected aqq y() {
      return aqr.lW;
   }

   @Override
   protected aqq m_() {
      return aqr.lY;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.lZ;
   }

   @Override
   protected aqq gf() {
      return aqr.lX;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(blg $$0, float $$1) {
      clj $$2 = this.g(this.b(cen.a(this, clm.or)));
      cea $$3 = cen.a(this, $$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().aj().a() * 4));
      this.a(aqr.vV, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   @Override
   public caq.a u() {
      if (this.gp()) {
         return caq.a.c;
      } else {
         return this.fX() ? caq.a.d : caq.a.a;
      }
   }

   class a extends cbs.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cbg.this.q() == null) {
            return false;
         } else {
            return cbg.this.q().aj() == this.e ? false : cbg.this.dN().d_(cbg.this.dn()).a((float)biu.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         blg $$0 = cbg.this.q();
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
         cbg.this.q().b(new bkd(bkf.o, 400), cbg.this);
      }

      @Override
      protected aqq l() {
         return aqr.mb;
      }

      @Override
      protected cbs.a m() {
         return cbs.a.f;
      }
   }

   class b extends cbs.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cbg.this.a(bkf.n);
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
         cbg.this.b(new bkd(bkf.n, 1200));
      }

      @Nullable
      @Override
      protected aqq l() {
         return aqr.mc;
      }

      @Override
      protected cbs.a m() {
         return cbs.a.e;
      }
   }
}
