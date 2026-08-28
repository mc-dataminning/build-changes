import javax.annotation.Nullable;

public class clx extends cmj implements cmd {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int a = 3;
   private int ca;
   private final fbb[][] cb;

   public clx(but<? extends clx> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new fbb[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = fbb.c;
         this.cb[1][$$2] = fbb.c;
      }
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cca(this));
      this.bS.a(1, new cmj.b());
      this.bS.a(3, new cbn<>(this, cnd.class, 8.0F, 1.0, 1.2));
      this.bS.a(4, new clx.b());
      this.bS.a(5, new clx.a());
      this.bS.a(6, new cdg<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cdd(this, 0.6));
      this.bS.a(9, new cco(this, coy.class, 3.0F, 1.0F));
      this.bS.a(10, new cco(this, bvk.class, 8.0F));
      this.bT.a(1, new cdy(this, cqm.class).a());
      this.bT.a(2, new cdz<>(this, coy.class, true).c(300));
      this.bT.a(3, new cdz<>(this, coe.class, false).c(300));
      this.bT.a(3, new cdz<>(this, chl.class, false).c(300));
   }

   public static bwp.a p() {
      return clz.gx().a(bwq.v, 0.5).a(bwq.m, 18.0).a(bwq.s, 32.0);
   }

   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      this.a(buu.a, new cwq(cwu.pa));
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
               this.cb[1][$$2] = new fbb(
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
               this.cb[1][$$4] = new fbb(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public avz aj_() {
      return awa.nC;
   }

   public fbb[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         fbb[] $$2 = new fbb[4];

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
   protected avz e(btc $$0) {
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
   public void a(bvi $$0, float $$1) {
      cwq $$2 = this.b(cpt.a(this, cwu.pa));
      cwq $$3 = this.d($$2);
      cpf $$4 = cpt.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ard $$9) {
         cpr.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.am().a() * 4));
      }

      this.a(awa.xN, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public clg.a m() {
      if (this.gB()) {
         return clg.a.c;
      } else {
         return this.gh() ? clg.a.d : clg.a.a;
      }
   }

   class a extends cmj.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clx.this.O_() == null) {
            return false;
         } else {
            return clx.this.O_().ar() == this.e ? false : clx.this.dV().d_(clx.this.dv()).a((float)bsi.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bvi $$0 = clx.this.O_();
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
         clx.this.O_().b(new btr(btt.o, 400), clx.this);
      }

      @Override
      protected avz l() {
         return awa.nH;
      }

      @Override
      protected cmj.a m() {
         return cmj.a.f;
      }
   }

   class b extends cmj.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clx.this.b(btt.n);
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
         clx.this.a(new btr(btt.n, 1200));
      }

      @Nullable
      @Override
      protected avz l() {
         return awa.nI;
      }

      @Override
      protected cmj.a m() {
         return cmj.a.e;
      }
   }
}
