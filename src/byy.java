import javax.annotation.Nullable;

public class byy extends bzk implements bze {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehd[][] bW;

   public byy(bim<? extends byy> $$0, cpl $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehd[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehd.b;
         this.bW[1][$$2] = ehd.b;
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bzk.b());
      this.bO.a(4, new byy.b());
      this.bO.a(5, new byy.a());
      this.bO.a(6, new bqt<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bqq(this, 0.6));
      this.bO.a(9, new bqb(this, cbm.class, 3.0F, 1.0F));
      this.bO.a(10, new bqb(this, bja.class, 8.0F));
      this.bP.a(1, new brl(this, ccu.class).a());
      this.bP.a(2, new brm<>(this, cbm.class, true).c(300));
      this.bP.a(3, new brm<>(this, cau.class, false).c(300));
      this.bP.a(3, new brm<>(this, buv.class, false).c(300));
   }

   public static bkd.a q() {
      return bza.gg().a(bke.d, 0.5).a(bke.b, 18.0).a(bke.a, 32.0);
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      this.a(bin.a, new cix(cja.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public egy k_() {
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
               this.bW[1][$$2] = new ehd(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dK().a(iv.f, this.d(0.5), this.ds(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dK().a(this.dp(), this.dr(), this.dv(), aow.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehd(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aov X_() {
      return aow.lC;
   }

   public ehd[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehd[] $$2 = new ehd[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bii $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aov r() {
      return aow.lC;
   }

   @Override
   protected aov h_() {
      return aow.lE;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.lF;
   }

   @Override
   protected aov ga() {
      return aow.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(biy $$0, float $$1) {
      cix $$2 = this.g(this.b(ccf.a(this, cja.nG)));
      cbs $$3 = ccf.a(this, $$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aow.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   @Override
   public byi.a p() {
      if (this.gk()) {
         return byi.a.c;
      } else {
         return this.fS() ? byi.a.d : byi.a.a;
      }
   }

   class a extends bzk.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (byy.this.j() == null) {
            return false;
         } else {
            return byy.this.j().ah() == this.e ? false : byy.this.dK().d_(byy.this.dk()).a((float)bgn.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         biy $$0 = byy.this.j();
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
         byy.this.j().b(new bhv(bhx.o, 400), byy.this);
      }

      @Override
      protected aov l() {
         return aow.lH;
      }

      @Override
      protected bzk.a m() {
         return bzk.a.f;
      }
   }

   class b extends bzk.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !byy.this.a(bhx.n);
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
         byy.this.b(new bhv(bhx.n, 1200));
      }

      @Nullable
      @Override
      protected aov l() {
         return aow.lI;
      }

      @Override
      protected bzk.a m() {
         return bzk.a.e;
      }
   }
}
