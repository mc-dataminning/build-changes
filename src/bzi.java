import javax.annotation.Nullable;

public class bzi extends bzu implements bzo {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ehp[][] bW;

   public bzi(biw<? extends bzi> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ehp[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ehp.b;
         this.bW[1][$$2] = ehp.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bzu.b());
      this.bO.a(4, new bzi.b());
      this.bO.a(5, new bzi.a());
      this.bO.a(6, new brd<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bra(this, 0.6));
      this.bO.a(9, new bql(this, cbw.class, 3.0F, 1.0F));
      this.bO.a(10, new bql(this, bjk.class, 8.0F));
      this.bP.a(1, new brv(this, cde.class).a());
      this.bP.a(2, new brw<>(this, cbw.class, true).c(300));
      this.bP.a(3, new brw<>(this, cbe.class, false).c(300));
      this.bP.a(3, new brw<>(this, bvf.class, false).c(300));
   }

   public static bkn.a t() {
      return bzk.gj().a(bko.d, 0.5).a(bko.b, 18.0).a(bko.a, 32.0);
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.a(bix.a, new cjh(cjk.nG));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public ehk g_() {
      return this.cG().c(3.0, 0.0, 3.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.dL().B && this.cd()) {
         this.bV--;
         if (this.bV < 0) {
            this.bV = 0;
         }

         if (this.aK == 1 || this.ah % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new ehp(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dL().a(ix.f, this.d(0.5), this.dt(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dL().a(this.dq(), this.ds(), this.dw(), apf.lG, this.da(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ehp(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public ape ac_() {
      return apf.lC;
   }

   public ehp[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ehp[] $$2 = new ehp[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(bis $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bji && ((bji)$$0).eR() == bjn.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected ape w() {
      return apf.lC;
   }

   @Override
   protected ape l_() {
      return apf.lE;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.lF;
   }

   @Override
   protected ape gd() {
      return apf.lD;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bji $$0, float $$1) {
      cjh $$2 = this.g(this.b(ccp.a(this, cjk.nG)));
      ccc $$3 = ccp.a(this, $$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ai().a() * 4));
      this.a(apf.vA, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   @Override
   public bys.a s() {
      if (this.gn()) {
         return bys.a.c;
      } else {
         return this.fV() ? bys.a.d : bys.a.a;
      }
   }

   class a extends bzu.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (bzi.this.q() == null) {
            return false;
         } else {
            return bzi.this.q().ah() == this.e ? false : bzi.this.dL().d_(bzi.this.dl()).a((float)bgx.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bji $$0 = bzi.this.q();
         if ($$0 != null) {
            this.e = $$0.ah();
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
         bzi.this.q().b(new bif(bih.o, 400), bzi.this);
      }

      @Override
      protected ape l() {
         return apf.lH;
      }

      @Override
      protected bzu.a m() {
         return bzu.a.f;
      }
   }

   class b extends bzu.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !bzi.this.a(bih.n);
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
         bzi.this.b(new bif(bih.n, 1200));
      }

      @Nullable
      @Override
      protected ape l() {
         return apf.lI;
      }

      @Override
      protected bzu.a m() {
         return bzu.a.e;
      }
   }
}
