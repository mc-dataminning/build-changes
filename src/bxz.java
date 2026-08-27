import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxz extends bxt {
   private final bya bT = new bya(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bxz(bjx<? extends bxz> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public static blo.a s() {
      return gE().a(blp.l, 15.0).a(blp.m, 0.2F);
   }

   @Override
   protected void a(ate $$0) {
      this.a(blp.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected aqc w() {
      return this.a(aqx.a) ? aqd.vx : aqd.vt;
   }

   @Override
   protected aqc m_() {
      return aqd.vu;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.vv;
   }

   @Override
   protected aqc aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return aqd.vA;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aqd.vy;
         }

         if (this.cu <= 5) {
            return aqd.vA;
         }
      }

      return aqd.vw;
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
         this.a(aqd.vz, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bko eR() {
      return bko.b;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
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
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(rt $$0) {
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
   public bjo a(alq $$0, bjo $$1) {
      return bjx.aK.a((cqz)$$0);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      return !this.gt() ? bib.d : super.b($$0, $$1);
   }
}
