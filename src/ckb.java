import javax.annotation.Nullable;

public class ckb extends ckn implements ckh {
   private static final int e = 4;
   private static final int cc = 3;
   private static final int cd = 3;
   private int ce;
   private final exc[][] cf;

   public ckb(bsx<? extends ckb> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = 5;
      this.cf = new exc[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cf[0][$$2] = exc.b;
         this.cf[1][$$2] = exc.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bW.a(0, new cag(this));
      this.bW.a(1, new ckn.b());
      this.bW.a(4, new ckb.b());
      this.bW.a(5, new ckb.a());
      this.bW.a(6, new cbm<>(this, 0.5, 20, 15.0F));
      this.bW.a(8, new cbj(this, 0.6));
      this.bW.a(9, new cau(this, cmx.class, 3.0F, 1.0F));
      this.bW.a(10, new cau(this, btp.class, 8.0F));
      this.bX.a(1, new cce(this, coj.class).a());
      this.bX.a(2, new ccf<>(this, cmx.class, true).c(300));
      this.bX.a(3, new ccf<>(this, cmf.class, false).c(300));
      this.bX.a(3, new ccf<>(this, cfq.class, false).c(300));
   }

   public static buv.a t() {
      return ckd.gq().a(buw.v, 0.5).a(buw.m, 18.0).a(buw.s, 32.0);
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.a(bsy.a, new cuq(cut.ov));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewx h_() {
      return this.cK().c(3.0, 0.0, 3.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dO().B && this.ci()) {
         this.ce--;
         if (this.ce < 0) {
            this.ce = 0;
         }

         if (this.aO == 1 || this.ai % 1200 == 0) {
            this.ce = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cf[0][$$2] = this.cf[1][$$2];
               this.cf[1][$$2] = new exc(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dO().a(lm.e, this.d(0.5), this.dw(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dO().a(this.dt(), this.dv(), this.dz(), avp.ni, this.de(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.ce = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cf[0][$$4] = this.cf[1][$$4];
               this.cf[1][$$4] = new exc(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avo ai_() {
      return avp.ne;
   }

   public exc[] H(float $$0) {
      if (this.ce <= 0) {
         return this.cf[1];
      } else {
         double $$1 = (double)(((float)this.ce - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         exc[] $$2 = new exc[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cf[1][$$3].a(1.0 - $$1).e(this.cf[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avo v() {
      return avp.ne;
   }

   @Override
   protected avo n_() {
      return avp.ng;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.nh;
   }

   @Override
   protected avo gk() {
      return avp.nf;
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(btn $$0, float $$1) {
      cuq $$2 = this.b(cnr.a(this, cut.ov));
      cuq $$3 = this.g($$2);
      cnd $$4 = cnr.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dt() - this.dt();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dv();
      double $$7 = $$0.dz() - this.dz();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dO().al().a() * 4));
      this.a(avp.xn, 1.0F, 1.0F / (this.dR().i() * 0.4F + 0.8F));
      this.dO().b($$4);
   }

   @Override
   public cjk.a s() {
      if (this.gu()) {
         return cjk.a.c;
      } else {
         return this.gb() ? cjk.a.d : cjk.a.a;
      }
   }

   class a extends ckn.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (ckb.this.p() == null) {
            return false;
         } else {
            return ckb.this.p().an() == this.e ? false : ckb.this.dO().d_(ckb.this.do()).a((float)bqo.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         btn $$0 = ckb.this.p();
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
         ckb.this.p().b(new brz(bsb.o, 400), ckb.this);
      }

      @Override
      protected avo l() {
         return avp.nj;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.f;
      }
   }

   class b extends ckn.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !ckb.this.b(bsb.n);
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
         ckb.this.b(new brz(bsb.n, 1200));
      }

      @Nullable
      @Override
      protected avo l() {
         return avp.nk;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.e;
      }
   }
}
