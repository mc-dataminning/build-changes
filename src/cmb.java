import javax.annotation.Nullable;

public class cmb extends clv {
   private final cmc bI = new cmc(this);
   private static final int bJ = 18000;
   private static final boolean bK = false;
   private static final int bM = 0;
   private static final bwy bN = bxe.bh.n().a(bwx.a().a(bww.a, 0.0F, bxe.bh.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bO = false;
   private int bP = 0;

   public cmb(bxe<? extends cmb> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static bzb.a q() {
      return gV().a(bzc.s, 15.0).a(bzc.v, 0.2F);
   }

   public static boolean c(bxe<? extends cjm> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return !bxd.a($$2) ? cjm.b($$0, $$1, $$2, $$3, $$4) : bxd.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azz $$0) {
      this.g(bzc.o).a(a($$0::j));
   }

   @Override
   protected void gM() {
   }

   @Override
   protected awq u() {
      return this.a(axl.a) ? awr.xY : awr.xU;
   }

   @Override
   protected awq l_() {
      return awr.xV;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.xW;
   }

   @Override
   protected awq aU() {
      if (this.aH()) {
         if (!this.bZ()) {
            return awr.yb;
         }

         this.cf++;
         if (this.cf > 5 && this.cf % 3 == 0) {
            return awr.xZ;
         }

         if (this.cf <= 5) {
            return awr.yb;
         }
      }

      return awr.xX;
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
         this.a(awr.ya, 0.4F, 1.0F);
      } else {
         super.hb();
      }
   }

   @Override
   public bwy e(byi $$0) {
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
   public bwl a(aru $$0, bwl $$1) {
      return bxe.bh.a($$0, bxd.e);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      return (but)(!this.gL() ? but.e : super.b($$0, $$1));
   }
}
