import javax.annotation.Nullable;

public class cmm extends cmy implements cms {
   private static final int bZ = 4;
   private static final int ca = 3;
   public static final int a = 3;
   private int cb;
   private final fbr[][] cc;

   public cmm(bvi<? extends cmm> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.cc = new fbr[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cc[0][$$2] = fbr.c;
         this.cc[1][$$2] = fbr.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cmy.b());
      this.bT.a(3, new ccc<>(this, cns.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cmm.b());
      this.bT.a(5, new cmm.a());
      this.bT.a(6, new cdv<>(this, 0.5, 20, 15.0F));
      this.bT.a(8, new cds(this, 0.6));
      this.bT.a(9, new cdd(this, cpo.class, 3.0F, 1.0F));
      this.bT.a(10, new cdd(this, bvz.class, 8.0F));
      this.bU.a(1, new cen(this, crc.class).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true).c(300));
      this.bU.a(3, new ceo<>(this, cov.class, false).c(300));
      this.bU.a(3, new ceo<>(this, cia.class, false).c(300));
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.v, 0.5).a(bxf.m, 18.0).a(bxf.s, 32.0);
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.a(bvj.a, new cxg(cxk.pa));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW().C && this.cp()) {
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
               this.cc[1][$$2] = new fbr(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dW().a(ls.e, this.d(0.5), this.dE(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dW().a(this.dB(), this.dD(), this.dH(), awv.nG, this.dn(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.cb = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cc[0][$$4] = this.cc[1][$$4];
               this.cc[1][$$4] = new fbr(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awu ak_() {
      return awv.nC;
   }

   public fbr[] J(float $$0) {
      if (this.cb <= 0) {
         return this.cc[1];
      } else {
         double $$1 = (double)(((float)this.cb - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fbr[] $$2 = new fbr[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cc[1][$$3].c(1.0 - $$1).e(this.cc[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awu u() {
      return awv.nC;
   }

   @Override
   protected awu o_() {
      return awv.nE;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.nF;
   }

   @Override
   protected awu x() {
      return awv.nD;
   }

   @Override
   public void a(arx $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bvx $$0, float $$1) {
      cxg $$2 = this.b(cqj.a(this, cxk.pa));
      cxg $$3 = this.d($$2);
      cpv $$4 = cqj.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arx $$9) {
         cqh.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awv.xN, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   public clv.a m() {
      if (this.gx()) {
         return clv.a.c;
      } else {
         return this.gd() ? clv.a.d : clv.a.a;
      }
   }

   class a extends cmy.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cmm.this.O_() == null) {
            return false;
         } else {
            return cmm.this.O_().ar() == this.e ? false : cmm.this.dW().d_(cmm.this.dw()).a((float)bsx.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bvx $$0 = cmm.this.O_();
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
         cmm.this.O_().b(new bug(bui.o, 400), cmm.this);
      }

      @Override
      protected awu l() {
         return awv.nH;
      }

      @Override
      protected cmy.a m() {
         return cmy.a.f;
      }
   }

   class b extends cmy.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cmm.this.b(bui.n);
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
         cmm.this.a(new bug(bui.n, 1200));
      }

      @Nullable
      @Override
      protected awu l() {
         return awv.nI;
      }

      @Override
      protected cmy.a m() {
         return cmy.a.e;
      }
   }
}
