import javax.annotation.Nullable;

public class cox extends cpj implements cpd {
   private static final int e = 4;
   private static final int f = 3;
   public static final int a = 3;
   private int bI;
   private final ffq[][] bJ;

   public cox(bxc<? extends cox> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bJ = new ffq[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bJ[0][$$2] = ffq.c;
         this.bJ[1][$$2] = ffq.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cpj.b());
      this.bF.a(3, new cdx<>(this, cqd.class, 8.0F, 1.0, 1.2));
      this.bF.a(4, new cox.b());
      this.bF.a(5, new cox.a());
      this.bF.a(6, new cfq<>(this, 0.5, 20, 15.0F));
      this.bF.a(8, new cfn(this, 0.6));
      this.bF.a(9, new cey(this, crx.class, 3.0F, 1.0F));
      this.bF.a(10, new cey(this, bxw.class, 8.0F));
      this.bG.a(1, new cgi(this, cto.class).a());
      this.bG.a(2, new cgj<>(this, crx.class, true).c(300));
      this.bG.a(3, new cgj<>(this, cre.class, false).c(300));
      this.bG.a(3, new cgj<>(this, cka.class, false).c(300));
   }

   public static byz.a m() {
      return coz.gx().a(bza.v, 0.5).a(bza.m, 18.0).a(bza.s, 32.0);
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.a(bxd.a, new czy(dac.pj));
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
               this.bJ[1][$$2] = new ffq(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(ly.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awp.nK, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bI = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bJ[0][$$4] = this.bJ[1][$$4];
               this.bJ[1][$$4] = new ffq(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awo ai_() {
      return awp.nG;
   }

   public ffq[] J(float $$0) {
      if (this.bI <= 0) {
         return this.bJ[1];
      } else {
         double $$1 = (double)(((float)this.bI - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ffq[] $$2 = new ffq[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bJ[1][$$3].c(1.0 - $$1).e(this.bJ[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awo u() {
      return awp.nG;
   }

   @Override
   protected awo l_() {
      return awp.nI;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.nJ;
   }

   @Override
   protected awo q() {
      return awp.nH;
   }

   @Override
   public void a(ars $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bxu $$0, float $$1) {
      czy $$2 = this.b(csu.a(this, dac.pj));
      czy $$3 = this.d($$2);
      csf $$4 = csu.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ars $$9) {
         css.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awp.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cof.a j() {
      if (this.gB()) {
         return cof.a.c;
      } else {
         return this.gl() ? cof.a.d : cof.a.a;
      }
   }

   class a extends cpj.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cox.this.f() == null) {
            return false;
         } else {
            return cox.this.f().ao() == this.e ? false : cox.this.dV().d_(cox.this.dv()).a((float)buo.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bxu $$0 = cox.this.f();
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
         cox.this.f().b(new bvx(bvz.o, 400), cox.this);
      }

      @Override
      protected awo l() {
         return awp.nL;
      }

      @Override
      protected cpj.a m() {
         return cpj.a.f;
      }
   }

   class b extends cpj.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cox.this.b(bvz.n);
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
         cox.this.a(new bvx(bvz.n, 1200));
      }

      @Nullable
      @Override
      protected awo l() {
         return awp.nM;
      }

      @Override
      protected cpj.a m() {
         return cpj.a.e;
      }
   }
}
