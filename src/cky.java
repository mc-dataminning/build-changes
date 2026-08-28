import javax.annotation.Nullable;

public class cky extends clk implements cle {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int b = 3;
   private int ca;
   private final eys[][] cb;

   public cky(btv<? extends cky> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new eys[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = eys.c;
         this.cb[1][$$2] = eys.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new clk.b());
      this.bS.a(4, new cky.b());
      this.bS.a(5, new cky.a());
      this.bS.a(6, new cch<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cce(this, 0.6));
      this.bS.a(9, new cbp(this, cnu.class, 3.0F, 1.0F));
      this.bS.a(10, new cbp(this, bum.class, 8.0F));
      this.bT.a(1, new ccz(this, cpj.class).a());
      this.bT.a(2, new cda<>(this, cnu.class, true).c(300));
      this.bT.a(3, new cda<>(this, cnc.class, false).c(300));
      this.bT.a(3, new cda<>(this, cgm.class, false).c(300));
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.v, 0.5).a(bvr.m, 18.0).a(bvr.s, 32.0);
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.a(btw.a, new cvp(cvt.ow));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dS().B && this.cm()) {
         this.ca--;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.aJ == 1 || this.ag % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new eys(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dS().a(ln.e, this.d(0.5), this.dA(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dS().a(this.dx(), this.dz(), this.dD(), awe.nj, this.di(), 1.0F, 1.0F, false);
         } else if (this.aJ == this.aK - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new eys(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awd ah_() {
      return awe.nf;
   }

   public eys[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eys[] $$2 = new eys[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awd w() {
      return awe.nf;
   }

   @Override
   protected awd n_() {
      return awe.nh;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.ni;
   }

   @Override
   protected awd gp() {
      return awe.ng;
   }

   @Override
   public void a(arh $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(buk $$0, float $$1) {
      cvp $$2 = this.b(coq.a(this, cvt.ow));
      cvp $$3 = this.f($$2);
      cob $$4 = coq.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arh $$9) {
         coo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awe.xo, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   @Override
   public ckh.a q() {
      if (this.gz()) {
         return ckh.a.c;
      } else {
         return this.gg() ? ckh.a.d : ckh.a.a;
      }
   }

   class a extends clk.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cky.this.m() == null) {
            return false;
         } else {
            return cky.this.m().ap() == this.e ? false : cky.this.dS().d_(cky.this.ds()).a((float)brm.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         buk $$0 = cky.this.m();
         if ($$0 != null) {
            this.e = $$0.ap();
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
         cky.this.m().b(new bsv(bsx.o, 400), cky.this);
      }

      @Override
      protected awd l() {
         return awe.nk;
      }

      @Override
      protected clk.a m() {
         return clk.a.f;
      }
   }

   class b extends clk.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cky.this.b(bsx.n);
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
         cky.this.a(new bsv(bsx.n, 1200));
      }

      @Nullable
      @Override
      protected awd l() {
         return awe.nl;
      }

      @Override
      protected clk.a m() {
         return clk.a.e;
      }
   }
}
