import javax.annotation.Nullable;

public class cmk extends cme {
   private final cml bI = new cml(this);
   private static final int bJ = 18000;
   private static final boolean bK = false;
   private static final int bM = 0;
   private static final bxh bN = bxn.bh.n().a(bxg.a().a(bxf.a, 0.0F, bxn.bh.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bO = false;
   private int bP = 0;

   public cmk(bxn<? extends cmk> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static bzk.a q() {
      return gV().a(bzl.s, 15.0).a(bzl.v, 0.2F);
   }

   public static boolean c(bxn<? extends cjv> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return !bxm.a($$2) ? cjv.b($$0, $$1, $$2, $$3, $$4) : bxm.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(bai $$0) {
      this.g(bzl.o).a(a($$0::j));
   }

   @Override
   protected void gM() {
   }

   @Override
   protected awx u() {
      return this.a(axs.a) ? awy.xY : awy.xU;
   }

   @Override
   protected awx l_() {
      return awy.xV;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.xW;
   }

   @Override
   protected awx aU() {
      if (this.aH()) {
         if (!this.bZ()) {
            return awy.yb;
         }

         this.cf++;
         if (this.cf > 5 && this.cf % 3 == 0) {
            return awy.xZ;
         }

         if (this.cf <= 5) {
            return awy.yb;
         }
      }

      return awy.xX;
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
         this.a(awy.ya, 0.4F, 1.0F);
      } else {
         super.hb();
      }
   }

   @Override
   public bxh e(byr $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bP);
   }

   @Override
   public void a(ua $$0) {
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
   public bwu a(asb $$0, bwu $$1) {
      return bxn.bh.a($$0, bxm.e);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      return (bvc)(!this.gL() ? bvc.e : super.b($$0, $$1));
   }
}
