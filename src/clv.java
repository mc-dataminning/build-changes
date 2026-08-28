import javax.annotation.Nullable;

public class clv extends cmh implements cmb {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int a = 3;
   private int ca;
   private final fba[][] cb;

   public clv(bur<? extends clv> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new fba[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = fba.c;
         this.cb[1][$$2] = fba.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cmh.b());
      this.bS.a(3, new cbl<>(this, cnb.class, 8.0F, 1.0, 1.2));
      this.bS.a(4, new clv.b());
      this.bS.a(5, new clv.a());
      this.bS.a(6, new cde<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cdb(this, 0.6));
      this.bS.a(9, new ccm(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
      this.bT.a(1, new cdw(this, cql.class).a());
      this.bT.a(2, new cdx<>(this, cox.class, true).c(300));
      this.bT.a(3, new cdx<>(this, cod.class, false).c(300));
      this.bT.a(3, new cdx<>(this, chj.class, false).c(300));
   }

   public static bwn.a p() {
      return clx.gu().a(bwo.v, 0.5).a(bwo.m, 18.0).a(bwo.s, 32.0);
   }

   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.a(bus.a, new cwp(cwt.pa));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW().C && this.cp()) {
         this.ca--;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.aN == 1 || this.af % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new fba(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dW().a(lt.e, this.d(0.5), this.dE(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dW().a(this.dB(), this.dD(), this.dH(), awa.nG, this.dn(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new fba(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avz aj_() {
      return awa.nC;
   }

   public fba[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fba[] $$2 = new fba[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avz u() {
      return awa.nC;
   }

   @Override
   protected avz o_() {
      return awa.nE;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.nF;
   }

   @Override
   protected avz x() {
      return awa.nD;
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bvg $$0, float $$1) {
      cwp $$2 = this.b(cps.a(this, cwt.pa));
      cwp $$3 = this.d($$2);
      cpe $$4 = cps.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arc $$9) {
         cpq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awa.xN, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   public cle.a m() {
      if (this.gy()) {
         return cle.a.c;
      } else {
         return this.ge() ? cle.a.d : cle.a.a;
      }
   }

   class a extends cmh.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clv.this.O_() == null) {
            return false;
         } else {
            return clv.this.O_().ar() == this.e ? false : clv.this.dW().d_(clv.this.dw()).a((float)bsg.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bvg $$0 = clv.this.O_();
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
         clv.this.O_().b(new btp(btr.o, 400), clv.this);
      }

      @Override
      protected avz l() {
         return awa.nH;
      }

      @Override
      protected cmh.a m() {
         return cmh.a.f;
      }
   }

   class b extends cmh.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clv.this.b(btr.n);
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
         clv.this.a(new btp(btr.n, 1200));
      }

      @Nullable
      @Override
      protected avz l() {
         return awa.nI;
      }

      @Override
      protected cmh.a m() {
         return cmh.a.e;
      }
   }
}
