import javax.annotation.Nullable;

public class ccu extends cdg implements cda {
   private static final int e = 4;
   private static final int bU = 3;
   private static final int bV = 3;
   private int bW;
   private final emc[][] bX;

   public ccu(bmc<? extends ccu> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bX = new emc[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bX[0][$$2] = emc.b;
         this.bX[1][$$2] = emc.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(1, new cdg.b());
      this.bP.a(4, new ccu.b());
      this.bP.a(5, new ccu.a());
      this.bP.a(6, new buk<>(this, 0.5, 20, 15.0F));
      this.bP.a(8, new buh(this, 0.6));
      this.bP.a(9, new bts(this, cfq.class, 3.0F, 1.0F));
      this.bP.a(10, new bts(this, bmq.class, 8.0F));
      this.bQ.a(1, new bvc(this, cgz.class).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, true).c(300));
      this.bQ.a(3, new bvd<>(this, cey.class, false).c(300));
      this.bQ.a(3, new bvd<>(this, byo.class, false).c(300));
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.o, 0.5).a(bnu.i, 18.0).a(bnu.n, 32.0);
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.a(bmd.a, new cng(cnj.ot));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public elx i_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dL().B && this.ce()) {
         this.bW--;
         if (this.bW < 0) {
            this.bW = 0;
         }

         if (this.aK == 1 || this.ah % 1200 == 0) {
            this.bW = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bX[0][$$2] = this.bX[1][$$2];
               this.bX[1][$$2] = new emc(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dL().a(jx.f, this.d(0.5), this.dt(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dL().a(this.dq(), this.ds(), this.dw(), art.mJ, this.db(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bW = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bX[0][$$4] = this.bX[1][$$4];
               this.bX[1][$$4] = new emc(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public ars ag_() {
      return art.mF;
   }

   public emc[] D(float $$0) {
      if (this.bW <= 0) {
         return this.bX[1];
      } else {
         double $$1 = (double)(((float)this.bW - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         emc[] $$2 = new emc[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bX[1][$$3].a(1.0 - $$1).e(this.bX[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean r(blw $$0) {
      if (super.r($$0)) {
         return true;
      } else {
         return $$0 instanceof bmo && ((bmo)$$0).eS() == bmt.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected ars y() {
      return art.mF;
   }

   @Override
   protected ars n_() {
      return art.mH;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.mI;
   }

   @Override
   protected ars gf() {
      return art.mG;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bmo $$0, float $$1) {
      cng $$2 = this.g(this.b(cgj.a(this, cnj.ot)));
      cfw $$3 = cgj.a(this, $$2, $$1);
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.e(0.3333333333333333) - $$3.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dL().ak().a() * 4));
      this.a(art.wF, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dL().b($$3);
   }

   @Override
   public cce.a u() {
      if (this.gp()) {
         return cce.a.c;
      } else {
         return this.fX() ? cce.a.d : cce.a.a;
      }
   }

   class a extends cdg.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (ccu.this.q() == null) {
            return false;
         } else {
            return ccu.this.q().aj() == this.e ? false : ccu.this.dL().d_(ccu.this.dl()).a((float)bjz.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bmo $$0 = ccu.this.q();
         if ($$0 != null) {
            this.e = $$0.aj();
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
         ccu.this.q().b(new blj(bll.o, 400), ccu.this);
      }

      @Override
      protected ars l() {
         return art.mK;
      }

      @Override
      protected cdg.a m() {
         return cdg.a.f;
      }
   }

   class b extends cdg.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !ccu.this.a(bll.n);
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
         ccu.this.b(new blj(bll.n, 1200));
      }

      @Nullable
      @Override
      protected ars l() {
         return art.mL;
      }

      @Override
      protected cdg.a m() {
         return cdg.a.e;
      }
   }
}
