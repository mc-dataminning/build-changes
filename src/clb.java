import javax.annotation.Nullable;

public class clb extends cln implements clh {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int b = 3;
   private int ca;
   private final eyw[][] cb;

   public clb(bty<? extends clb> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new eyw[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = eyw.c;
         this.cb[1][$$2] = eyw.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new cln.b());
      this.bS.a(4, new clb.b());
      this.bS.a(5, new clb.a());
      this.bS.a(6, new cck<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cch(this, 0.6));
      this.bS.a(9, new cbs(this, cnx.class, 3.0F, 1.0F));
      this.bS.a(10, new cbs(this, bup.class, 8.0F));
      this.bT.a(1, new cdc(this, cpm.class).a());
      this.bT.a(2, new cdd<>(this, cnx.class, true).c(300));
      this.bT.a(3, new cdd<>(this, cnf.class, false).c(300));
      this.bT.a(3, new cdd<>(this, cgp.class, false).c(300));
   }

   public static bvt.a t() {
      return cld.gu().a(bvu.v, 0.5).a(bvu.m, 18.0).a(bvu.s, 32.0);
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.a(btz.a, new cvs(cvw.ow));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void n_() {
      super.n_();
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
               this.cb[1][$$2] = new eyw(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dS().a(lo.e, this.d(0.5), this.dA(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dS().a(this.dx(), this.dz(), this.dD(), awg.nj, this.di(), 1.0F, 1.0F, false);
         } else if (this.aJ == this.aK - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new eyw(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awf ai_() {
      return awg.nf;
   }

   public eyw[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eyw[] $$2 = new eyw[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awf w() {
      return awg.nf;
   }

   @Override
   protected awf o_() {
      return awg.nh;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.ni;
   }

   @Override
   protected awf go() {
      return awg.ng;
   }

   @Override
   public void a(arj $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bun $$0, float $$1) {
      cvs $$2 = this.b(cot.a(this, cvw.ow));
      cvs $$3 = this.f($$2);
      coe $$4 = cot.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dx() - this.dx();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dz();
      double $$7 = $$0.dD() - this.dD();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dS() instanceof arj $$9) {
         cor.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awg.xo, 1.0F, 1.0F / (this.dV().i() * 0.4F + 0.8F));
   }

   @Override
   public ckk.a q() {
      if (this.gy()) {
         return ckk.a.c;
      } else {
         return this.gf() ? ckk.a.d : ckk.a.a;
      }
   }

   class a extends cln.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clb.this.m() == null) {
            return false;
         } else {
            return clb.this.m().ap() == this.e ? false : clb.this.dS().d_(clb.this.ds()).a((float)brp.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bun $$0 = clb.this.m();
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
         clb.this.m().b(new bsy(bta.o, 400), clb.this);
      }

      @Override
      protected awf l() {
         return awg.nk;
      }

      @Override
      protected cln.a m() {
         return cln.a.f;
      }
   }

   class b extends cln.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clb.this.b(bta.n);
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
         clb.this.a(new bsy(bta.n, 1200));
      }

      @Nullable
      @Override
      protected awf l() {
         return awg.nl;
      }

      @Override
      protected cln.a m() {
         return cln.a.e;
      }
   }
}
