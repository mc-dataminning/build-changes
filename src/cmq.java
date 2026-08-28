import javax.annotation.Nullable;

public class cmq extends cnc implements cmw {
   private static final int bZ = 4;
   private static final int ca = 3;
   public static final int a = 3;
   private int cb;
   private final fbs[][] cc;

   public cmq(bvm<? extends cmq> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.cc = new fbs[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cc[0][$$2] = fbs.c;
         this.cc[1][$$2] = fbs.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cnc.b());
      this.bT.a(3, new ccg<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cmq.b());
      this.bT.a(5, new cmq.a());
      this.bT.a(6, new cdz<>(this, 0.5, 20, 15.0F));
      this.bT.a(8, new cdw(this, 0.6));
      this.bT.a(9, new cdh(this, cps.class, 3.0F, 1.0F));
      this.bT.a(10, new cdh(this, bwd.class, 8.0F));
      this.bU.a(1, new cer(this, crg.class).a());
      this.bU.a(2, new ces<>(this, cps.class, true).c(300));
      this.bU.a(3, new ces<>(this, coz.class, false).c(300));
      this.bU.a(3, new ces<>(this, cie.class, false).c(300));
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.v, 0.5).a(bxj.m, 18.0).a(bxj.s, 32.0);
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.a(bvn.a, new cxk(cxo.oR));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV().C && this.cp()) {
         this.cb--;
         if (this.cb < 0) {
            this.cb = 0;
         }

         if (this.aN == 1 || this.af % 1200 == 0) {
            this.cb = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cc[0][$$2] = this.cc[1][$$2];
               this.cc[1][$$2] = new fbs(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(ls.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), axf.nz, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.cb = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cc[0][$$4] = this.cc[1][$$4];
               this.cc[1][$$4] = new fbs(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public axe ak_() {
      return axf.nv;
   }

   public fbs[] J(float $$0) {
      if (this.cb <= 0) {
         return this.cc[1];
      } else {
         double $$1 = (double)(((float)this.cb - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fbs[] $$2 = new fbs[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cc[1][$$3].c(1.0 - $$1).e(this.cc[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected axe u() {
      return axf.nv;
   }

   @Override
   protected axe o_() {
      return axf.nx;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ny;
   }

   @Override
   protected axe x() {
      return axf.nw;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bwb $$0, float $$1) {
      cxk $$2 = this.b(cqn.a(this, cxo.oR));
      cxk $$3 = this.d($$2);
      cpz $$4 = cqn.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ash $$9) {
         cql.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.al().a() * 4));
      }

      this.a(axf.xG, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public clz.a m() {
      if (this.gv()) {
         return clz.a.c;
      } else {
         return this.gb() ? clz.a.d : clz.a.a;
      }
   }

   class a extends cnc.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cmq.this.O_() == null) {
            return false;
         } else {
            return cmq.this.O_().ar() == this.e ? false : cmq.this.dV().d_(cmq.this.dv()).a((float)btb.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bwb $$0 = cmq.this.O_();
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
         cmq.this.O_().b(new buk(bum.o, 400), cmq.this);
      }

      @Override
      protected axe l() {
         return axf.nA;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.f;
      }
   }

   class b extends cnc.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cmq.this.b(bum.n);
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
         cmq.this.a(new buk(bum.n, 1200));
      }

      @Nullable
      @Override
      protected axe l() {
         return axf.nB;
      }

      @Override
      protected cnc.a m() {
         return cnc.a.e;
      }
   }
}
