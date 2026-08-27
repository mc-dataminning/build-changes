import javax.annotation.Nullable;

public class cch extends cct implements ccn {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final elm[][] bW;

   public cch(blt<? extends cch> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new elm[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = elm.b;
         this.bW[1][$$2] = elm.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new cct.b());
      this.bO.a(4, new cch.b());
      this.bO.a(5, new cch.a());
      this.bO.a(6, new bub<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bty(this, 0.6));
      this.bO.a(9, new btj(this, cfb.class, 3.0F, 1.0F));
      this.bO.a(10, new btj(this, bmh.class, 8.0F));
      this.bP.a(1, new but(this, cgk.class).a());
      this.bP.a(2, new buu<>(this, cfb.class, true).c(300));
      this.bP.a(3, new buu<>(this, cej.class, false).c(300));
      this.bP.a(3, new buu<>(this, bye.class, false).c(300));
   }

   public static bnk.a w() {
      return ccj.gk().a(bnl.m, 0.5).a(bnl.g, 18.0).a(bnl.l, 32.0);
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.a(blu.a, new cmr(cmu.or));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public elh i_() {
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
               this.bW[1][$$2] = new elm(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(jx.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), arm.mu, this.db(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new elm(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public arl af_() {
      return arm.mq;
   }

   public elm[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         elm[] $$2 = new elm[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   public boolean s(blp $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bmf && ((bmf)$$0).eS() == bmk.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arl y() {
      return arm.mq;
   }

   @Override
   protected arl n_() {
      return arm.ms;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.mt;
   }

   @Override
   protected arl ge() {
      return arm.mr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bmf $$0, float $$1) {
      cmr $$2 = this.g(this.b(cfu.a(this, cmu.or)));
      cfh $$3 = cfu.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(arm.wq, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cbr.a u() {
      if (this.go()) {
         return cbr.a.c;
      } else {
         return this.fW() ? cbr.a.d : cbr.a.a;
      }
   }

   class a extends cct.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cch.this.q() == null) {
            return false;
         } else {
            return cch.this.q().aj() == this.e ? false : cch.this.dM().d_(cch.this.dm()).a((float)bjs.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bmf $$0 = cch.this.q();
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
         cch.this.q().b(new blc(ble.o, 400), cch.this);
      }

      @Override
      protected arl l() {
         return arm.mv;
      }

      @Override
      protected cct.a m() {
         return cct.a.f;
      }
   }

   class b extends cct.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cch.this.a(ble.n);
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
         cch.this.b(new blc(ble.n, 1200));
      }

      @Nullable
      @Override
      protected arl l() {
         return arm.mw;
      }

      @Override
      protected cct.a m() {
         return cct.a.e;
      }
   }
}
