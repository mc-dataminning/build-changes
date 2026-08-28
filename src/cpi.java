import javax.annotation.Nullable;

public class cpi extends cpu implements cpo {
   private static final int e = 4;
   private static final int f = 3;
   public static final int a = 3;
   private int bI;
   private final fgc[][] bJ;

   public cpi(bxn<? extends cpi> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bJ = new fgc[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bJ[0][$$2] = fgc.c;
         this.bJ[1][$$2] = fgc.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cpu.b());
      this.bF.a(3, new cei<>(this, cqo.class, 8.0F, 1.0, 1.2));
      this.bF.a(4, new cpi.b());
      this.bF.a(5, new cpi.a());
      this.bF.a(6, new cgb<>(this, 0.5, 20, 15.0F));
      this.bF.a(8, new cfy(this, 0.6));
      this.bF.a(9, new cfj(this, csi.class, 3.0F, 1.0F));
      this.bF.a(10, new cfj(this, byh.class, 8.0F));
      this.bG.a(1, new cgt(this, ctz.class).a());
      this.bG.a(2, new cgu<>(this, csi.class, true).c(300));
      this.bG.a(3, new cgu<>(this, crp.class, false).c(300));
      this.bG.a(3, new cgu<>(this, ckl.class, false).c(300));
   }

   public static bzk.a m() {
      return cpk.gx().a(bzl.v, 0.5).a(bzl.m, 18.0).a(bzl.s, 32.0);
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.a(bxo.a, new dak(dao.pj));
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
               this.bJ[1][$$2] = new fgc(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lz.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awy.nK, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bI = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bJ[0][$$4] = this.bJ[1][$$4];
               this.bJ[1][$$4] = new fgc(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awx aj_() {
      return awy.nG;
   }

   public fgc[] J(float $$0) {
      if (this.bI <= 0) {
         return this.bJ[1];
      } else {
         double $$1 = (double)(((float)this.bI - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fgc[] $$2 = new fgc[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bJ[1][$$3].c(1.0 - $$1).e(this.bJ[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awx u() {
      return awy.nG;
   }

   @Override
   protected awx l_() {
      return awy.nI;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.nJ;
   }

   @Override
   protected awx q() {
      return awy.nH;
   }

   @Override
   public void a(asb $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(byf $$0, float $$1) {
      dak $$2 = this.b(ctf.a(this, dao.pj));
      dak $$3 = this.d($$2);
      csq $$4 = ctf.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof asb $$9) {
         ctd.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awy.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cor.a j() {
      if (this.gB()) {
         return cor.a.c;
      } else {
         return this.gl() ? cor.a.d : cor.a.a;
      }
   }

   class a extends cpu.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cpi.this.f() == null) {
            return false;
         } else {
            return cpi.this.f().ao() == this.e ? false : cpi.this.dV().d_(cpi.this.dv()).a((float)buz.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         byf $$0 = cpi.this.f();
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
         cpi.this.f().b(new bwi(bwk.o, 400), cpi.this);
      }

      @Override
      protected awx l() {
         return awy.nL;
      }

      @Override
      protected cpu.a m() {
         return cpu.a.f;
      }
   }

   class b extends cpu.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cpi.this.b(bwk.n);
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
         cpi.this.a(new bwi(bwk.n, 1200));
      }

      @Nullable
      @Override
      protected awx l() {
         return awy.nM;
      }

      @Override
      protected cpu.a m() {
         return cpu.a.e;
      }
   }
}
