import javax.annotation.Nullable;

public class cja extends cjm implements cjg {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final euk[][] cb;

   public cja(bsa<? extends cja> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new euk[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = euk.b;
         this.cb[1][$$2] = euk.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new cjm.b());
      this.bS.a(4, new cja.b());
      this.bS.a(5, new cja.a());
      this.bS.a(6, new cam<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new caj(this, 0.6));
      this.bS.a(9, new bzu(this, clw.class, 3.0F, 1.0F));
      this.bS.a(10, new bzu(this, bsq.class, 8.0F));
      this.bT.a(1, new cbe(this, cni.class).a());
      this.bT.a(2, new cbf<>(this, clw.class, true).c(300));
      this.bT.a(3, new cbf<>(this, cle.class, false).c(300));
      this.bT.a(3, new cbf<>(this, ceq.class, false).c(300));
   }

   public static btv.a u() {
      return cjc.gv().a(btw.r, 0.5).a(btw.k, 18.0).a(btw.q, 32.0);
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.a(bsb.a, new cto(ctr.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public euf h_() {
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

         if (this.aP == 1 || this.ai % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new euk(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dP().a(ky.e, this.d(0.5), this.dx(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dP().a(this.du(), this.dw(), this.dA(), avh.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aP == this.aQ - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new euk(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avg ae_() {
      return avh.ne;
   }

   public euk[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         euk[] $$2 = new euk[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avg v() {
      return avh.ne;
   }

   @Override
   protected avg o_() {
      return avh.ng;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.nh;
   }

   @Override
   protected avg gp() {
      return avh.nf;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bso $$0, float $$1) {
      cto $$2 = this.g(this.b(cmq.a(this, ctr.ou)));
      cmc $$3 = cmq.a(this, $$2, $$1);
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dP().ak().a() * 4));
      this.a(avh.xk, 1.0F, 1.0F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$3);
   }

   @Override
   public cij.a s() {
      if (this.gz()) {
         return cij.a.c;
      } else {
         return this.gh() ? cij.a.d : cij.a.a;
      }
   }

   class a extends cjm.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cja.this.p() == null) {
            return false;
         } else {
            return cja.this.p().al() == this.e ? false : cja.this.dP().d_(cja.this.dp()).a((float)bpr.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bso $$0 = cja.this.p();
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
         cja.this.p().b(new brc(bre.o, 400), cja.this);
      }

      @Override
      protected avg l() {
         return avh.nj;
      }

      @Override
      protected cjm.a m() {
         return cjm.a.f;
      }
   }

   class b extends cjm.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cja.this.b(bre.n);
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
         cja.this.b(new brc(bre.n, 1200));
      }

      @Nullable
      @Override
      protected avg l() {
         return avh.nk;
      }

      @Override
      protected cjm.a m() {
         return cjm.a.e;
      }
   }
}
