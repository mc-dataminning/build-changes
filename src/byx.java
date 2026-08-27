import javax.annotation.Nullable;

public class byx extends bzj implements bzd {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehf[][] bW;

   public byx(bik<? extends byx> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehf[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehf.b;
         this.bW[1][$$2] = ehf.b;
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bzj.b());
      this.bO.a(4, new byx.b());
      this.bO.a(5, new byx.a());
      this.bO.a(6, new bqs<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bqp(this, 0.6));
      this.bO.a(9, new bqa(this, cbl.class, 3.0F, 1.0F));
      this.bO.a(10, new bqa(this, biy.class, 8.0F));
      this.bP.a(1, new brk(this, cct.class).a());
      this.bP.a(2, new brl<>(this, cbl.class, true).c(300));
      this.bP.a(3, new brl<>(this, cat.class, false).c(300));
      this.bP.a(3, new brl<>(this, buu.class, false).c(300));
   }

   public static bkc.a q() {
      return byz.gf().a(bkd.d, 0.5).a(bkd.b, 18.0).a(bkd.a, 32.0);
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.a(bil.a, new ciw(ciz.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public eha k_() {
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
               this.bW[1][$$2] = new ehf(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dK().a(iw.f, this.d(0.5), this.ds(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dK().a(this.dp(), this.dr(), this.dv(), aou.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehf(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aot Y_() {
      return aou.lC;
   }

   public ehf[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehf[] $$2 = new ehf[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(big $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biw && ((biw)$$0).eQ() == bjb.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aot r() {
      return aou.lC;
   }

   @Override
   protected aot h_() {
      return aou.lE;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.lF;
   }

   @Override
   protected aot fZ() {
      return aou.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(biw $$0, float $$1) {
      ciw $$2 = this.g(this.b(cce.a(this, ciz.nG)));
      cbr $$3 = cce.a(this, $$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aou.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   @Override
   public byh.a p() {
      if (this.gj()) {
         return byh.a.c;
      } else {
         return this.fS() ? byh.a.d : byh.a.a;
      }
   }

   class a extends bzj.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (byx.this.j() == null) {
            return false;
         } else {
            return byx.this.j().ah() == this.e ? false : byx.this.dK().d_(byx.this.dk()).a((float)bgl.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         biw $$0 = byx.this.j();
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
         byx.this.j().b(new bht(bhv.o, 400), byx.this);
      }

      @Override
      protected aot l() {
         return aou.lH;
      }

      @Override
      protected bzj.a m() {
         return bzj.a.f;
      }
   }

   class b extends bzj.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !byx.this.a(bhv.n);
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
         byx.this.b(new bht(bhv.n, 1200));
      }

      @Nullable
      @Override
      protected aot l() {
         return aou.lI;
      }

      @Override
      protected bzj.a m() {
         return bzj.a.e;
      }
   }
}
