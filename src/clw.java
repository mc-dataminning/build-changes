import javax.annotation.Nullable;

public class clw extends cmi implements cmc {
   private static final int bY = 4;
   private static final int bZ = 3;
   public static final int a = 3;
   private int ca;
   private final ezy[][] cb;

   public clw(bus<? extends clw> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new ezy[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = ezy.c;
         this.cb[1][$$2] = ezy.c;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new cmi.b());
      this.bS.a(4, new clw.b());
      this.bS.a(5, new clw.a());
      this.bS.a(6, new cdf<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new cdc(this, 0.6));
      this.bS.a(9, new ccn(this, cou.class, 3.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
      this.bT.a(1, new cdx(this, cqi.class).a());
      this.bT.a(2, new cdy<>(this, cou.class, true).c(300));
      this.bT.a(3, new cdy<>(this, coa.class, false).c(300));
      this.bT.a(3, new cdy<>(this, chk.class, false).c(300));
   }

   public static bwo.a q() {
      return cly.gs().a(bwp.v, 0.5).a(bwp.m, 18.0).a(bwp.s, 32.0);
   }

   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.a(but.a, new cwm(cwq.ow));
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

         if (this.aM == 1 || this.af % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new ezy(
                  (double)(-6.0F + (float)this.ae.a(13)) * 0.5, (double)Math.max(0, this.ae.a(6) - 4), (double)(-6.0F + (float)this.ae.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dV().a(ls.e, this.d(0.5), this.dD(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dV().a(this.dA(), this.dC(), this.dG(), awn.nh, this.dm(), 1.0F, 1.0F, false);
         } else if (this.aM == this.aN - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new ezy(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public awm aj_() {
      return awn.nd;
   }

   public ezy[] J(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ezy[] $$2 = new ezy[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].c(1.0 - $$1).e(this.cb[0][$$3].c($$1));
         }

         return $$2;
      }
   }

   @Override
   protected awm t() {
      return awn.nd;
   }

   @Override
   protected awm n_() {
      return awn.nf;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.ng;
   }

   @Override
   protected awm gm() {
      return awn.ne;
   }

   @Override
   public void a(arp $$0, int $$1, boolean $$2) {
   }

   @Override
   public void a(bvh $$0, float $$1) {
      cwm $$2 = this.b(cpp.a(this, cwq.ow));
      cwm $$3 = this.d($$2);
      cpb $$4 = cpp.a(this, $$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arp $$9) {
         cpn.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.ak().a() * 4));
      }

      this.a(awn.xm, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public clf.a n() {
      if (this.gw()) {
         return clf.a.c;
      } else {
         return this.gb() ? clf.a.d : clf.a.a;
      }
   }

   class a extends cmi.c {
      private int e;

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else if (clw.this.aa_() == null) {
            return false;
         } else {
            return clw.this.aa_().ar() == this.e ? false : clw.this.dV().d_(clw.this.dv()).a((float)bsh.c.ordinal());
         }
      }

      @Override
      public void d() {
         super.d();
         bvh $$0 = clw.this.aa_();
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
         clw.this.aa_().b(new btq(bts.o, 400), clw.this);
      }

      @Override
      protected awm l() {
         return awn.ni;
      }

      @Override
      protected cmi.a m() {
         return cmi.a.f;
      }
   }

   class b extends cmi.c {
      @Override
      public boolean b() {
         return !super.b() ? false : !clw.this.b(bts.n);
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
         clw.this.a(new btq(bts.n, 1200));
      }

      @Nullable
      @Override
      protected awm l() {
         return awn.nj;
      }

      @Override
      protected cmi.a m() {
         return cmi.a.e;
      }
   }
}
