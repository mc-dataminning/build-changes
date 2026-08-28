import javax.annotation.Nullable;

public class cjz extends ckl implements ckf {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final evp[][] cb;

   public cjz(bsy<? extends cjz> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new evp[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = evp.b;
         this.cb[1][$$2] = evp.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caf(this));
      this.bS.a(1, new ckl.b());
      this.bS.a(4, new cjz.b());
      this.bS.a(5, new cjz.a());
      this.bS.a(6, new cbl<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cbi(this, 0.6));
      this.bS.a(9, new cat(this, cmv.class, 3.0F, 1.0F));
      this.bS.a(10, new cat(this, btp.class, 8.0F));
      this.bT.a(1, new ccd(this, coh.class).a());
      this.bT.a(2, new cce<>(this, cmv.class, true).c(300));
      this.bT.a(3, new cce<>(this, cmd.class, false).c(300));
      this.bT.a(3, new cce<>(this, cfp.class, false).c(300));
   }

   public static buu.a u() {
      return ckb.gw().a(buv.r, 0.5).a(buv.k, 18.0).a(buv.q, 32.0);
   }

   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      this.a(bsz.a, new cun(cuq.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evk h_() {
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
               this.cb[1][$$2] = new evp(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dP().a(li.e, this.d(0.5), this.dx(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dP().a(this.du(), this.dw(), this.dA(), avz.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new evp(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avy ae_() {
      return avz.ne;
   }

   public evp[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         evp[] $$2 = new evp[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avy v() {
      return avz.ne;
   }

   @Override
   protected avy o_() {
      return avz.ng;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.nh;
   }

   @Override
   protected avy gq() {
      return avz.nf;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(btn $$0, float $$1) {
      cun $$2 = this.g(this.b(cnp.a(this, cuq.ou)));
      cnb $$3 = cnp.a(this, $$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().al().a() * 4));
      this.a(avz.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   @Override
   public cji.a s() {
      if (this.gA()) {
         return cji.a.c;
      } else {
         return this.gi() ? cji.a.d : cji.a.a;
      }
   }

   class a extends ckl.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cjz.this.p() == null) {
            return false;
         } else {
            return cjz.this.p().al() == this.e ? false : cjz.this.dP().d_(cjz.this.dp()).a((float)bqp.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         btn $$0 = cjz.this.p();
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
         cjz.this.p().b(new bsa(bsc.o, 400), cjz.this);
      }

      @Override
      protected avy l() {
         return avz.nj;
      }

      @Override
      protected ckl.a m() {
         return ckl.a.f;
      }
   }

   class b extends ckl.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cjz.this.b(bsc.n);
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
         cjz.this.b(new bsa(bsc.n, 1200));
      }

      @Nullable
      @Override
      protected avy l() {
         return avz.nk;
      }

      @Override
      protected ckl.a m() {
         return ckl.a.e;
      }
   }
}
