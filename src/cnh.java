import javax.annotation.Nullable;

public class cnh extends cnt implements cnn {
   private static final int bE = 4;
   private static final int bF = 3;
   public static final int a = 3;
   private int bG;
   private final fcu[][] bH;

   public cnh(bwb<? extends cnh> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
      this.bH = new fcu[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bH[0][$$2] = fcu.c;
         this.bH[1][$$2] = fcu.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new cnt.b());
      this.bB.a(3, new ccu<>(this, coo.class, 8.0F, 1.0, 1.2));
      this.bB.a(4, new cnh.b());
      this.bB.a(5, new cnh.a());
      this.bB.a(6, new cen<>(this, 0.5, 20, 15.0F));
      this.bB.a(8, new cek(this, 0.6));
      this.bB.a(9, new cdv(this, cqi.class, 3.0F, 1.0F));
      this.bB.a(10, new cdv(this, bwt.class, 8.0F));
      this.bC.a(1, new cff(this, crw.class).a());
      this.bC.a(2, new cfg<>(this, cqi.class, true).c(300));
      this.bC.a(3, new cfg<>(this, cpp.class, false).c(300));
      this.bC.a(3, new cfg<>(this, cis.class, false).c(300));
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.v, 0.5).a(bxx.m, 18.0).a(bxx.s, 32.0);
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.a(bwc.a, new cxy(cyc.pe));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV().C && this.cp()) {
         this.bG--;
         if (this.bG < 0) {
            this.bG = 0;
         }

         if (this.aM == 1 || this.af % 1200 == 0) {
            this.bG = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bH[0][$$2] = this.bH[1][$$2];
               this.bH[1][$$2] = new fcu(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lv.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awk.nG, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aM == this.aN - 1) {
            this.bG = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bH[0][$$4] = this.bH[1][$$4];
               this.bH[1][$$4] = new fcu(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awj ad_() {
      return awk.nC;
   }

   public fcu[] K(float $$0) {
      if (this.bG <= 0) {
         return this.bH[1];
      } else {
         double $$1 = (double)(((float)this.bG - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fcu[] $$2 = new fcu[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bH[1][$$3].c(1.0 - $$1).e(this.bH[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awj u() {
      return awk.nC;
   }

   @Override
   protected awj l_() {
      return awk.nE;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.nF;
   }

   @Override
   protected awj q() {
      return awk.nD;
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bwr $$0, float $$1) {
      cxy $$2 = this.b(crd.a(this, cyc.pe));
      cxy $$3 = this.e($$2);
      cqp $$4 = crd.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arn $$9) {
         crb.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awk.xX, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cmq.a j() {
      if (this.gx()) {
         return cmq.a.c;
      } else {
         return this.gh() ? cmq.a.d : cmq.a.a;
      }
   }

   class a extends cnt.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cnh.this.f() == null) {
            return false;
         } else {
            return cnh.this.f().ar() == this.e ? false : cnh.this.dV().d_(cnh.this.dv()).a((float)btn.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bwr $$0 = cnh.this.f();
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
         cnh.this.f().b(new buw(buy.o, 400), cnh.this);
      }

      @Override
      protected awj l() {
         return awk.nH;
      }

      @Override
      protected cnt.a m() {
         return cnt.a.f;
      }
   }

   class b extends cnt.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cnh.this.b(buy.n);
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
         cnh.this.a(new buw(buy.n, 1200));
      }

      @Nullable
      @Override
      protected awj l() {
         return awk.nI;
      }

      @Override
      protected cnt.a m() {
         return cnt.a.e;
      }
   }
}
