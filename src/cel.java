import javax.annotation.Nullable;

public class cel extends cex implements cer {
   private static final int e = 4;
   private static final int bT = 3;
   private static final int bU = 3;
   private int bV;
   private final ens[][] bW;

   public cel(bnu<? extends cel> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bW = new ens[2][4];

      for (int $$2 = 0; $$2 < 4; $$2++) {
         this.bW[0][$$2] = ens.b;
         this.bW[1][$$2] = ens.b;
      }
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buv(this));
      this.bO.a(1, new cex.b());
      this.bO.a(4, new cel.b());
      this.bO.a(5, new cel.a());
      this.bO.a(6, new bwb<>(this, 0.5, 20, 15.0F));
      this.bO.a(8, new bvy(this, 0.6));
      this.bO.a(9, new bvj(this, chh.class, 3.0F, 1.0F));
      this.bO.a(10, new bvj(this, boi.class, 8.0F));
      this.bP.a(1, new bwt(this, cir.class).a());
      this.bP.a(2, new bwu<>(this, chh.class, true).c(300));
      this.bP.a(3, new bwu<>(this, cgp.class, false).c(300));
      this.bP.a(3, new bwu<>(this, caf.class, false).c(300));
   }

   public static bpk.a w() {
      return cen.gm().a(bpl.o, 0.5).a(bpl.i, 18.0).a(bpl.n, 32.0);
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.a(bnv.a, new coz(cpc.ot));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public enn i_() {
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

         if (this.aK == 1 || this.ag % 1200 == 0) {
            this.bV = 3;
            float $$0 = -6.0F;
            int $$1 = 13;

            for (int $$2 = 0; $$2 < 4; $$2++) {
               this.bW[0][$$2] = this.bW[1][$$2];
               this.bW[1][$$2] = new ens(
                  (double)(-6.0F + (float)this.af.a(13)) * 0.5, (double)Math.max(0, this.af.a(6) - 4), (double)(-6.0F + (float)this.af.a(13)) * 0.5
               );
            }

            for (int $$3 = 0; $$3 < 16; $$3++) {
               this.dM().a(jz.f, this.d(0.5), this.du(), this.f(0.5), 0.0, 0.0, 0.0);
            }

            this.dM().a(this.dr(), this.dt(), this.dx(), atk.mJ, this.db(), 1.0F, 1.0F, false);
         } else if (this.aK == this.aL - 1) {
            this.bV = 3;

            for (int $$4 = 0; $$4 < 4; $$4++) {
               this.bW[0][$$4] = this.bW[1][$$4];
               this.bW[1][$$4] = new ens(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public atj ag_() {
      return atk.mF;
   }

   public ens[] E(float $$0) {
      if (this.bV <= 0) {
         return this.bW[1];
      } else {
         double $$1 = (double)(((float)this.bV - $$0) / 3.0F);
         $$1 = Math.pow($$1, 0.25);
         ens[] $$2 = new ens[4];

         for (int $$3 = 0; $$3 < 4; $$3++) {
            $$2[$$3] = this.bW[1][$$3].a(1.0 - $$1).e(this.bW[0][$$3].a($$1));
         }

         return $$2;
      }
   }

   @Override
   protected atj y() {
      return atk.mF;
   }

   @Override
   protected atj n_() {
      return atk.mH;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.mI;
   }

   @Override
   protected atj gg() {
      return atk.mG;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public void a(bog $$0, float $$1) {
      coz $$2 = this.g(this.b(cib.a(this, cpc.ot)));
      chn $$3 = cib.a(this, $$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(atk.wF, 1.0F, 1.0F / (this.eh().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   @Override
   public cdv.a u() {
      if (this.gq()) {
         return cdv.a.c;
      } else {
         return this.fY() ? cdv.a.d : cdv.a.a;
      }
   }

   class a extends cex.c {
      private int e;

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else if (cel.this.q() == null) {
            return false;
         } else {
            return cel.this.q().aj() == this.e ? false : cel.this.dM().d_(cel.this.dm()).a((float)blr.c.ordinal());
         }
      }

      @Override
      public void c() {
         super.c();
         bog $$0 = cel.this.q();
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
         cel.this.q().b(new bnb(bnd.o, 400), cel.this);
      }

      @Override
      protected atj l() {
         return atk.mK;
      }

      @Override
      protected cex.a m() {
         return cex.a.f;
      }
   }

   class b extends cex.c {
      @Override
      public boolean a() {
         return !super.a() ? false : !cel.this.a(bnd.n);
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
         cel.this.b(new bnb(bnd.n, 1200));
      }

      @Nullable
      @Override
      protected atj l() {
         return atk.mL;
      }

      @Override
      protected cex.a m() {
         return cex.a.e;
      }
   }
}
