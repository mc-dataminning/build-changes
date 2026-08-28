import javax.annotation.Nullable;

public class cmv extends cnh implements cnb {
   private static final int bZ = 4;
   private static final int ca = 3;
   public static final int a = 3;
   private int cb;
   private final fby[][] cc;

   public cmv(bvr<? extends cmv> $$0, dhi $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.cc = new fby[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cc[0][$$2] = fby.c;
         this.cc[1][$$2] = fby.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cnh.b());
      this.bT.a(3, new ccl<>(this, cob.class, 8.0F, 1.0, 1.2));
      this.bT.a(4, new cmv.b());
      this.bT.a(5, new cmv.a());
      this.bT.a(6, new cee<>(this, 0.5, 20, 15.0F));
      this.bT.a(8, new ceb(this, 0.6));
      this.bT.a(9, new cdm(this, cpx.class, 3.0F, 1.0F));
      this.bT.a(10, new cdm(this, bwi.class, 8.0F));
      this.bU.a(1, new cew(this, crl.class).a());
      this.bU.a(2, new cex<>(this, cpx.class, true).c(300));
      this.bU.a(3, new cex<>(this, cpe.class, false).c(300));
      this.bU.a(3, new cex<>(this, cij.class, false).c(300));
   }

   public static bxn.a p() {
      return cmx.gt().a(bxo.v, 0.5).a(bxo.m, 18.0).a(bxo.s, 32.0);
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      this.a(bvs.a, new cxp(cxt.oR));
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
               this.cc[1][$$2] = new fby(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dW().a(ls.e, this.d(0.5), this.dE(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dW().a(this.dB(), this.dD(), this.dH(), axf.nA, this.dn(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.cb = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cc[0][$$4] = this.cc[1][$$4];
               this.cc[1][$$4] = new fby(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public axe ak_() {
      return axf.nw;
   }

   public fby[] J(float $$0) {
      if (this.cb <= 0) {
         return this.cc[1];
      } else {
         double $$1 = (double)(((float)this.cb - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fby[] $$2 = new fby[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cc[1][$$3].c(1.0 - $$1).e(this.cc[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected axe u() {
      return axf.nw;
   }

   @Override
   protected axe o_() {
      return axf.ny;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.nz;
   }

   @Override
   protected axe x() {
      return axf.nx;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bwg $$0, float $$1) {
      cxp $$2 = this.b(cqs.a(this, cxt.oR));
      cxp $$3 = this.d($$2);
      cqe $$4 = cqs.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof ash $$9) {
         cqq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.al().a() * 4));
      }

      this.a(axf.xH, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   public cme.a m() {
      if (this.gx()) {
         return cme.a.c;
      } else {
         return this.gd() ? cme.a.d : cme.a.a;
      }
   }

   class a extends cnh.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (cmv.this.O_() == null) {
            return false;
         } else {
            return cmv.this.O_().ar() == this.e ? false : cmv.this.dW().d_(cmv.this.dw()).a((float)btg.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bwg $$0 = cmv.this.O_();
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
         cmv.this.O_().b(new bup(bur.o, 400), cmv.this);
      }

      @Override
      protected axe l() {
         return axf.nB;
      }

      @Override
      protected cnh.a m() {
         return cnh.a.f;
      }
   }

   class b extends cnh.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !cmv.this.b(bur.n);
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
         cmv.this.a(new bup(bur.n, 1200));
      }

      @Nullable
      @Override
      protected axe l() {
         return axf.nC;
      }

      @Override
      protected cnh.a m() {
         return cnh.a.e;
      }
   }
}
