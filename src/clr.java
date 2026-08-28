import javax.annotation.Nullable;

public class clr extends cll {
   private final cls bG = new cls(this);
   private static final int bH = 18000;
   private static final bwl bI = bwr.bg.n().a(bwk.a().a(bwj.a, 0.0F, bwr.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bK;
   private int bL;

   public clr(bwr<? extends clr> $$0, djh $$1) {
      super($$0, $$1);
   }

   public static byo.a q() {
      return gU().a(byp.s, 15.0).a(byp.v, 0.2F);
   }

   public static boolean c(bwr<? extends ciz> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return !bwq.a($$2) ? ciz.b($$0, $$1, $$2, $$3, $$4) : bwq.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byp.o).a(a($$0::j));
   }

   @Override
   protected void gL() {
   }

   @Override
   protected awm u() {
      return this.a(axh.a) ? awn.xY : awn.xU;
   }

   @Override
   protected awm l_() {
      return awn.xV;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.xW;
   }

   @Override
   protected awm aT() {
      if (this.aH()) {
         if (!this.bY()) {
            return awn.yb;
         }

         this.cd++;
         if (this.cd > 5 && this.cd % 3 == 0) {
            return awn.xZ;
         }

         if (this.cd <= 5) {
            return awn.yb;
         }
      }

      return awn.xX;
   }

   @Override
   protected void g(float $$0) {
      if (this.aH()) {
         super.g(0.3F);
      } else {
         super.g(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void ha() {
      if (this.bh()) {
         this.a(awn.ya, 0.4F, 1.0F);
      } else {
         super.ha();
      }
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bI : super.e($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.t() && this.bL++ >= 18000) {
         this.aq();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bL);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("SkeletonTrap"));
      this.bL = $$0.f("SkeletonTrapTime");
   }

   @Override
   protected float fj() {
      return 0.96F;
   }

   public boolean t() {
      return this.bK;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bK) {
         this.bK = $$0;
         if ($$0) {
            this.bD.a(1, this.bG);
         } else {
            this.bD.a(this.bG);
         }
      }
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.bg.a($$0, bwq.e);
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      return (bug)(!this.gK() ? bug.e : super.b($$0, $$1));
   }
}
