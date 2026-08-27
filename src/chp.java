import javax.annotation.Nullable;

public class chp extends cib implements chv {
   private static final int e = 4;
   private static final int bY = 3;
   private static final int bZ = 3;
   private int ca;
   private final etf[][] cb;

   public chp(bqr<? extends chp> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.cb = new etf[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.cb[0][$$2] = etf.b;
         this.cb[1][$$2] = etf.b;
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new cib.b());
      this.bS.a(4, new chp.b());
      this.bS.a(5, new chp.a());
      this.bS.a(6, new bzb<>(this, 0.5, 20, 15.0F));
      this.bS.a(8, new byy(this, 0.6));
      this.bS.a(9, new byj(this, ckl.class, 3.0F, 1.0F));
      this.bS.a(10, new byj(this, brg.class, 8.0F));
      this.bT.a(1, new bzt(this, clx.class).a());
      this.bT.a(2, new bzu<>(this, ckl.class, true).c(300));
      this.bT.a(3, new bzu<>(this, cjt.class, false).c(300));
      this.bT.a(3, new bzu<>(this, cdf.class, false).c(300));
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.r, 0.5).a(bsl.k, 18.0).a(bsl.q, 32.0);
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.a(bqs.a, new csd(csg.ou));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public eta h_() {
      return this.cI().c(3.0, 0.0, 3.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.dN().B && this.cf()) {
         this.ca--;
         if (this.ca < 0) {
            this.ca = 0;
         }

         if (this.aP == 1 || this.ai % 1200 == 0) {
            this.ca = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.cb[0][$$2] = this.cb[1][$$2];
               this.cb[1][$$2] = new etf(
                  (double)(-6.0F + (float)this.ah.a(13)) * 0.5, (double)Math.max(0, this.ah.a(6) - 4), (double)(-6.0F + (float)this.ah.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dN().a(kw.e, this.d(0.5), this.dv(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dN().a(this.ds(), this.du(), this.dy(), auz.mY, this.dc(), 1.0F, 1.0F, false);
         } else if (this.aP == this.aQ - 1) {
            this.ca = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.cb[0][$$4] = this.cb[1][$$4];
               this.cb[1][$$4] = new etf(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public auy ae_() {
      return auz.mU;
   }

   public etf[] G(float $$0) {
      if (this.ca <= 0) {
         return this.cb[1];
      } else {
         double $$1 = (double)(((float)this.ca - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         etf[] $$2 = new etf[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.cb[1][$$3].a(1.0 - $$1).e(this.cb[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected auy v() {
      return auz.mU;
   }

   @Override
   protected auy o_() {
      return auz.mW;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.mX;
   }

   @Override
   protected auy gp() {
      return auz.mV;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bre $$0, float $$1) {
      csd $$2 = this.g(this.b(clf.a(this, csg.ou)));
      ckr $$3 = clf.a(this, $$2, $$1);
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.e(0.3333333333333333) - $$3.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dN().ak().a() * 4));
      this.a(auz.wY, 1.0F, 1.0F / (this.ej().i() * 0.4F + 0.8F));
      this.dN().b($$3);
   }

   @Override
   public cgy.a r() {
      if (this.gz()) {
         return cgy.a.c;
      } else {
         return this.gh() ? cgy.a.d : cgy.a.a;
      }
   }

   class a extends cib.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (chp.this.p() == null) {
            return false;
         } else {
            return chp.this.p().aj() == this.e ? false : chp.this.dN().d_(chp.this.dn()).a((float)bon.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bre $$0 = chp.this.p();
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
         chp.this.p().b(new bpx(bpz.o, 400), chp.this);
      }

      @Override
      protected auy l() {
         return auz.mZ;
      }

      @Override
      protected cib.a m() {
         return cib.a.f;
      }
   }

   class b extends cib.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !chp.this.b(bpz.n);
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
         chp.this.b(new bpx(bpz.n, 1200));
      }

      @Nullable
      @Override
      protected auy l() {
         return auz.na;
      }

      @Override
      protected cib.a m() {
         return cib.a.e;
      }
   }
}
