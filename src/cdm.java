import javax.annotation.Nullable;

public class cdm extends cdg {
   private final cdn bX = new cdn(this);
   private static final int bY = 18000;
   private static final bpa ca = bpd.aO.n().a(boz.a().a(boy.a, 0.0F, bpd.aO.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cb;
   private int cc;

   public cdm(bpd<? extends cdm> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public static bqv.a r() {
      return gM().a(bqw.q, 15.0).a(bqw.r, 0.2F);
   }

   public static boolean c(bpd<? extends cbe> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return !bpt.a($$2) ? cbe.b($$0, $$1, $$2, $$3, $$4) : bpt.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(axd $$0) {
      this.f(bqw.m).a(a($$0::j));
   }

   @Override
   protected void gD() {
   }

   @Override
   protected atx v() {
      return this.a(aus.a) ? aty.wJ : aty.wF;
   }

   @Override
   protected atx n_() {
      return aty.wG;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.wH;
   }

   @Override
   protected atx aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return aty.wM;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return aty.wK;
         }

         if (this.cx <= 5) {
            return aty.wM;
         }
      }

      return aty.wI;
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
         this.a(aty.wL, 0.4F, 1.0F);
      } else {
         super.gT();
      }
   }

   @Override
   public bpa e(bqa $$0) {
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
   public bos a(apf $$0, bos $$1) {
      return bpd.aO.a((cxb)$$0);
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      return !this.gC() ? bnd.d : super.b($$0, $$1);
   }
}
