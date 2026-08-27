import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxc extends bww {
   private final bxd bT = new bxd(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bxc(bja<? extends bxc> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static bkr.a s() {
      return gE().a(bks.l, 15.0).a(bks.m, 0.2F);
   }

   @Override
   protected void a(ash $$0) {
      this.a(bks.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected apf w() {
      return this.a(aqa.a) ? apg.vv : apg.vr;
   }

   @Override
   protected apf l_() {
      return apg.vs;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.vt;
   }

   @Override
   protected apf aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return apg.vy;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return apg.vw;
         }

         if (this.cu <= 5) {
            return apg.vy;
         }
      }

      return apg.vu;
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
   protected void gL() {
      if (this.aX()) {
         this.a(apg.vx, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bjr eR() {
      return bjr.b;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.m_() ? 0.03125F : 0.28125F) * $$2, 0.0F);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.t() && this.bX++ >= 18000) {
         this.ak();
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bX = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fc() {
      return 0.96F;
   }

   public boolean t() {
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
   public bir a(akt $$0, bir $$1) {
      return bja.aK.a((cqb)$$0);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      return !this.gt() ? bhe.d : super.b($$0, $$1);
   }
}
