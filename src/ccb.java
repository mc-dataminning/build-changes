import javax.annotation.Nullable;

public class ccb extends cbv {
   private final ccc bT = new ccc(this);
   private static final int bU = 18000;
   private static final bnr bW = bnu.aM.n().a(bnq.a().a(bnp.a, 0.0F, bnu.aM.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean bX;
   private int bY;

   public ccb(bnu<? extends ccb> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public static bpk.a u() {
      return gG().a(bpl.n, 15.0).a(bpl.o, 0.2F);
   }

   public static boolean c(bnu<? extends bzt> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return !bok.a($$2) ? bzt.b($$0, $$1, $$2, $$3, $$4) : bok.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(awo $$0) {
      this.f(bpl.j).a(a($$0::j));
   }

   @Override
   protected void gw() {
   }

   @Override
   protected atj y() {
      return this.a(aue.a) ? atk.wA : atk.ww;
   }

   @Override
   protected atj n_() {
      return atk.wx;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.wy;
   }

   @Override
   protected atj aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return atk.wD;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return atk.wB;
         }

         if (this.cu <= 5) {
            return atk.wD;
         }
      }

      return atk.wz;
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
   protected void gN() {
      if (this.aZ()) {
         this.a(atk.wC, 0.4F, 1.0F);
      } else {
         super.gN();
      }
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? bW : super.e($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.w() && this.bY++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bY);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bY = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fd() {
      return 0.96F;
   }

   public boolean w() {
      return this.bX;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bX) {
         this.bX = $$0;
         if ($$0) {
            this.bO.a(1, this.bT);
         } else {
            this.bO.a(this.bT);
         }
      }
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return bnu.aM.a((cvn)$$0);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      return !this.gv() ? blu.d : super.b($$0, $$1);
   }
}
