import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwr extends bwl {
   private final bws bT = new bws(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bwr(bip<? extends bwr> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static bkg.a p() {
      return gA().a(bkh.a, 15.0).a(bkh.d, 0.2F);
   }

   @Override
   protected void a(arx $$0) {
      this.a(bkh.n).a(a($$0::j));
   }

   @Override
   protected void gq() {
   }

   @Override
   protected aoy r() {
      return this.a(apt.a) ? aoz.vv : aoz.vr;
   }

   @Override
   protected aoy h_() {
      return aoz.vs;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.vt;
   }

   @Override
   protected aoy aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return aoz.vy;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aoz.vw;
         }

         if (this.cu <= 5) {
            return aoz.vy;
         }
      }

      return aoz.vu;
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
   protected void gH() {
      if (this.aX()) {
         this.a(aoz.vx, 0.4F, 1.0F);
      } else {
         super.gH();
      }
   }

   @Override
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
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
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.q());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(qu $$0) {
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
   public big a(akn $$0, big $$1) {
      return bip.aK.a((cpq)$$0);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      return !this.gp() ? bgt.d : super.b($$0, $$1);
   }
}
