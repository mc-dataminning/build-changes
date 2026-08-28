import javax.annotation.Nullable;

public class clt extends cmf implements clz {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int b = 3;
   private int ca;
   private final ezr[][] cb;

   public clt(bup<? extends clt> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new ezr[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = ezr.c;
         this.cb[1][$$2] = ezr.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new cmf.b());
      this.bS.a(4, new clt.b());
      this.bS.a(5, new clt.a());
      this.bS.a(6, new cdc<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new ccz(this, 0.6));
      this.bS.a(9, new cck(this, cor.class, 3.0F, 1.0F));
      this.bS.a(10, new cck(this, bvg.class, 8.0F));
      this.bT.a(1, new cdu(this, cqf.class).a());
      this.bT.a(2, new cdv<>(this, cor.class, true).c(300));
      this.bT.a(3, new cdv<>(this, cnx.class, false).c(300));
      this.bT.a(3, new cdv<>(this, chh.class, false).c(300));
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.v, 0.5).a(bwm.m, 18.0).a(bwm.s, 32.0);
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.a(buq.a, new cwf(cwj.ow));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dY().C && this.cr()) {
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
               this.cb[1][$$2] = new ezr(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dY().a(ls.e, this.d(0.5), this.dG(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.nh, this.do(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new ezr(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awn aj_() {
      return awo.nd;
   }

   public ezr[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ezr[] $$2 = new ezr[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awn w() {
      return awo.nd;
   }

   @Override
   protected awn o_() {
      return awo.nf;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.ng;
   }

   @Override
   protected awn gv() {
      return awo.ne;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bve $$0, float $$1) {
      cwf $$2 = this.b(cpm.a(this, cwj.ow));
      cwf $$3 = this.d($$2);
      coy $$4 = cpm.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dD() - this.dD();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dF();
      double $$7 = $$0.dJ() - this.dJ();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dY() instanceof arq $$9) {
         cpk.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.ak().a() * 4));
      }

      this.a(awo.xm, 1.0F, 1.0F / (this.eb().i() * 0.4F + 0.8F));
   }

   @Override
   public clc.a q() {
      if (this.gF()) {
         return clc.a.c;
      } else {
         return this.gk() ? clc.a.d : clc.a.a;
      }
   }

   class a extends cmf.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clt.this.m() == null) {
            return false;
         } else {
            return clt.this.m().as() == this.e ? false : clt.this.dY().d_(clt.this.dy()).a((float)bse.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bve $$0 = clt.this.m();
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
         clt.this.m().b(new btn(btp.o, 400), clt.this);
      }

      @Override
      protected awn l() {
         return awo.ni;
      }

      @Override
      protected cmf.a m() {
         return cmf.a.f;
      }
   }

   class b extends cmf.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clt.this.b(btp.n);
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
         clt.this.a(new btn(btp.n, 1200));
      }

      @Nullable
      @Override
      protected awn l() {
         return awo.nj;
      }

      @Override
      protected cmf.a m() {
         return cmf.a.e;
      }
   }
}
