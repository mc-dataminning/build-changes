import javax.annotation.Nullable;

public class bwa extends bwm implements bwg {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final eei[][] bW;

   public bwa(bfn<? extends bwa> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new eei[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = eei.b;
         this.bW[1][$$2] = eei.b;
      }
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(0, new bmp(this));
      this.bO.a(1, new bwm.b());
      this.bO.a(4, new bwa.b());
      this.bO.a(5, new bwa.a());
      this.bO.a(6, new bnv<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bns(this, 0.6));
      this.bO.a(9, new bnd(this, byo.class, 3.0F, 1.0F));
      this.bO.a(10, new bnd(this, bgb.class, 8.0F));
      this.bP.a(1, new bon(this, bzw.class).a());
      this.bP.a(2, new boo<>(this, byo.class, true).c(300));
      this.bP.a(3, new boo<>(this, bxw.class, false).c(300));
      this.bP.a(3, new boo<>(this, brx.class, false).c(300));
   }

   public static bhf.a r() {
      return bwc.ge().a(bhg.d, 0.5).a(bhg.b, 18.0).a(bhg.a, 32.0);
   }

   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      this.a(bfo.a, new cfz(cgc.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public eed j_() {
      return this.cE().c(3.0, 0.0, 3.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dI().B && this.cb()) {
         this.bV--;
         if (this.bV < 0) {
            this.bV = 0;
         }

         if (this.aL == 1 || this.ag % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new eei(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dI().a(iv.f, this.d(0.5), this.dq(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dI().a(this.dn(), this.dp(), this.dt(), amh.lG, this.cY(), 1.0F, 1.0F, false);
         } else if (this.aL == this.aM - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new eei(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public amg Y_() {
      return amh.lC;
   }

   public eei[] D(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eei[] $$2 = new eei[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean p(bfj $$0) {
      if (super.p($$0)) {
         return true;
      } else {
         return $$0 instanceof bfz && ((bfz)$$0).eN() == bge.d ? this.cd() == null && $$0.cd() == null : false;
      }
   }

   @Override
   protected amg s() {
      return amh.lC;
   }

   @Override
   protected amg g_() {
      return amh.lE;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.lF;
   }

   @Override
   protected amg fY() {
      return amh.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bfz $$0, float $$1) {
      cfz $$2 = this.g(this.b(bzh.a(this, cgc.nG)));
      byu $$3 = bzh.a(this, $$2, $$1);
      double $$4 = $$0.dn() - this.dn();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dp();
      double $$6 = $$0.dt() - this.dt();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dI().ai().a() * 4));
      this.a(amh.vA, 1.0F, 1.0F / (this.ec().i() * 0.4F + 0.8F));
      this.dI().b($$3);
   }

   @Override
   public bvk.a q() {
      if (this.gi()) {
         return bvk.a.c;
      } else {
         return this.fS() ? bvk.a.d : bvk.a.a;
      }
   }

   class a extends bwm.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (bwa.this.j() == null) {
            return false;
         } else {
            return bwa.this.j().af() == this.e ? false : bwa.this.dI().d_(bwa.this.di()).a((float)bdu.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bfz $$0 = bwa.this.j();
         if ($$0 != null) {
            this.e = $$0.af();
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
         bwa.this.j().b(new bfa(bfc.o, 400), bwa.this);
      }

      @Override
      protected amg l() {
         return amh.lH;
      }

      @Override
      protected bwm.a m() {
         return bwm.a.f;
      }
   }

   class b extends bwm.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !bwa.this.a(bfc.n);
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
         bwa.this.b(new bfa(bfc.n, 1200));
      }

      @Nullable
      @Override
      protected amg l() {
         return amh.lI;
      }

      @Override
      protected bwm.a m() {
         return bwm.a.e;
      }
   }
}
