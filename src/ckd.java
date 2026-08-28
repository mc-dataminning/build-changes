import javax.annotation.Nullable;

public class ckd extends ckp implements ckj {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final evt[][] cb;

   public ckd(btc<? extends ckd> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new evt[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = evt.b;
         this.cb[1][$$2] = evt.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caj(this));
      this.bS.a(1, new ckp.b());
      this.bS.a(4, new ckd.b());
      this.bS.a(5, new ckd.a());
      this.bS.a(6, new cbp<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cbm(this, 0.6));
      this.bS.a(9, new cax(this, cmz.class, 3.0F, 1.0F));
      this.bS.a(10, new cax(this, btt.class, 8.0F));
      this.bT.a(1, new cch(this, col.class).a());
      this.bT.a(2, new cci<>(this, cmz.class, true).c(300));
      this.bT.a(3, new cci<>(this, cmh.class, false).c(300));
      this.bT.a(3, new cci<>(this, cft.class, false).c(300));
   }

   public static buy.a u() {
      return ckf.gw().a(buz.r, 0.5).a(buz.k, 18.0).a(buz.q, 32.0);
   }

   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      this.a(btd.a, new cur(cuu.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evo h_() {
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
               this.cb[1][$$2] = new evt(
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
               this.cb[1][$$4] = new evt(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avz ae_() {
      return awa.ne;
   }

   public evt[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         evt[] $$2 = new evt[4];

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
   protected avz d(brp $$0) {
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
   public void a(btr $$0, float $$1) {
      cur $$2 = this.g(this.b(cnt.a(this, cuu.ou)));
      cnf $$3 = cnt.a(this, $$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(awa.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   @Override
   public cjm.a s() {
      if (this.gA()) {
         return cjm.a.c;
      } else {
         return this.gi() ? cjm.a.d : cjm.a.a;
      }
   }

   class a extends ckp.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (ckd.this.p() == null) {
            return false;
         } else {
            return ckd.this.p().al() == this.e ? false : ckd.this.dP().d_(ckd.this.dp()).a((float)bqt.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         btr $$0 = ckd.this.p();
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
         ckd.this.p().b(new bse(bsg.o, 400), ckd.this);
      }

      @Override
      protected avz l() {
         return awa.nj;
      }

      @Override
      protected ckp.a m() {
         return ckp.a.f;
      }
   }

   class b extends ckp.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !ckd.this.b(bsg.n);
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
         ckd.this.b(new bse(bsg.n, 1200));
      }

      @Nullable
      @Override
      protected avz l() {
         return awa.nk;
      }

      @Override
      protected ckp.a m() {
         return ckp.a.e;
      }
   }
}
