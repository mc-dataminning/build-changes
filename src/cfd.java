import javax.annotation.Nullable;

public class cfd extends cex {
   private final cfe bY = new cfe(this);
   private static final int bZ = 18000;
   private static final bqo cb = bqr.aN.n().a(bqn.a().a(bqm.a, 0.0F, bqr.aN.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cfd(bqr<? extends cfd> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static bsk.a r() {
      return gO().a(bsl.q, 15.0).a(bsl.r, 0.2F);
   }

   public static boolean c(bqr<? extends cct> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return !bri.a($$2) ? cct.b($$0, $$1, $$2, $$3, $$4) : bri.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayd $$0) {
      this.f(bsl.m).a(a($$0::j));
   }

   @Override
   protected void gF() {
   }

   @Override
   protected auy v() {
      return this.a(avt.a) ? auz.wT : auz.wP;
   }

   @Override
   protected auy o_() {
      return auz.wQ;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.wR;
   }

   @Override
   protected auy aN() {
      if (this.aC()) {
         if (!this.bQ()) {
            return auz.wW;
         }

         this.cy++;
         if (this.cy > 5 && this.cy % 3 == 0) {
            return auz.wU;
         }

         if (this.cy <= 5) {
            return auz.wW;
         }
      }

      return auz.wS;
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
         this.a(auz.wV, 0.4F, 1.0F);
      } else {
         super.gV();
      }
   }

   @Override
   public bqo e(brp $$0) {
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
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(ty $$0) {
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
   public bqf a(aqe $$0, bqf $$1) {
      return bqr.aN.a((czu)$$0);
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      return !this.gE() ? boq.d : super.b($$0, $$1);
   }
}
