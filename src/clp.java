import javax.annotation.Nullable;

public class clp extends cmb implements clv {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int b = 3;
   private int ca;
   private final ezn[][] cb;

   public clp(bul<? extends clp> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new ezn[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = ezn.c;
         this.cb[1][$$2] = ezn.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new cmb.b());
      this.bS.a(4, new clp.b());
      this.bS.a(5, new clp.a());
      this.bS.a(6, new ccy<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new ccv(this, 0.6));
      this.bS.a(9, new ccg(this, com.class, 3.0F, 1.0F));
      this.bS.a(10, new ccg(this, bvc.class, 8.0F));
      this.bT.a(1, new cdq(this, cqb.class).a());
      this.bT.a(2, new cdr<>(this, com.class, true).c(300));
      this.bT.a(3, new cdr<>(this, cnt.class, false).c(300));
      this.bT.a(3, new cdr<>(this, chd.class, false).c(300));
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.v, 0.5).a(bwi.m, 18.0).a(bwi.s, 32.0);
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.a(bum.a, new cwb(cwf.ow));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dX().C && this.cq()) {
         this.ca--;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.aN == 1 || this.ag % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new ezn(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dX().a(lr.e, this.d(0.5), this.dF(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dX().a(this.dC(), this.dE(), this.dI(), awl.nh, this.dn(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new ezn(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awk aj_() {
      return awl.nd;
   }

   public ezn[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ezn[] $$2 = new ezn[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awk w() {
      return awl.nd;
   }

   @Override
   protected awk o_() {
      return awl.nf;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.ng;
   }

   @Override
   protected awk gu() {
      return awl.ne;
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bva $$0, float $$1) {
      cwb $$2 = this.b(cpi.a(this, cwf.ow));
      cwb $$3 = this.d($$2);
      cou $$4 = cpi.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dX() instanceof arn $$9) {
         cpg.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.ak().a() * 4));
      }

      this.a(awl.xm, 1.0F, 1.0F / (this.ea().i() * 0.4F + 0.8F));
   }

   @Override
   public cky.a q() {
      if (this.gE()) {
         return cky.a.c;
      } else {
         return this.gj() ? cky.a.d : cky.a.a;
      }
   }

   class a extends cmb.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clp.this.m() == null) {
            return false;
         } else {
            return clp.this.m().as() == this.e ? false : clp.this.dX().d_(clp.this.dx()).a((float)bsa.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bva $$0 = clp.this.m();
         if ($$0 != null) {
            this.e = $$0.as();
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
         clp.this.m().b(new btj(btl.o, 400), clp.this);
      }

      @Override
      protected awk l() {
         return awl.ni;
      }

      @Override
      protected cmb.a m() {
         return cmb.a.f;
      }
   }

   class b extends cmb.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clp.this.b(btl.n);
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
         clp.this.a(new btj(btl.n, 1200));
      }

      @Nullable
      @Override
      protected awk l() {
         return awl.nj;
      }

      @Override
      protected cmb.a m() {
         return cmb.a.e;
      }
   }
}
