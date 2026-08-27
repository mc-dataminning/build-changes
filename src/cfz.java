import javax.annotation.Nullable;

public class cfz extends cft {
   private final cga bY = new cga(this);
   private static final int bZ = 18000;
   private static final brk cb = brn.aN.n().a(brj.a().a(bri.a, 0.0F, brn.aN.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cfz(brn<? extends cfz> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static btg.a r() {
      return gO().a(bth.q, 15.0).a(bth.r, 0.2F);
   }

   public static boolean c(brn<? extends cdp> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return !bse.a($$2) ? cdp.b($$0, $$1, $$2, $$3, $$4) : bse.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayg $$0) {
      this.f(bth.m).a(a($$0::j));
   }

   @Override
   protected void gF() {
   }

   @Override
   protected avb v() {
      return this.a(avw.a) ? avc.wU : avc.wQ;
   }

   @Override
   protected avb o_() {
      return avc.wR;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.wS;
   }

   @Override
   protected avb aN() {
      if (this.aC()) {
         if (!this.bQ()) {
            return avc.wX;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return avc.wV;
         }

         if (this.cx <= 5) {
            return avc.wX;
         }
      }

      return avc.wT;
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
   protected void gV() {
      if (this.bc()) {
         this.a(avc.wW, 0.4F, 1.0F);
      } else {
         super.gV();
      }
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? cb : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.u() && this.cd++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean u() {
      return this.cc;
   }

   public void w(boolean $$0) {
      if ($$0 != this.cc) {
         this.cc = $$0;
         if ($$0) {
            this.bS.a(1, this.bY);
         } else {
            this.bS.a(this.bY);
         }
      }
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      return brn.aN.a((dad)$$0);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      return !this.gE() ? bpm.d : super.b($$0, $$1);
   }
}
