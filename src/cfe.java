import javax.annotation.Nullable;

public class cfe extends cfq implements cfk {
   private static final int e = 4;
   private static final int bV = 3;
   private static final int bW = 3;
   private int bX;
   private final eov[][] bY;

   public cfe(bol<? extends cfe> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bY = new eov[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bY[0][$$2] = eov.b;
         this.bY[1][$$2] = eov.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new cfq.b());
      this.bP.a(4, new cfe.b());
      this.bP.a(5, new cfe.a());
      this.bP.a(6, new bwu<>(this, 0.5, 20, 15.0F));
      this.bP.a(8, new bwr(this, 0.6));
      this.bP.a(9, new bwc(this, cia.class, 3.0F, 1.0F));
      this.bP.a(10, new bwc(this, boz.class, 8.0F));
      this.bQ.a(1, new bxm(this, cjk.class).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true).c(300));
      this.bQ.a(3, new bxn<>(this, chi.class, false).c(300));
      this.bQ.a(3, new bxn<>(this, cay.class, false).c(300));
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.o, 0.5).a(bqe.i, 18.0).a(bqe.n, 32.0);
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.a(bom.a, new cpq(cpt.ot));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public eoq i_() {
      return this.cE().c(3.0, 0.0, 3.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dJ().B && this.cb()) {
         this.bX--;
         if (this.bX < 0) {
            this.bX = 0;
         }

         if (this.aL == 1 || this.ag % 1200 == 0) {
            this.bX = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bY[0][$$2] = this.bY[1][$$2];
               this.bY[1][$$2] = new eov(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dJ().a(kb.f, this.d(0.5), this.dr(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dJ().a(this.do(), this.dq(), this.du(), atp.mK, this.cY(), 1.0F, 1.0F, false);
         } else if (this.aL == this.aM - 1) {
            this.bX = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bY[0][$$4] = this.bY[1][$$4];
               this.bY[1][$$4] = new eov(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public ato ag_() {
      return atp.mG;
   }

   public eov[] E(float $$0) {
      if (this.bX <= 0) {
         return this.bY[1];
      } else {
         double $$1 = (double)(((float)this.bX - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         eov[] $$2 = new eov[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bY[1][$$3].a(1.0 - $$1).e(this.bY[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected ato y() {
      return atp.mG;
   }

   @Override
   protected ato n_() {
      return atp.mI;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.mJ;
   }

   @Override
   protected ato gl() {
      return atp.mH;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(box $$0, float $$1) {
      cpq $$2 = this.g(this.b(ciu.a(this, cpt.ot)));
      cig $$3 = ciu.a(this, $$2, $$1);
      double $$4 = $$0.do() - this.do();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dq();
      double $$6 = $$0.du() - this.du();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dJ().aj().a() * 4));
      this.a(atp.wG, 1.0F, 1.0F / (this.ef().i() * 0.4F + 0.8F));
      this.dJ().b($$3);
   }

   @Override
   public ceo.a u() {
      if (this.gv()) {
         return ceo.a.c;
      } else {
         return this.gd() ? ceo.a.d : ceo.a.a;
      }
   }

   class a extends cfq.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cfe.this.q() == null) {
            return false;
         } else {
            return cfe.this.q().aj() == this.e ? false : cfe.this.dJ().d_(cfe.this.dj()).a((float)bmi.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         box $$0 = cfe.this.q();
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
         cfe.this.q().b(new bns(bnu.o, 400), cfe.this);
      }

      @Override
      protected ato l() {
         return atp.mL;
      }

      @Override
      protected cfq.a m() {
         return cfq.a.f;
      }
   }

   class b extends cfq.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cfe.this.a(bnu.n);
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
         cfe.this.b(new bns(bnu.n, 1200));
      }

      @Nullable
      @Override
      protected ato l() {
         return atp.mM;
      }

      @Override
      protected cfq.a m() {
         return cfq.a.e;
      }
   }
}
