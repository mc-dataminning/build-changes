import javax.annotation.Nullable;

public class clu extends cmg implements cma {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int a = 3;
   private int ca;
   private final fay[][] cb;

   public clu(buq<? extends clu> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new fay[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = fay.c;
         this.cb[1][$$2] = fay.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new cmg.b());
      this.bS.a(3, new cbk<>(this, cna.class, 8.0F, 1.0, 1.2));
      this.bS.a(4, new clu.b());
      this.bS.a(5, new clu.a());
      this.bS.a(6, new cdd<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cda(this, 0.6));
      this.bS.a(9, new ccl(this, cov.class, 3.0F, 1.0F));
      this.bS.a(10, new ccl(this, bvh.class, 8.0F));
      this.bT.a(1, new cdv(this, cqj.class).a());
      this.bT.a(2, new cdw<>(this, cov.class, true).c(300));
      this.bT.a(3, new cdw<>(this, cob.class, false).c(300));
      this.bT.a(3, new cdw<>(this, chi.class, false).c(300));
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.v, 0.5).a(bwn.m, 18.0).a(bwn.s, 32.0);
   }

   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.a(bur.a, new cwn(cwr.pa));
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
               this.cb[1][$$2] = new fay(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dW().a(lt.e, this.d(0.5), this.dE(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dW().a(this.dB(), this.dD(), this.dH(), avz.nG, this.dn(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new fay(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avy aj_() {
      return avz.nC;
   }

   public fay[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fay[] $$2 = new fay[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected avy u() {
      return avz.nC;
   }

   @Override
   protected avy o_() {
      return avz.nE;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.nF;
   }

   @Override
   protected avy x() {
      return avz.nD;
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bvf $$0, float $$1) {
      cwn $$2 = this.b(cpq.a(this, cwr.pa));
      cwn $$3 = this.d($$2);
      cpc $$4 = cpq.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arc $$9) {
         cpo.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(avz.xN, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   public cld.a m() {
      if (this.gy()) {
         return cld.a.c;
      } else {
         return this.ge() ? cld.a.d : cld.a.a;
      }
   }

   class a extends cmg.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clu.this.O_() == null) {
            return false;
         } else {
            return clu.this.O_().ar() == this.e ? false : clu.this.dW().d_(clu.this.dw()).a((float)bsf.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bvf $$0 = clu.this.O_();
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
         clu.this.O_().b(new bto(btq.o, 400), clu.this);
      }

      @Override
      protected avy l() {
         return avz.nH;
      }

      @Override
      protected cmg.a m() {
         return cmg.a.f;
      }
   }

   class b extends cmg.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clu.this.b(btq.n);
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
         clu.this.a(new bto(btq.n, 1200));
      }

      @Nullable
      @Override
      protected avy l() {
         return avz.nI;
      }

      @Override
      protected cmg.a m() {
         return cmg.a.e;
      }
   }
}
