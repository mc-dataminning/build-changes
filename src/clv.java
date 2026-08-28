import javax.annotation.Nullable;

public class clv extends cmh implements cmb {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int a = 3;
   private int ca;
   private final faz[][] cb;

   public clv(bur<? extends clv> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new faz[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = faz.c;
         this.cb[1][$$2] = faz.c;
      }
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cmh.b());
      this.bS.a(3, new cbl<>(this, cnb.class, 8.0F, 1.0, 1.2));
      this.bS.a(4, new clv.b());
      this.bS.a(5, new clv.a());
      this.bS.a(6, new cde<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cdb(this, 0.6));
      this.bS.a(9, new ccm(this, cow.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
      this.bT.a(1, new cdw(this, cqk.class).a());
      this.bT.a(2, new cdx<>(this, cow.class, true).c(300));
      this.bT.a(3, new cdx<>(this, coc.class, false).c(300));
      this.bT.a(3, new cdx<>(this, chj.class, false).c(300));
   }

   public static bwn.a p() {
      return clx.gx().a(bwo.v, 0.5).a(bwo.m, 18.0).a(bwo.s, 32.0);
   }

   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.a(bus.a, new cwo(cws.pa));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV().C && this.cp()) {
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
               this.cb[1][$$2] = new faz(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(lt.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awa.nG, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new faz(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avz aj_() {
      return awa.nC;
   }

   public faz[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         faz[] $$2 = new faz[4];

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
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bvg $$0, float $$1) {
      cwo $$2 = this.b(cpr.a(this, cws.pa));
      cwo $$3 = this.d($$2);
      cpd $$4 = cpr.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ard $$9) {
         cpp.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awa.xN, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public cle.a m() {
      if (this.gB()) {
         return cle.a.c;
      } else {
         return this.gh() ? cle.a.d : cle.a.a;
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
            return clv.this.O_().ar() == this.e ? false : clv.this.dV().d_(clv.this.dv()).a((float)bsg.c.ordinal());
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
