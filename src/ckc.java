import javax.annotation.Nullable;

public class ckc extends cko implements cki {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final evs[][] cb;

   public ckc(btb<? extends ckc> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new evs[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = evs.b;
         this.cb[1][$$2] = evs.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cko.b());
      this.bS.a(4, new ckc.b());
      this.bS.a(5, new ckc.a());
      this.bS.a(6, new cbo<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cbl(this, 0.6));
      this.bS.a(9, new caw(this, cmy.class, 3.0F, 1.0F));
      this.bS.a(10, new caw(this, bts.class, 8.0F));
      this.bT.a(1, new ccg(this, cok.class).a());
      this.bT.a(2, new cch<>(this, cmy.class, true).c(300));
      this.bT.a(3, new cch<>(this, cmg.class, false).c(300));
      this.bT.a(3, new cch<>(this, cfs.class, false).c(300));
   }

   public static bux.a u() {
      return cke.gw().a(buy.r, 0.5).a(buy.k, 18.0).a(buy.q, 32.0);
   }

   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      this.a(btc.a, new cuq(cut.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evn h_() {
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
               this.cb[1][$$2] = new evs(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dP().a(li.e, this.d(0.5), this.dx(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dP().a(this.du(), this.dw(), this.dA(), awa.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new evs(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avz ae_() {
      return awa.ne;
   }

   public evs[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         evs[] $$2 = new evs[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avz v() {
      return awa.ne;
   }

   @Override
   protected avz o_() {
      return awa.ng;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.nh;
   }

   @Override
   protected avz gq() {
      return awa.nf;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(btq $$0, float $$1) {
      cuq $$2 = this.g(this.b(cns.a(this, cut.ou)));
      cne $$3 = cns.a(this, $$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(awa.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   @Override
   public cjl.a s() {
      if (this.gA()) {
         return cjl.a.c;
      } else {
         return this.gi() ? cjl.a.d : cjl.a.a;
      }
   }

   class a extends cko.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (ckc.this.p() == null) {
            return false;
         } else {
            return ckc.this.p().al() == this.e ? false : ckc.this.dP().d_(ckc.this.dp()).a((float)bqs.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         btq $$0 = ckc.this.p();
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
         ckc.this.p().b(new bsd(bsf.o, 400), ckc.this);
      }

      @Override
      protected avz l() {
         return awa.nj;
      }

      @Override
      protected cko.a m() {
         return cko.a.f;
      }
   }

   class b extends cko.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !ckc.this.b(bsf.n);
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
         ckc.this.b(new bsd(bsf.n, 1200));
      }

      @Nullable
      @Override
      protected avz l() {
         return awa.nk;
      }

      @Override
      protected cko.a m() {
         return cko.a.e;
      }
   }
}
