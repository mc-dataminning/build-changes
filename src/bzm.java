import javax.annotation.Nullable;

public class bzm extends bzy implements bzs {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehh[][] bW;

   public bzm(bja<? extends bzm> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehh[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehh.b;
         this.bW[1][$$2] = ehh.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bzy.b());
      this.bO.a(4, new bzm.b());
      this.bO.a(5, new bzm.a());
      this.bO.a(6, new brh<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bre(this, 0.6));
      this.bO.a(9, new bqp(this, cca.class, 3.0F, 1.0F));
      this.bO.a(10, new bqp(this, bjo.class, 8.0F));
      this.bP.a(1, new brz(this, cdi.class).a());
      this.bP.a(2, new bsa<>(this, cca.class, true).c(300));
      this.bP.a(3, new bsa<>(this, cbi.class, false).c(300));
      this.bP.a(3, new bsa<>(this, bvj.class, false).c(300));
   }

   public static bkr.a t() {
      return bzo.gk().a(bks.m, 0.5).a(bks.g, 18.0).a(bks.l, 32.0);
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.a(bjb.a, new cjl(cjo.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public ehc g_() {
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
               this.bW[1][$$2] = new ehh(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dL().a(iv.f, this.d(0.5), this.dt(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dL().a(this.dq(), this.ds(), this.dw(), apg.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehh(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public apf ac_() {
      return apg.lC;
   }

   public ehh[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehh[] $$2 = new ehh[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(biw $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjm && ((bjm)$$0).eR() == bjr.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected apf w() {
      return apg.lC;
   }

   @Override
   protected apf l_() {
      return apg.lE;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.lF;
   }

   @Override
   protected apf ge() {
      return apg.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bjm $$0, float $$1) {
      cjl $$2 = this.g(this.b(cct.a(this, cjo.nG)));
      ccg $$3 = cct.a(this, $$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apg.vA, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   @Override
   public byw.a s() {
      if (this.go()) {
         return byw.a.c;
      } else {
         return this.fW() ? byw.a.d : byw.a.a;
      }
   }

   class a extends bzy.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (bzm.this.q() == null) {
            return false;
         } else {
            return bzm.this.q().ah() == this.e ? false : bzm.this.dL().d_(bzm.this.dl()).a((float)bhb.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bjm $$0 = bzm.this.q();
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
         bzm.this.q().b(new bij(bil.o, 400), bzm.this);
      }

      @Override
      protected apf l() {
         return apg.lH;
      }

      @Override
      protected bzy.a m() {
         return bzy.a.f;
      }
   }

   class b extends bzy.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !bzm.this.a(bil.n);
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
         bzm.this.b(new bij(bil.n, 1200));
      }

      @Nullable
      @Override
      protected apf l() {
         return apg.lI;
      }

      @Override
      protected bzy.a m() {
         return bzy.a.e;
      }
   }
}
