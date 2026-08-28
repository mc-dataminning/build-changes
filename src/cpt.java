import javax.annotation.Nullable;

public class cpt extends cou {
   private static final akl<Byte> g = akp.a(cpt.class, akn.a);
   private static final akl<Boolean> h = akp.a(cpt.class, akn.k);
   private boolean i;
   public int f;

   public cpt(bul<? extends cpt> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpt(dfb $$0, bva $$1, cwb $$2) {
      super(bul.bf, $$1, $$0, $$2, null);
      this.am.a(g, this.c($$2));
      this.am.a(h, $$2.B());
   }

   public cpt(dfb $$0, double $$1, double $$2, double $$3, cwb $$4) {
      super(bul.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.am.a(g, this.c($$4));
      this.am.a(h, $$4.B());
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bue $$0 = this.s();
      int $$1 = this.am.a(g);
      if ($$1 > 0 && (this.i || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (!this.dX().C && this.d == cou.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.av();
         } else {
            this.b(true);
            ezn $$2 = $$0.bG().d(this.dv());
            this.o(this.dC(), this.dE() + $$2.e * 0.015 * (double)$$1, this.dI());
            double $$3 = 0.05 * (double)$$1;
            this.h(this.dA().c(0.95).e($$2.d().c($$3)));
            if (this.f == 0) {
               this.a(awl.zG, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean G() {
      bue $$0 = this.s();
      return $$0 == null || !$$0.bM() ? false : !($$0 instanceof aro) || !$$0.R_();
   }

   public boolean D() {
      return this.am.a(h);
   }

   @Nullable
   @Override
   protected ezk c(ezn $$0, ezn $$1) {
      return this.i ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(ezk $$0) {
      bue $$1 = $$0.a();
      float $$2 = 8.0F;
      bue $$3 = this.s();
      bsu $$4 = this.dY().a(this, (bue)($$3 == null ? this : $$3));
      if (this.dX() instanceof arn $$5) {
         $$2 = dbu.a($$5, this.eb(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.ar() == bul.H) {
            return;
         }

         if (this.dX() instanceof arn $$6) {
            dbu.a($$6, $$1, $$4, this.eb(), $$0x -> this.au());
         }

         if ($$1 instanceof bva $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cph.b, $$1, this.s(), false);
      this.h(this.dA().d(0.02, 0.2, 0.02));
      this.a(awl.zE, 1.0F, 1.0F);
   }

   @Override
   protected void a(arn $$0, ezj $$1, cwb $$2) {
      ezn $$3 = $$1.b().a($$1.g());
      dbu.a($$0, $$2, this.s() instanceof bva $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.au());
   }

   @Override
   public cwb eb() {
      return this.w();
   }

   @Override
   protected boolean a(com $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gk().f(this.t());
   }

   @Override
   protected cwb v() {
      return new cwb(cwf.vU);
   }

   @Override
   protected awk o() {
      return awl.zF;
   }

   @Override
   public void b_(com $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.am.a(g, this.c(this.w()));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cwb $$0) {
      return this.dX() instanceof arn $$1 ? (byte)azk.a(dbu.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.am.a(g);
      if (this.d != cou.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float A() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
