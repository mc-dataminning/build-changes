import javax.annotation.Nullable;

public class cak extends cae {
   private final cal bU = new cal(this);
   private static final int bV = 18000;
   private static final blz bX = bmc.aM.n().a(bly.a().a(blx.a, 0.0F, bmc.aM.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bY;
   private int bZ;

   public cak(bmc<? extends cak> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public static bnt.a u() {
      return gF().a(bnu.n, 15.0).a(bnu.o, 0.2F);
   }

   public static boolean c(bmc<? extends byc> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return !bms.a($$2) ? byc.b($$0, $$1, $$2, $$3, $$4) : bms.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auw $$0) {
      this.f(bnu.j).a(a($$0::j));
   }

   @Override
   protected void gv() {
   }

   @Override
   protected ars y() {
      return this.a(asn.a) ? art.wA : art.ww;
   }

   @Override
   protected ars n_() {
      return art.wx;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.wy;
   }

   @Override
   protected ars aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return art.wD;
         }

         this.cv++;
         if (this.cv > 5 && this.cv % 3 == 0) {
            return art.wB;
         }

         if (this.cv <= 5) {
            return art.wD;
         }
      }

      return art.wz;
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
   protected void gM() {
      if (this.aZ()) {
         this.a(art.wC, 0.4F, 1.0F);
      } else {
         super.gM();
      }
   }

   @Override
   public bmt eS() {
      return bmt.b;
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? bX : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.w() && this.bZ++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bZ);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bZ = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fd() {
      return 0.96F;
   }

   public boolean w() {
      return this.bY;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bY) {
         this.bY = $$0;
         if ($$0) {
            this.bP.a(1, this.bU);
         } else {
            this.bP.a(this.bU);
         }
      }
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return bmc.aM.a((ctx)$$0);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      return !this.gu() ? bkc.d : super.b($$0, $$1);
   }
}
