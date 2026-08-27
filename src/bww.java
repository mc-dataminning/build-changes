import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bww extends bwq {
   private final bwx bT = new bwx(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bww(biu<? extends bww> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public static bkl.a s() {
      return gD().a(bkm.a, 15.0).a(bkm.d, 0.2F);
   }

   @Override
   protected void a(asc $$0) {
      this.a(bkm.n).a(a($$0::j));
   }

   @Override
   protected void gt() {
   }

   @Override
   protected apd w() {
      return this.a(apy.a) ? ape.vv : ape.vr;
   }

   @Override
   protected apd l_() {
      return ape.vs;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.vt;
   }

   @Override
   protected apd aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return ape.vy;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return ape.vw;
         }

         if (this.cu <= 5) {
            return ape.vy;
         }
      }

      return ape.vu;
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
   protected void gK() {
      if (this.aX()) {
         this.a(ape.vx, 0.4F, 1.0F);
      } else {
         super.gK();
      }
   }

   @Override
   public bjl eR() {
      return bjl.b;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
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
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(qy $$0) {
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
   public bil a(akr $$0, bil $$1) {
      return biu.aK.a((cpv)$$0);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      return !this.gs() ? bgy.d : super.b($$0, $$1);
   }
}
