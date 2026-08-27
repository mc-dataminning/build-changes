import javax.annotation.Nullable;

public class cjc extends cjo implements cji {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final eum[][] cb;

   public cjc(bsc<? extends cjc> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new eum[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = eum.b;
         this.cb[1][$$2] = eum.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cjo.b());
      this.bS.a(4, new cjc.b());
      this.bS.a(5, new cjc.a());
      this.bS.a(6, new cao<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cal(this, 0.6));
      this.bS.a(9, new bzw(this, cly.class, 3.0F, 1.0F));
      this.bS.a(10, new bzw(this, bss.class, 8.0F));
      this.bT.a(1, new cbg(this, cnk.class).a());
      this.bT.a(2, new cbh<>(this, cly.class, true).c(300));
      this.bT.a(3, new cbh<>(this, clg.class, false).c(300));
      this.bT.a(3, new cbh<>(this, ces.class, false).c(300));
   }

   public static btx.a u() {
      return cje.gv().a(bty.r, 0.5).a(bty.k, 18.0).a(bty.q, 32.0);
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.a(bsd.a, new ctq(ctt.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public euh h_() {
      return this.cK().c(3.0, 0.0, 3.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dP().B && this.ch()) {
         this.ca--;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.aO == 1 || this.ai % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new eum(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dP().a(ky.e, this.d(0.5), this.dx(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dP().a(this.du(), this.dw(), this.dA(), avi.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new eum(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avh ae_() {
      return avi.ne;
   }

   public eum[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eum[] $$2 = new eum[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avh v() {
      return avi.ne;
   }

   @Override
   protected avh o_() {
      return avi.ng;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.nh;
   }

   @Override
   protected avh gp() {
      return avi.nf;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bsq $$0, float $$1) {
      ctq $$2 = this.g(this.b(cms.a(this, ctt.ou)));
      cme $$3 = cms.a(this, $$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().ak().a() * 4));
      this.a(avi.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   @Override
   public cil.a s() {
      if (this.gz()) {
         return cil.a.c;
      } else {
         return this.gh() ? cil.a.d : cil.a.a;
      }
   }

   class a extends cjo.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cjc.this.p() == null) {
            return false;
         } else {
            return cjc.this.p().al() == this.e ? false : cjc.this.dP().d_(cjc.this.dp()).a((float)bpt.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bsq $$0 = cjc.this.p();
         if ($$0 != null) {
            this.e = $$0.al();
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
         cjc.this.p().b(new bre(brg.o, 400), cjc.this);
      }

      @Override
      protected avh l() {
         return avi.nj;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.f;
      }
   }

   class b extends cjo.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cjc.this.b(brg.n);
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
         cjc.this.b(new bre(brg.n, 1200));
      }

      @Nullable
      @Override
      protected avh l() {
         return avi.nk;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.e;
      }
   }
}
