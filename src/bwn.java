import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwn extends bwh {
   private final bwo bT = new bwo(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bwn(bik<? extends bwn> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static bkc.a p() {
      return gz().a(bkd.a, 15.0).a(bkd.d, 0.2F);
   }

   @Override
   protected void a(art $$0) {
      this.a(bkd.n).a(a($$0::j));
   }

   @Override
   protected void gp() {
   }

   @Override
   protected aot r() {
      return this.a(apo.a) ? aou.vv : aou.vr;
   }

   @Override
   protected aot h_() {
      return aou.vs;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.vt;
   }

   @Override
   protected aot aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return aou.vy;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aou.vw;
         }

         if (this.cu <= 5) {
            return aou.vy;
         }
      }

      return aou.vu;
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
         this.a(aou.vx, 0.4F, 1.0F);
      } else {
         super.gG();
      }
   }

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
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
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.q());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(qs $$0) {
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
   public bib a(aki $$0, bib $$1) {
      return bik.aK.a((cpk)$$0);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      return !this.go() ? bgo.d : super.b($$0, $$1);
   }
}
