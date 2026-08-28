import javax.annotation.Nullable;

public class cnr extends cod implements cnx {
   private static final int bF = 4;
   private static final int bG = 3;
   public static final int a = 3;
   private int bH;
   private final fdw[][] bI;

   public cnr(bwj<? extends cnr> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bI = new fdw[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bI[0][$$2] = fdw.c;
         this.bI[1][$$2] = fdw.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cod.b());
      this.bC.a(3, new cdc<>(this, coy.class, 8.0F, 1.0, 1.2));
      this.bC.a(4, new cnr.b());
      this.bC.a(5, new cnr.a());
      this.bC.a(6, new cev<>(this, 0.5, 20, 15.0F));
      this.bC.a(8, new ces(this, 0.6));
      this.bC.a(9, new ced(this, cqs.class, 3.0F, 1.0F));
      this.bC.a(10, new ced(this, bxb.class, 8.0F));
      this.bD.a(1, new cfn(this, csi.class).a());
      this.bD.a(2, new cfo<>(this, cqs.class, true).c(300));
      this.bD.a(3, new cfo<>(this, cpz.class, false).c(300));
      this.bD.a(3, new cfo<>(this, cja.class, false).c(300));
   }

   public static bye.a m() {
      return cnt.gt().a(byf.v, 0.5).a(byf.m, 18.0).a(byf.s, 32.0);
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.a(bwk.a, new cys(cyw.pe));
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
               this.bI[1][$$2] = new fdw(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lx.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awl.nG, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bH = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bI[0][$$4] = this.bI[1][$$4];
               this.bI[1][$$4] = new fdw(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awk ad_() {
      return awl.nC;
   }

   public fdw[] J(float $$0) {
      if (this.bH <= 0) {
         return this.bI[1];
      } else {
         double $$1 = (double)(((float)this.bH - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fdw[] $$2 = new fdw[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bI[1][$$3].c(1.0 - $$1).e(this.bI[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awk u() {
      return awl.nC;
   }

   @Override
   protected awk l_() {
      return awl.nE;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.nF;
   }

   @Override
   protected awk q() {
      return awl.nD;
   }

   @Override
   public void a(aro $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bwz $$0, float $$1) {
      cys $$2 = this.b(cro.a(this, cyw.pe));
      cys $$3 = this.e($$2);
      cqz $$4 = cro.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof aro $$9) {
         crm.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awl.xX, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cna.a j() {
      if (this.gx()) {
         return cna.a.c;
      } else {
         return this.gh() ? cna.a.d : cna.a.a;
      }
   }

   class a extends cod.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cnr.this.f() == null) {
            return false;
         } else {
            return cnr.this.f().ar() == this.e ? false : cnr.this.dV().d_(cnr.this.dv()).a((float)btv.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bwz $$0 = cnr.this.f();
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
         cnr.this.f().b(new bve(bvg.o, 400), cnr.this);
      }

      @Override
      protected awk l() {
         return awl.nH;
      }

      @Override
      protected cod.a m() {
         return cod.a.f;
      }
   }

   class b extends cod.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cnr.this.b(bvg.n);
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
         cnr.this.a(new bve(bvg.n, 1200));
      }

      @Nullable
      @Override
      protected awk l() {
         return awl.nI;
      }

      @Override
      protected cod.a m() {
         return cod.a.e;
      }
   }
}
