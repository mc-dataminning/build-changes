import javax.annotation.Nullable;

public class ccm extends ccy implements ccs {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final els[][] bW;

   public ccm(bly<? extends ccm> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new els[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = els.b;
         this.bW[1][$$2] = els.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bta(this));
      this.bO.a(1, new ccy.b());
      this.bO.a(4, new ccm.b());
      this.bO.a(5, new ccm.a());
      this.bO.a(6, new bug<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bud(this, 0.6));
      this.bO.a(9, new bto(this, cfh.class, 3.0F, 1.0F));
      this.bO.a(10, new bto(this, bmm.class, 8.0F));
      this.bP.a(1, new buy(this, cgq.class).a());
      this.bP.a(2, new buz<>(this, cfh.class, true).c(300));
      this.bP.a(3, new buz<>(this, cep.class, false).c(300));
      this.bP.a(3, new buz<>(this, byj.class, false).c(300));
   }

   public static bnp.a w() {
      return cco.gk().a(bnq.m, 0.5).a(bnq.g, 18.0).a(bnq.l, 32.0);
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      this.a(blz.a, new cmx(cna.or));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public eln i_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B && this.ce()) {
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
               this.bW[1][$$2] = new els(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(jx.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), arr.mu, this.db(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new els(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public arq af_() {
      return arr.mq;
   }

   public els[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         els[] $$2 = new els[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(blu $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bmk && ((bmk)$$0).eS() == bmp.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arq y() {
      return arr.mq;
   }

   @Override
   protected arq n_() {
      return arr.ms;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.mt;
   }

   @Override
   protected arq ge() {
      return arr.mr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bmk $$0, float $$1) {
      cmx $$2 = this.g(this.b(cga.a(this, cna.or)));
      cfn $$3 = cga.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(arr.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cbw.a u() {
      if (this.go()) {
         return cbw.a.c;
      } else {
         return this.fW() ? cbw.a.d : cbw.a.a;
      }
   }

   class a extends ccy.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (ccm.this.q() == null) {
            return false;
         } else {
            return ccm.this.q().aj() == this.e ? false : ccm.this.dM().d_(ccm.this.dm()).a((float)bjx.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bmk $$0 = ccm.this.q();
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
         ccm.this.q().b(new blh(blj.o, 400), ccm.this);
      }

      @Override
      protected arq l() {
         return arr.mv;
      }

      @Override
      protected ccy.a m() {
         return ccy.a.f;
      }
   }

   class b extends ccy.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !ccm.this.a(blj.n);
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
         ccm.this.b(new blh(blj.n, 1200));
      }

      @Nullable
      @Override
      protected arq l() {
         return arr.mw;
      }

      @Override
      protected ccy.a m() {
         return ccy.a.e;
      }
   }
}
