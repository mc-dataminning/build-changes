import javax.annotation.Nullable;

public class byz extends bzl implements bzf {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehe[][] bW;

   public byz(bim<? extends byz> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehe[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehe.b;
         this.bW[1][$$2] = ehe.b;
      }
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new bzl.b());
      this.bO.a(4, new byz.b());
      this.bO.a(5, new byz.a());
      this.bO.a(6, new bqu<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bqr(this, 0.6));
      this.bO.a(9, new bqc(this, cbn.class, 3.0F, 1.0F));
      this.bO.a(10, new bqc(this, bja.class, 8.0F));
      this.bP.a(1, new brm(this, ccv.class).a());
      this.bP.a(2, new brn<>(this, cbn.class, true).c(300));
      this.bP.a(3, new brn<>(this, cav.class, false).c(300));
      this.bP.a(3, new brn<>(this, buw.class, false).c(300));
   }

   public static bke.a q() {
      return bzb.gf().a(bkf.d, 0.5).a(bkf.b, 18.0).a(bkf.a, 32.0);
   }

   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      this.a(bin.a, new ciy(cjb.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public egz k_() {
      return this.cG().c(3.0, 0.0, 3.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dK().B && this.cd()) {
         this.bV--;
         if (this.bV < 0) {
            this.bV = 0;
         }

         if (this.aK == 1 || this.ah % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new ehe(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dK().a(iv.f, this.d(0.5), this.ds(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dK().a(this.dp(), this.dr(), this.dv(), aow.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehe(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aov Y_() {
      return aow.lC;
   }

   public ehe[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehe[] $$2 = new ehe[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bii $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aov r() {
      return aow.lC;
   }

   @Override
   protected aov h_() {
      return aow.lE;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.lF;
   }

   @Override
   protected aov fZ() {
      return aow.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(biy $$0, float $$1) {
      ciy $$2 = this.g(this.b(ccg.a(this, cjb.nG)));
      cbt $$3 = ccg.a(this, $$2, $$1);
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dK().ai().a() * 4));
      this.a(aow.vA, 1.0F, 1.0F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$3);
   }

   @Override
   public byj.a p() {
      if (this.gj()) {
         return byj.a.c;
      } else {
         return this.fS() ? byj.a.d : byj.a.a;
      }
   }

   class a extends bzl.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (byz.this.j() == null) {
            return false;
         } else {
            return byz.this.j().ah() == this.e ? false : byz.this.dK().d_(byz.this.dk()).a((float)bgn.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         biy $$0 = byz.this.j();
         if ($$0 != null) {
            this.e = $$0.ah();
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
         byz.this.j().b(new bhv(bhx.o, 400), byz.this);
      }

      @Override
      protected aov l() {
         return aow.lH;
      }

      @Override
      protected bzl.a m() {
         return bzl.a.f;
      }
   }

   class b extends bzl.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !byz.this.a(bhx.n);
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
         byz.this.b(new bhv(bhx.n, 1200));
      }

      @Nullable
      @Override
      protected aov l() {
         return aow.lI;
      }

      @Override
      protected bzl.a m() {
         return bzl.a.e;
      }
   }
}
