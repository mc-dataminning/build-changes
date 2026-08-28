import javax.annotation.Nullable;

public class cob extends coo implements coh {
   private static final int bG = 4;
   private static final int bH = 3;
   public static final int a = 3;
   private int bI;
   private final feq[][] bJ;

   public cob(bwo<? extends cob> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bJ = new feq[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bJ[0][$$2] = feq.c;
         this.bJ[1][$$2] = feq.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new coo.b());
      this.bD.a(3, new cdh<>(this, cpi.class, 8.0F, 1.0, 1.2));
      this.bD.a(4, new cob.b());
      this.bD.a(5, new cob.a());
      this.bD.a(6, new cfa<>(this, 0.5, 20, 15.0F));
      this.bD.a(8, new cex(this, 0.6));
      this.bD.a(9, new cei(this, crc.class, 3.0F, 1.0F));
      this.bD.a(10, new cei(this, bxg.class, 8.0F));
      this.bE.a(1, new cfs(this, cst.class).a());
      this.bE.a(2, new cft<>(this, crc.class, true).c(300));
      this.bE.a(3, new cft<>(this, cqj.class, false).c(300));
      this.bE.a(3, new cft<>(this, cjk.class, false).c(300));
   }

   public static byj.a m() {
      return cod.gu().a(byk.v, 0.5).a(byk.m, 18.0).a(byk.s, 32.0);
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.a(bwp.a, new czd(czh.pj));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C && this.cp()) {
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
               this.bJ[1][$$2] = new feq(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lx.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awn.nK, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bI = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bJ[0][$$4] = this.bJ[1][$$4];
               this.bJ[1][$$4] = new feq(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awm ae_() {
      return awn.nG;
   }

   public feq[] J(float $$0) {
      if (this.bI <= 0) {
         return this.bJ[1];
      } else {
         double $$1 = (double)(((float)this.bI - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         feq[] $$2 = new feq[4];

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
   protected awm e(buu $$0) {
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
   public void a(bxe $$0, float $$1) {
      czd $$2 = this.b(crz.a(this, czh.pj));
      czd $$3 = this.d($$2);
      crk $$4 = crz.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arq $$9) {
         crx.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awn.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cnk.a j() {
      if (this.gy()) {
         return cnk.a.c;
      } else {
         return this.gi() ? cnk.a.d : cnk.a.a;
      }
   }

   class a extends coo.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cob.this.f() == null) {
            return false;
         } else {
            return cob.this.f().ar() == this.e ? false : cob.this.dV().d_(cob.this.dv()).a((float)bua.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bxe $$0 = cob.this.f();
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
         cob.this.f().b(new bvj(bvl.o, 400), cob.this);
      }

      @Override
      protected awm l() {
         return awn.nL;
      }

      @Override
      protected coo.a m() {
         return coo.a.f;
      }
   }

   class b extends coo.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cob.this.b(bvl.n);
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
         cob.this.a(new bvj(bvl.n, 1200));
      }

      @Nullable
      @Override
      protected awm l() {
         return awn.nM;
      }

      @Override
      protected coo.a m() {
         return coo.a.e;
      }
   }
}
