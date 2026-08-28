import javax.annotation.Nullable;

public class clz extends clt {
   private final cma bI = new cma(this);
   private static final int bJ = 18000;
   private static final boolean bK = false;
   private static final int bM = 0;
   private static final bww bN = bxc.bh.n().a(bwv.a().a(bwu.a, 0.0F, bxc.bh.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bO = false;
   private int bP = 0;

   public clz(bxc<? extends clz> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static byz.a q() {
      return gV().a(bza.s, 15.0).a(bza.v, 0.2F);
   }

   public static boolean c(bxc<? extends cjk> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return !bxb.a($$2) ? cjk.b($$0, $$1, $$2, $$3, $$4) : bxb.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azx $$0) {
      this.g(bza.o).a(a($$0::j));
   }

   @Override
   protected void gM() {
   }

   @Override
   protected awo u() {
      return this.a(axj.a) ? awp.xY : awp.xU;
   }

   @Override
   protected awo l_() {
      return awp.xV;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.xW;
   }

   @Override
   protected awo aU() {
      if (this.aH()) {
         if (!this.bZ()) {
            return awp.yb;
         }

         this.cf++;
         if (this.cf > 5 && this.cf % 3 == 0) {
            return awp.xZ;
         }

         if (this.cf <= 5) {
            return awp.yb;
         }
      }

      return awp.xX;
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
   protected void hb() {
      if (this.bi()) {
         this.a(awp.ya, 0.4F, 1.0F);
      } else {
         super.hb();
      }
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.t() && this.bP++ >= 18000) {
         this.aq();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bP);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("SkeletonTrap", false));
      this.bP = $$0.b("SkeletonTrapTime", 0);
   }

   @Override
   protected float fk() {
      return 0.96F;
   }

   public boolean t() {
      return this.bO;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bO) {
         this.bO = $$0;
         if ($$0) {
            this.bF.a(1, this.bI);
         } else {
            this.bF.a(this.bI);
         }
      }
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.bh.a($$0, bxb.e);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      return (bur)(!this.gL() ? bur.e : super.b($$0, $$1));
   }
}
