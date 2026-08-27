import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwp extends bwj {
   private final bwq bT = new bwq(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bwp(bim<? extends bwp> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public static bke.a p() {
      return gz().a(bkf.a, 15.0).a(bkf.d, 0.2F);
   }

   @Override
   protected void a(aru $$0) {
      this.a(bkf.n).a(a($$0::j));
   }

   @Override
   protected void gp() {
   }

   @Override
   protected aov r() {
      return this.a(apq.a) ? aow.vv : aow.vr;
   }

   @Override
   protected aov h_() {
      return aow.vs;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.vt;
   }

   @Override
   protected aov aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return aow.vy;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aow.vw;
         }

         if (this.cu <= 5) {
            return aow.vy;
         }
      }

      return aow.vu;
   }

   @Override
   protected void e(float $$0) {
      if (this.aA()) {
         super.e(0.3F);
      } else {
         super.e(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gG() {
      if (this.aX()) {
         this.a(aow.vx, 0.4F, 1.0F);
      } else {
         super.gG();
      }
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.03125F : 0.28125F) * $$2, 0.0F);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.q() && this.bX++ >= 18000) {
         this.ak();
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.q());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bX = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fb() {
      return 0.96F;
   }

   public boolean q() {
      return this.bW;
   }

   public void w(boolean $$0) {
      if ($$0 != this.bW) {
         this.bW = $$0;
         if ($$0) {
            this.bO.a(1, this.bT);
         } else {
            this.bO.a(this.bT);
         }
      }
   }

   @Nullable
   @Override
   public bid a(akk $$0, bid $$1) {
      return bim.aK.a((cpm)$$0);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      return !this.go() ? bgq.d : super.b($$0, $$1);
   }
}
