import javax.annotation.Nullable;

public class coi extends cov implements cop {
   private static final int bG = 4;
   private static final int bH = 3;
   public static final int a = 3;
   private int bI;
   private final fex[][] bJ;

   public coi(bwr<? extends coi> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bJ = new fex[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bJ[0][$$2] = fex.c;
         this.bJ[1][$$2] = fex.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cov.b());
      this.bD.a(3, new cdm<>(this, cpp.class, 8.0F, 1.0, 1.2));
      this.bD.a(4, new coi.b());
      this.bD.a(5, new coi.a());
      this.bD.a(6, new cff<>(this, 0.5, 20, 15.0F));
      this.bD.a(8, new cfc(this, 0.6));
      this.bD.a(9, new cen(this, crj.class, 3.0F, 1.0F));
      this.bD.a(10, new cen(this, bxl.class, 8.0F));
      this.bE.a(1, new cfx(this, cta.class).a());
      this.bE.a(2, new cfy<>(this, crj.class, true).c(300));
      this.bE.a(3, new cfy<>(this, cqq.class, false).c(300));
      this.bE.a(3, new cfy<>(this, cjp.class, false).c(300));
   }

   public static byo.a m() {
      return cok.gw().a(byp.v, 0.5).a(byp.m, 18.0).a(byp.s, 32.0);
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.a(bws.a, new czk(czo.pj));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dU().C && this.cn()) {
         this.bI--;
         if (this.bI < 0) {
            this.bI = 0;
         }

         if (this.aN == 1 || this.af % 1200 == 0) {
            this.bI = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bJ[0][$$2] = this.bJ[1][$$2];
               this.bJ[1][$$2] = new fex(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dU().a(ly.e, this.d(0.5), this.dC(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dU().a(this.dz(), this.dB(), this.dF(), awn.nK, this.dl(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bI = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bJ[0][$$4] = this.bJ[1][$$4];
               this.bJ[1][$$4] = new fex(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awm ae_() {
      return awn.nG;
   }

   public fex[] J(float $$0) {
      if (this.bI <= 0) {
         return this.bJ[1];
      } else {
         double $$1 = (double)(((float)this.bI - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fex[] $$2 = new fex[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bJ[1][$$3].c(1.0 - $$1).e(this.bJ[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awm u() {
      return awn.nG;
   }

   @Override
   protected awm l_() {
      return awn.nI;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.nJ;
   }

   @Override
   protected awm q() {
      return awn.nH;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bxj $$0, float $$1) {
      czk $$2 = this.b(csg.a(this, czo.pj));
      czk $$3 = this.d($$2);
      crr $$4 = csg.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dz() - this.dz();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dB();
      double $$7 = $$0.dF() - this.dF();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dU() instanceof arq $$9) {
         cse.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awn.yd, 1.0F, 1.0F / (this.dX().i() * 0.4F + 0.8F));
   }

   @Override
   public cnr.a j() {
      if (this.gA()) {
         return cnr.a.c;
      } else {
         return this.gk() ? cnr.a.d : cnr.a.a;
      }
   }

   class a extends cov.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (coi.this.f() == null) {
            return false;
         } else {
            return coi.this.f().ao() == this.e ? false : coi.this.dU().d_(coi.this.du()).a((float)bud.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bxj $$0 = coi.this.f();
         if ($$0 != null) {
            this.e = $$0.ao();
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
         coi.this.f().b(new bvm(bvo.o, 400), coi.this);
      }

      @Override
      protected awm l() {
         return awn.nL;
      }

      @Override
      protected cov.a m() {
         return cov.a.f;
      }
   }

   class b extends cov.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !coi.this.b(bvo.n);
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
         coi.this.a(new bvm(bvo.n, 1200));
      }

      @Nullable
      @Override
      protected awm l() {
         return awn.nM;
      }

      @Override
      protected cov.a m() {
         return cov.a.e;
      }
   }
}
