import javax.annotation.Nullable;

public class css extends crr {
   private static final akj<Byte> e = akn.a(css.class, akl.a);
   private static final akj<Boolean> f = akn.a(css.class, akl.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public css(bwr<? extends css> $$0, djh $$1) {
      super($$0, $$1);
   }

   public css(djh $$0, bxj $$1, czk $$2) {
      super(bwr.bz, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public css(djh $$0, double $$1, double $$2, double $$3, czk $$4) {
      super(bwr.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bwi $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dU() instanceof arq $$2 && this.b == crr.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.aq();
         } else {
            if (!($$0 instanceof crj) && this.ds().f($$0.bC()) < (double)$$0.dp() + 1.0) {
               this.aq();
               return;
            }

            this.q(true);
            fex $$3 = $$0.bC().d(this.ds());
            this.o(this.dz(), this.dB() + $$3.e * 0.015 * (double)$$1, this.dF());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dx().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awn.AG, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bwi $$0 = this.q();
      return $$0 == null || !$$0.bI() ? false : !($$0 instanceof arr) || !$$0.V_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected feu c(fex $$0, fex $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(feu $$0) {
      bwi $$1 = $$0.a();
      float $$2 = 8.0F;
      bwi $$3 = this.q();
      bux $$4 = this.dV().a(this, (bwi)($$3 == null ? this : $$3));
      if (this.dU() instanceof arq $$5) {
         $$2 = dfz.a($$5, this.dY(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.an() == bwr.N) {
            return;
         }

         if (this.dU() instanceof arq $$6) {
            dfz.a($$6, $$1, $$4, this.dY(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bxj $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(csf.b, $$1, this.q(), false);
      this.i(this.dx().d(0.02, 0.2, 0.02));
      this.a(awn.AE, 1.0F, 1.0F);
   }

   @Override
   protected void a(arq $$0, fet $$1, czk $$2) {
      fex $$3 = $$1.b().a($$1.g());
      dfz.a($$0, $$2, this.q() instanceof bxj $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public czk dY() {
      return this.s();
   }

   @Override
   protected boolean a(crj $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gi().g(this.n());
   }

   @Override
   protected czk o() {
      return new czk(czo.xd);
   }

   @Override
   protected awm j() {
      return awn.AF;
   }

   @Override
   public void a_(crj $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.h = $$0.o("DealtDamage");
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(czk $$0) {
      return this.dU() instanceof arq $$1 ? (byte)azm.a(dfz.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != crr.a.b || $$0 <= 0) {
         super.g();
      }
   }

   @Override
   protected float v() {
      return 0.99F;
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return true;
   }
}
