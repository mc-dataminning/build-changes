import javax.annotation.Nullable;

public class cjp extends ckb implements cjv {
   private static final int e = 4;
   private static final int ca = 3;
   private static final int cb = 3;
   private int cc;
   private final ewh[][] cd;

   public cjp(bsn<? extends cjp> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.cd = new ewh[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cd[0][$$2] = ewh.b;
         this.cd[1][$$2] = ewh.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new ckb.b());
      this.bU.a(4, new cjp.b());
      this.bU.a(5, new cjp.a());
      this.bU.a(6, new cba<>(this, 0.5, 20, 15.0F));
      this.bU.a(8, new cax(this, 0.6));
      this.bU.a(9, new cai(this, cml.class, 3.0F, 1.0F));
      this.bU.a(10, new cai(this, bte.class, 8.0F));
      this.bV.a(1, new cbs(this, cnx.class).a());
      this.bV.a(2, new cbt<>(this, cml.class, true).c(300));
      this.bV.a(3, new cbt<>(this, clt.class, false).c(300));
      this.bV.a(3, new cbt<>(this, cfe.class, false).c(300));
   }

   public static buj.a t() {
      return cjr.gt().a(buk.v, 0.5).a(buk.m, 18.0).a(buk.s, 32.0);
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.a(bso.a, new cud(cug.ov));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewc h_() {
      return this.cM().c(3.0, 0.0, 3.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dR().B && this.cj()) {
         this.cc--;
         if (this.cc < 0) {
            this.cc = 0;
         }

         if (this.aP == 1 || this.ai % 1200 == 0) {
            this.cc = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cd[0][$$2] = this.cd[1][$$2];
               this.cd[1][$$2] = new ewh(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dR().a(lj.e, this.d(0.5), this.dz(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dR().a(this.dw(), this.dy(), this.dC(), avh.ni, this.dg(), 1.0F, 1.0F, false);
         } else if (this.aP == this.aQ - 1) {
            this.cc = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cd[0][$$4] = this.cd[1][$$4];
               this.cd[1][$$4] = new ewh(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avg ae_() {
      return avh.ne;
   }

   public ewh[] H(float $$0) {
      if (this.cc <= 0) {
         return this.cd[1];
      } else {
         double $$1 = (double)(((float)this.cc - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ewh[] $$2 = new ewh[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cd[1][$$3].a(1.0 - $$1).e(this.cd[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avg v() {
      return avh.ne;
   }

   @Override
   protected avg n_() {
      return avh.ng;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.nh;
   }

   @Override
   protected avg gn() {
      return avh.nf;
   }

   @Override
   public void a(aqm $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(btc $$0, float $$1) {
      cud $$2 = this.b(cnf.a(this, cug.ov));
      cud $$3 = this.g($$2);
      cmr $$4 = cnf.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dw() - this.dw();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dy();
      double $$7 = $$0.dC() - this.dC();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dR().al().a() * 4));
      this.a(avh.xn, 1.0F, 1.0F / (this.dU().i() * 0.4F + 0.8F));
      this.dR().b($$4);
   }

   @Override
   public ciy.a s() {
      if (this.gx()) {
         return ciy.a.c;
      } else {
         return this.ge() ? ciy.a.d : ciy.a.a;
      }
   }

   class a extends ckb.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cjp.this.p() == null) {
            return false;
         } else {
            return cjp.this.p().an() == this.e ? false : cjp.this.dR().d_(cjp.this.dr()).a((float)bqe.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         btc $$0 = cjp.this.p();
         if ($$0 != null) {
            this.e = $$0.an();
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
         cjp.this.p().b(new brp(brr.o, 400), cjp.this);
      }

      @Override
      protected avg l() {
         return avh.nj;
      }

      @Override
      protected ckb.a m() {
         return ckb.a.f;
      }
   }

   class b extends ckb.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cjp.this.b(brr.n);
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
         cjp.this.b(new brp(brr.n, 1200));
      }

      @Nullable
      @Override
      protected avg l() {
         return avh.nk;
      }

      @Override
      protected ckb.a m() {
         return ckb.a.e;
      }
   }
}
