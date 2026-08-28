import javax.annotation.Nullable;

public class cnx extends coj implements cod {
   private static final int bF = 4;
   private static final int bG = 3;
   public static final int a = 3;
   private int bH;
   private final fei[][] bI;

   public cnx(bwm<? extends cnx> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bI = new fei[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bI[0][$$2] = fei.c;
         this.bI[1][$$2] = fei.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cds(this));
      this.bC.a(1, new coj.b());
      this.bC.a(3, new cdf<>(this, cpe.class, 8.0F, 1.0, 1.2));
      this.bC.a(4, new cnx.b());
      this.bC.a(5, new cnx.a());
      this.bC.a(6, new cey<>(this, 0.5, 20, 15.0F));
      this.bC.a(8, new cev(this, 0.6));
      this.bC.a(9, new ceg(this, cqy.class, 3.0F, 1.0F));
      this.bC.a(10, new ceg(this, bxe.class, 8.0F));
      this.bD.a(1, new cfq(this, cso.class).a());
      this.bD.a(2, new cfr<>(this, cqy.class, true).c(300));
      this.bD.a(3, new cfr<>(this, cqf.class, false).c(300));
      this.bD.a(3, new cfr<>(this, cjg.class, false).c(300));
   }

   public static byh.a m() {
      return cnz.gt().a(byi.v, 0.5).a(byi.m, 18.0).a(byi.s, 32.0);
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.a(bwn.a, new cyy(czc.pg));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C && this.cp()) {
         this.bH--;
         if (this.bH < 0) {
            this.bH = 0;
         }

         if (this.aN == 1 || this.af % 1200 == 0) {
            this.bH = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bI[0][$$2] = this.bI[1][$$2];
               this.bI[1][$$2] = new fei(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lx.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awn.nH, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bH = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bI[0][$$4] = this.bI[1][$$4];
               this.bI[1][$$4] = new fei(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awm ad_() {
      return awn.nD;
   }

   public fei[] J(float $$0) {
      if (this.bH <= 0) {
         return this.bI[1];
      } else {
         double $$1 = (double)(((float)this.bH - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fei[] $$2 = new fei[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bI[1][$$3].c(1.0 - $$1).e(this.bI[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awm u() {
      return awn.nD;
   }

   @Override
   protected awm l_() {
      return awn.nF;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.nG;
   }

   @Override
   protected awm q() {
      return awn.nE;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bxc $$0, float $$1) {
      cyy $$2 = this.b(cru.a(this, czc.pg));
      cyy $$3 = this.e($$2);
      crf $$4 = cru.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arq $$9) {
         crs.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awn.ya, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cng.a j() {
      if (this.gx()) {
         return cng.a.c;
      } else {
         return this.gh() ? cng.a.d : cng.a.a;
      }
   }

   class a extends coj.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cnx.this.f() == null) {
            return false;
         } else {
            return cnx.this.f().ar() == this.e ? false : cnx.this.dV().d_(cnx.this.dv()).a((float)bty.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bxc $$0 = cnx.this.f();
         if ($$0 != null) {
            this.e = $$0.ar();
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
         cnx.this.f().b(new bvh(bvj.o, 400), cnx.this);
      }

      @Override
      protected awm l() {
         return awn.nI;
      }

      @Override
      protected coj.a m() {
         return coj.a.f;
      }
   }

   class b extends coj.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cnx.this.b(bvj.n);
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
         cnx.this.a(new bvh(bvj.n, 1200));
      }

      @Nullable
      @Override
      protected awm l() {
         return awn.nJ;
      }

      @Override
      protected coj.a m() {
         return coj.a.e;
      }
   }
}
