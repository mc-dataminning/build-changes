import javax.annotation.Nullable;

public class cjz extends ckl implements ckf {
   private static final int e = 4;
   private static final int ca = 3;
   private static final int cb = 3;
   private int cc;
   private final eww[][] cd;

   public cjz(bsw<? extends cjz> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.cd = new eww[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cd[0][$$2] = eww.b;
         this.cd[1][$$2] = eww.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cae(this));
      this.bU.a(1, new ckl.b());
      this.bU.a(4, new cjz.b());
      this.bU.a(5, new cjz.a());
      this.bU.a(6, new cbk<>(this, 0.5, 20, 15.0F));
      this.bU.a(8, new cbh(this, 0.6));
      this.bU.a(9, new cas(this, cmv.class, 3.0F, 1.0F));
      this.bU.a(10, new cas(this, btn.class, 8.0F));
      this.bV.a(1, new ccc(this, coh.class).a());
      this.bV.a(2, new ccd<>(this, cmv.class, true).c(300));
      this.bV.a(3, new ccd<>(this, cmd.class, false).c(300));
      this.bV.a(3, new ccd<>(this, cfo.class, false).c(300));
   }

   public static but.a t() {
      return ckb.gs().a(buu.v, 0.5).a(buu.m, 18.0).a(buu.s, 32.0);
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.a(bsx.a, new cuo(cur.ov));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ewr h_() {
      return this.cL().c(3.0, 0.0, 3.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.dQ().B && this.ci()) {
         this.cc--;
         if (this.cc < 0) {
            this.cc = 0;
         }

         if (this.aO == 1 || this.ai % 1200 == 0) {
            this.cc = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cd[0][$$2] = this.cd[1][$$2];
               this.cd[1][$$2] = new eww(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dQ().a(lm.e, this.d(0.5), this.dy(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dQ().a(this.dv(), this.dx(), this.dB(), avo.ni, this.df(), 1.0F, 1.0F, false);
         } else if (this.aO == this.aP - 1) {
            this.cc = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cd[0][$$4] = this.cd[1][$$4];
               this.cd[1][$$4] = new eww(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avn ae_() {
      return avo.ne;
   }

   public eww[] H(float $$0) {
      if (this.cc <= 0) {
         return this.cd[1];
      } else {
         double $$1 = (double)(((float)this.cc - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eww[] $$2 = new eww[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cd[1][$$3].a(1.0 - $$1).e(this.cd[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avn v() {
      return avo.ne;
   }

   @Override
   protected avn n_() {
      return avo.ng;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.nh;
   }

   @Override
   protected avn gm() {
      return avo.nf;
   }

   @Override
   public void a(aqt $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(btl $$0, float $$1) {
      cuo $$2 = this.b(cnp.a(this, cur.ov));
      cuo $$3 = this.g($$2);
      cnb $$4 = cnp.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dv() - this.dv();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dx();
      double $$7 = $$0.dB() - this.dB();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      $$4.c($$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dQ().al().a() * 4));
      this.a(avo.xn, 1.0F, 1.0F / (this.dT().i() * 0.4F + 0.8F));
      this.dQ().b($$4);
   }

   @Override
   public cji.a s() {
      if (this.gw()) {
         return cji.a.c;
      } else {
         return this.gd() ? cji.a.d : cji.a.a;
      }
   }

   class a extends ckl.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cjz.this.p() == null) {
            return false;
         } else {
            return cjz.this.p().an() == this.e ? false : cjz.this.dQ().d_(cjz.this.dq()).a((float)bqn.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         btl $$0 = cjz.this.p();
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
         cjz.this.p().b(new bry(bsa.o, 400), cjz.this);
      }

      @Override
      protected avn l() {
         return avo.nj;
      }

      @Override
      protected ckl.a m() {
         return ckl.a.f;
      }
   }

   class b extends ckl.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cjz.this.b(bsa.n);
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
         cjz.this.b(new bry(bsa.n, 1200));
      }

      @Nullable
      @Override
      protected avn l() {
         return avo.nk;
      }

      @Override
      protected ckl.a m() {
         return ckl.a.e;
      }
   }
}
