import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byo extends byi {
   private final byp bT = new byp(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public byo(bkm<? extends byo> $$0, crs $$1) {
      super($$0, $$1);
   }

   public static bmd.a s() {
      return gE().a(bme.l, 15.0).a(bme.m, 0.2F);
   }

   @Override
   protected void a(ato $$0) {
      this.a(bme.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected aqm w() {
      return this.a(arh.a) ? aqn.vz : aqn.vv;
   }

   @Override
   protected aqm m_() {
      return aqn.vw;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.vx;
   }

   @Override
   protected aqm aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return aqn.vC;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aqn.vA;
         }

         if (this.cu <= 5) {
            return aqn.vC;
         }
      }

      return aqn.vy;
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
         this.a(aqn.vB, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bld eR() {
      return bld.b;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.03125F : 0.28125F) * $$2, 0.0F);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.t() && this.bX++ >= 18000) {
         this.ak();
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(rz $$0) {
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
   public bkd a(ama $$0, bkd $$1) {
      return bkm.aK.a((crs)$$0);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      return !this.gt() ? biq.d : super.b($$0, $$1);
   }
}
