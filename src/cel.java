import javax.annotation.Nullable;

public class cel extends cef {
   private final cem bX = new cem(this);
   private static final int bY = 18000;
   private static final bpy ca = bqb.aN.n().a(bpx.a().a(bpw.a, 0.0F, bqb.aN.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cb;
   private int cc;

   public cel(bqb<? extends cel> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public static bru.a r() {
      return gM().a(brv.q, 15.0).a(brv.r, 0.2F);
   }

   public static boolean c(bqb<? extends ccd> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return !bqs.a($$2) ? ccd.b($$0, $$1, $$2, $$3, $$4) : bqs.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(axr $$0) {
      this.f(brv.m).a(a($$0::j));
   }

   @Override
   protected void gD() {
   }

   @Override
   protected aul v() {
      return this.a(avh.a) ? aum.wM : aum.wI;
   }

   @Override
   protected aul o_() {
      return aum.wJ;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.wK;
   }

   @Override
   protected aul aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return aum.wP;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return aum.wN;
         }

         if (this.cx <= 5) {
            return aum.wP;
         }
      }

      return aum.wL;
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
         this.a(aum.wO, 0.4F, 1.0F);
      } else {
         super.gT();
      }
   }

   @Override
   public bpy e(bqz $$0) {
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
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cc);
   }

   @Override
   public void a(tm $$0) {
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
   public bpp a(aps $$0, bpp $$1) {
      return bqb.aN.a((cyx)$$0);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      return !this.gC() ? boa.d : super.b($$0, $$1);
   }
}
