import javax.annotation.Nullable;

public class che extends chq implements chk {
   private static final int e = 4;
   private static final int bX = 3;
   private static final int bY = 3;
   private int bZ;
   private final esj[][] ca;

   public che(bqg<? extends che> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.ca = new esj[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.ca[0][$$2] = esj.b;
         this.ca[1][$$2] = esj.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new chq.b());
      this.bR.a(4, new che.b());
      this.bR.a(5, new che.a());
      this.bR.a(6, new byq<>(this, 0.5, 20, 15.0F));
      this.bR.a(8, new byn(this, 0.6));
      this.bR.a(9, new bxy(this, cka.class, 3.0F, 1.0F));
      this.bR.a(10, new bxy(this, bqv.class, 8.0F));
      this.bS.a(1, new bzi(this, clm.class).a());
      this.bS.a(2, new bzj<>(this, cka.class, true).c(300));
      this.bS.a(3, new bzj<>(this, cji.class, false).c(300));
      this.bS.a(3, new bzj<>(this, ccu.class, false).c(300));
   }

   public static brz.a u() {
      return chg.gt().a(bsa.r, 0.5).a(bsa.k, 18.0).a(bsa.q, 32.0);
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.a(bqh.a, new crs(crv.ot));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public ese h_() {
      return this.cH().c(3.0, 0.0, 3.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dM().B && this.ce()) {
         this.bZ--;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.aN == 1 || this.ah % 1200 == 0) {
            this.bZ = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.ca[0][$$2] = this.ca[1][$$2];
               this.ca[1][$$2] = new esj(
                  (double)(-6.0F + (float)this.ag.a(13)) * 0.5, (double)Math.max(0, this.ag.a(6) - 4), (double)(-6.0F + (float)this.ag.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(kn.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), auo.mT, this.db(), 1.0F, 1.0F, false);
         } else if (this.aN == this.aO - 1) {
            this.bZ = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.ca[0][$$4] = this.ca[1][$$4];
               this.ca[1][$$4] = new esj(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public aun ae_() {
      return auo.mP;
   }

   public esj[] G(float $$0) {
      if (this.bZ <= 0) {
         return this.ca[1];
      } else {
         double $$1 = (double)(((float)this.bZ - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         esj[] $$2 = new esj[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.ca[1][$$3].a(1.0 - $$1).e(this.ca[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected aun v() {
      return auo.mP;
   }

   @Override
   protected aun o_() {
      return auo.mR;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.mS;
   }

   @Override
   protected aun gn() {
      return auo.mQ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bqt $$0, float $$1) {
      crs $$2 = this.g(this.b(cku.a(this, crv.ot)));
      ckg $$3 = cku.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(auo.wR, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cgn.a r() {
      if (this.gx()) {
         return cgn.a.c;
      } else {
         return this.gf() ? cgn.a.d : cgn.a.a;
      }
   }

   class a extends chq.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (che.this.p() == null) {
            return false;
         } else {
            return che.this.p().aj() == this.e ? false : che.this.dM().d_(che.this.dm()).a((float)boc.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bqt $$0 = che.this.p();
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
         che.this.p().b(new bpm(bpo.o, 400), che.this);
      }

      @Override
      protected aun l() {
         return auo.mU;
      }

      @Override
      protected chq.a m() {
         return chq.a.f;
      }
   }

   class b extends chq.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !che.this.b(bpo.n);
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
         che.this.b(new bpm(bpo.n, 1200));
      }

      @Nullable
      @Override
      protected aun l() {
         return auo.mV;
      }

      @Override
      protected chq.a m() {
         return chq.a.e;
      }
   }
}
