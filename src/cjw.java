import javax.annotation.Nullable;

public class cjw extends cki implements ckc {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final evm[][] cb;

   public cjw(bsv<? extends cjw> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new evm[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = evm.b;
         this.cb[1][$$2] = evm.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cki.b());
      this.bS.a(4, new cjw.b());
      this.bS.a(5, new cjw.a());
      this.bS.a(6, new cbi<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cbf(this, 0.6));
      this.bS.a(9, new caq(this, cms.class, 3.0F, 1.0F));
      this.bS.a(10, new caq(this, btm.class, 8.0F));
      this.bT.a(1, new cca(this, coe.class).a());
      this.bT.a(2, new ccb<>(this, cms.class, true).c(300));
      this.bT.a(3, new ccb<>(this, cma.class, false).c(300));
      this.bT.a(3, new ccb<>(this, cfm.class, false).c(300));
   }

   public static bur.a u() {
      return cjy.gw().a(bus.r, 0.5).a(bus.k, 18.0).a(bus.q, 32.0);
   }

   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      this.a(bsw.a, new cuk(cun.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evh h_() {
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
               this.cb[1][$$2] = new evm(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dP().a(lj.e, this.d(0.5), this.dx(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dP().a(this.du(), this.dw(), this.dA(), avw.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new evm(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avv ae_() {
      return avw.ne;
   }

   public evm[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         evm[] $$2 = new evm[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avv v() {
      return avw.ne;
   }

   @Override
   protected avv o_() {
      return avw.ng;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.nh;
   }

   @Override
   protected avv gq() {
      return avw.nf;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(btk $$0, float $$1) {
      cuk $$2 = this.g(this.b(cnm.a(this, cun.ou)));
      cmy $$3 = cnm.a(this, $$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avw.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   @Override
   public cjf.a s() {
      if (this.gA()) {
         return cjf.a.c;
      } else {
         return this.gi() ? cjf.a.d : cjf.a.a;
      }
   }

   class a extends cki.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cjw.this.p() == null) {
            return false;
         } else {
            return cjw.this.p().al() == this.e ? false : cjw.this.dP().d_(cjw.this.dp()).a((float)bqm.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         btk $$0 = cjw.this.p();
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
         cjw.this.p().b(new brx(brz.o, 400), cjw.this);
      }

      @Override
      protected avv l() {
         return avw.nj;
      }

      @Override
      protected cki.a m() {
         return cki.a.f;
      }
   }

   class b extends cki.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cjw.this.b(brz.n);
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
         cjw.this.b(new brx(brz.n, 1200));
      }

      @Nullable
      @Override
      protected avv l() {
         return avw.nk;
      }

      @Override
      protected cki.a m() {
         return cki.a.e;
      }
   }
}
