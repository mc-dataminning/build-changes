import javax.annotation.Nullable;

public class cln extends clh {
   private final clo bG = new clo(this);
   private static final int bH = 18000;
   private static final bwi bI = bwo.bg.n().a(bwh.a().a(bwg.a, 0.0F, bwo.bg.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bK;
   private int bL;

   public cln(bwo<? extends cln> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static byj.a q() {
      return gS().a(byk.s, 15.0).a(byk.v, 0.2F);
   }

   public static boolean c(bwo<? extends ciu> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return !bwn.a($$2) ? ciu.b($$0, $$1, $$2, $$3, $$4) : bwn.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byk.o).a(a($$0::j));
   }

   @Override
   protected void gJ() {
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
   protected awm e(buu $$0) {
      return awn.xW;
   }

   @Override
   protected awm aV() {
      if (this.aJ()) {
         if (!this.ca()) {
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
      if (this.aJ()) {
         super.g(0.3F);
      } else {
         super.g(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gY() {
      if (this.bj()) {
         this.a(awn.ya, 0.4F, 1.0F);
      } else {
         super.gY();
      }
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bI : super.e($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.t() && this.bL++ >= 18000) {
         this.at();
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
      this.w($$0.q("SkeletonTrap"));
      this.bL = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fk() {
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
   public bvv a(arq $$0, bvv $$1) {
      return bwo.bg.a($$0, bwn.e);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      return (bud)(!this.gI() ? bud.e : super.b($$0, $$1));
   }
}
