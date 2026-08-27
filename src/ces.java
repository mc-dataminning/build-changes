import javax.annotation.Nullable;

public class ces extends cem {
   private final cet bX = new cet(this);
   private static final int bY = 18000;
   private static final bqd ca = bqg.aN.n().a(bqc.a().a(bqb.a, 0.0F, bqg.aN.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cb;
   private int cc;

   public ces(bqg<? extends ces> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static brz.a r() {
      return gM().a(bsa.q, 15.0).a(bsa.r, 0.2F);
   }

   public static boolean c(bqg<? extends cci> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return !bqx.a($$2) ? cci.b($$0, $$1, $$2, $$3, $$4) : bqx.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(axt $$0) {
      this.f(bsa.m).a(a($$0::j));
   }

   @Override
   protected void gD() {
   }

   @Override
   protected aun v() {
      return this.a(avj.a) ? auo.wM : auo.wI;
   }

   @Override
   protected aun o_() {
      return auo.wJ;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.wK;
   }

   @Override
   protected aun aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return auo.wP;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return auo.wN;
         }

         if (this.cx <= 5) {
            return auo.wP;
         }
      }

      return auo.wL;
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
         this.a(auo.wO, 0.4F, 1.0F);
      } else {
         super.gT();
      }
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? ca : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.u() && this.cc++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cc);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cc = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fi() {
      return 0.96F;
   }

   public boolean u() {
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
   public bpu a(apu $$0, bpu $$1) {
      return bqg.aN.a((czg)$$0);
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      return !this.gC() ? bof.d : super.b($$0, $$1);
   }
}
