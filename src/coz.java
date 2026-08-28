import javax.annotation.Nullable;

public class coz extends cpl implements cpf {
   private static final int e = 4;
   private static final int f = 3;
   public static final int a = 3;
   private int bI;
   private final ffs[][] bJ;

   public coz(bxe<? extends coz> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bJ = new ffs[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bJ[0][$$2] = ffs.c;
         this.bJ[1][$$2] = ffs.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cpl.b());
      this.bF.a(3, new cdz<>(this, cqf.class, 8.0F, 1.0, 1.2));
      this.bF.a(4, new coz.b());
      this.bF.a(5, new coz.a());
      this.bF.a(6, new cfs<>(this, 0.5, 20, 15.0F));
      this.bF.a(8, new cfp(this, 0.6));
      this.bF.a(9, new cfa(this, crz.class, 3.0F, 1.0F));
      this.bF.a(10, new cfa(this, bxy.class, 8.0F));
      this.bG.a(1, new cgk(this, ctq.class).a());
      this.bG.a(2, new cgl<>(this, crz.class, true).c(300));
      this.bG.a(3, new cgl<>(this, crg.class, false).c(300));
      this.bG.a(3, new cgl<>(this, ckc.class, false).c(300));
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.v, 0.5).a(bzc.m, 18.0).a(bzc.s, 32.0);
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.a(bxf.a, new daa(dae.pj));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C && this.co()) {
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
               this.bJ[1][$$2] = new ffs(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lz.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awr.nK, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bI = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bJ[0][$$4] = this.bJ[1][$$4];
               this.bJ[1][$$4] = new ffs(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awq ai_() {
      return awr.nG;
   }

   public ffs[] J(float $$0) {
      if (this.bI <= 0) {
         return this.bJ[1];
      } else {
         double $$1 = (double)(((float)this.bI - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ffs[] $$2 = new ffs[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bJ[1][$$3].c(1.0 - $$1).e(this.bJ[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awq u() {
      return awr.nG;
   }

   @Override
   protected awq l_() {
      return awr.nI;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.nJ;
   }

   @Override
   protected awq q() {
      return awr.nH;
   }

   @Override
   public void a(aru $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bxw $$0, float $$1) {
      daa $$2 = this.b(csw.a(this, dae.pj));
      daa $$3 = this.d($$2);
      csh $$4 = csw.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof aru $$9) {
         csu.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awr.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public coh.a j() {
      if (this.gB()) {
         return coh.a.c;
      } else {
         return this.gl() ? coh.a.d : coh.a.a;
      }
   }

   class a extends cpl.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (coz.this.f() == null) {
            return false;
         } else {
            return coz.this.f().ao() == this.e ? false : coz.this.dV().d_(coz.this.dv()).a((float)buq.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bxw $$0 = coz.this.f();
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
         coz.this.f().b(new bvz(bwb.o, 400), coz.this);
      }

      @Override
      protected awq l() {
         return awr.nL;
      }

      @Override
      protected cpl.a m() {
         return cpl.a.f;
      }
   }

   class b extends cpl.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !coz.this.b(bwb.n);
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
         coz.this.a(new bvz(bwb.n, 1200));
      }

      @Nullable
      @Override
      protected awq l() {
         return awr.nM;
      }

      @Override
      protected cpl.a m() {
         return cpl.a.e;
      }
   }
}
