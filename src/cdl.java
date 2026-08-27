import javax.annotation.Nullable;

public class cdl extends cdf {
   private final cdm bX = new cdm(this);
   private static final int bY = 18000;
   private static final boz ca = bpc.aN.n().a(boy.a().a(box.a, 0.0F, bpc.aN.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cb;
   private int cc;

   public cdl(bpc<? extends cdl> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public static bqu.a r() {
      return gM().a(bqv.q, 15.0).a(bqv.r, 0.2F);
   }

   public static boolean c(bpc<? extends cbd> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return !bps.a($$2) ? cbd.b($$0, $$1, $$2, $$3, $$4) : bps.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(axd $$0) {
      this.f(bqv.m).a(a($$0::j));
   }

   @Override
   protected void gD() {
   }

   @Override
   protected atx v() {
      return this.a(aus.a) ? aty.wE : aty.wA;
   }

   @Override
   protected atx n_() {
      return aty.wB;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.wC;
   }

   @Override
   protected atx aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return aty.wH;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return aty.wF;
         }

         if (this.cx <= 5) {
            return aty.wH;
         }
      }

      return aty.wD;
   }

   @Override
   protected void e(float $$0) {
      if (this.aC()) {
         super.e(0.3F);
      } else {
         super.e(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gT() {
      if (this.bc()) {
         this.a(aty.wG, 0.4F, 1.0F);
      } else {
         super.gT();
      }
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? ca : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.s() && this.cc++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.s());
      $$0.a("SkeletonTrapTime", this.cc);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cc = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fi() {
      return 0.96F;
   }

   public boolean s() {
      return this.cb;
   }

   public void w(boolean $$0) {
      if ($$0 != this.cb) {
         this.cb = $$0;
         if ($$0) {
            this.bR.a(1, this.bX);
         } else {
            this.bR.a(this.bX);
         }
      }
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      return bpc.aN.a((cwz)$$0);
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      return !this.gC() ? bnc.d : super.b($$0, $$1);
   }
}
