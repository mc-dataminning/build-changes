import javax.annotation.Nullable;

public class cbl extends cbx implements cbr {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ejz[][] bW;

   public cbl(bkz<? extends cbl> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ejz[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ejz.b;
         this.bW[1][$$2] = ejz.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new cbx.b());
      this.bO.a(4, new cbl.b());
      this.bO.a(5, new cbl.a());
      this.bO.a(6, new btg<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new btd(this, 0.6));
      this.bO.a(9, new bso(this, cdz.class, 3.0F, 1.0F));
      this.bO.a(10, new bso(this, bln.class, 8.0F));
      this.bP.a(1, new bty(this, cfh.class).a());
      this.bP.a(2, new btz<>(this, cdz.class, true).c(300));
      this.bP.a(3, new btz<>(this, cdh.class, false).c(300));
      this.bP.a(3, new btz<>(this, bxi.class, false).c(300));
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.m, 0.5).a(bmr.g, 18.0).a(bmr.l, 32.0);
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.a(bla.a, new clo(clr.or));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public eju i_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void d_() {
      super.d_();
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
               this.bW[1][$$2] = new ejz(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dN().a(jw.f, this.d(0.5), this.dv(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dN().a(this.ds(), this.du(), this.dy(), aqv.ma, this.dc(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ejz(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aqu af_() {
      return aqv.lW;
   }

   public ejz[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ejz[] $$2 = new ejz[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bkv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bll && ((bll)$$0).eT() == blq.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected aqu y() {
      return aqv.lW;
   }

   @Override
   protected aqu n_() {
      return aqv.lY;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.lZ;
   }

   @Override
   protected aqu gf() {
      return aqv.lX;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bll $$0, float $$1) {
      clo $$2 = this.g(this.b(ces.a(this, clr.or)));
      cef $$3 = ces.a(this, $$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().aj().a() * 4));
      this.a(aqv.vV, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   @Override
   public cav.a u() {
      if (this.gp()) {
         return cav.a.c;
      } else {
         return this.fX() ? cav.a.d : cav.a.a;
      }
   }

   class a extends cbx.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cbl.this.q() == null) {
            return false;
         } else {
            return cbl.this.q().aj() == this.e ? false : cbl.this.dN().d_(cbl.this.dn()).a((float)biy.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bll $$0 = cbl.this.q();
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
         cbl.this.q().b(new bki(bkk.o, 400), cbl.this);
      }

      @Override
      protected aqu l() {
         return aqv.mb;
      }

      @Override
      protected cbx.a m() {
         return cbx.a.f;
      }
   }

   class b extends cbx.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cbl.this.a(bkk.n);
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
         cbl.this.b(new bki(bkk.n, 1200));
      }

      @Nullable
      @Override
      protected aqu l() {
         return aqv.mc;
      }

      @Override
      protected cbx.a m() {
         return cbx.a.e;
      }
   }
}
