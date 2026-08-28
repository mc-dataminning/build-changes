import javax.annotation.Nullable;

public class clk extends clw implements clq {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int b = 3;
   private int ca;
   private final ezh[][] cb;

   public clk(bug<? extends clk> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new ezh[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = ezh.c;
         this.cb[1][$$2] = ezh.c;
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new clw.b());
      this.bS.a(4, new clk.b());
      this.bS.a(5, new clk.a());
      this.bS.a(6, new cct<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new ccq(this, 0.6));
      this.bS.a(9, new ccb(this, coh.class, 3.0F, 1.0F));
      this.bS.a(10, new ccb(this, bux.class, 8.0F));
      this.bT.a(1, new cdl(this, cpw.class).a());
      this.bT.a(2, new cdm<>(this, coh.class, true).c(300));
      this.bT.a(3, new cdm<>(this, cno.class, false).c(300));
      this.bT.a(3, new cdm<>(this, cgy.class, false).c(300));
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.v, 0.5).a(bwd.m, 18.0).a(bwd.s, 32.0);
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.a(buh.a, new cvx(cwb.ow));
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

         if (this.aK == 1 || this.ag % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new ezh(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dX().a(lq.e, this.d(0.5), this.dF(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dX().a(this.dC(), this.dE(), this.dI(), awk.nh, this.dn(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new ezh(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awj aj_() {
      return awk.nd;
   }

   public ezh[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ezh[] $$2 = new ezh[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awj w() {
      return awk.nd;
   }

   @Override
   protected awj o_() {
      return awk.nf;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.ng;
   }

   @Override
   protected awj gv() {
      return awk.ne;
   }

   @Override
   public void a(arm $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(buv $$0, float $$1) {
      cvx $$2 = this.b(cpd.a(this, cwb.ow));
      cvx $$3 = this.d($$2);
      cop $$4 = cpd.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dC() - this.dC();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dE();
      double $$7 = $$0.dI() - this.dI();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dX() instanceof arm $$9) {
         cpb.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awk.xm, 1.0F, 1.0F / (this.ea().i() * 0.4F + 0.8F));
   }

   @Override
   public ckt.a q() {
      if (this.gF()) {
         return ckt.a.c;
      } else {
         return this.gk() ? ckt.a.d : ckt.a.a;
      }
   }

   class a extends clw.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clk.this.m() == null) {
            return false;
         } else {
            return clk.this.m().ar() == this.e ? false : clk.this.dX().d_(clk.this.dx()).a((float)brv.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         buv $$0 = clk.this.m();
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
         clk.this.m().b(new bte(btg.o, 400), clk.this);
      }

      @Override
      protected awj l() {
         return awk.ni;
      }

      @Override
      protected clw.a m() {
         return clw.a.f;
      }
   }

   class b extends clw.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clk.this.b(btg.n);
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
         clk.this.a(new bte(btg.n, 1200));
      }

      @Nullable
      @Override
      protected awj l() {
         return awk.nj;
      }

      @Override
      protected clw.a m() {
         return clw.a.e;
      }
   }
}
