import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwy extends bws {
   private final bwz bT = new bwz(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bwy(biw<? extends bwy> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public static bkn.a s() {
      return gD().a(bko.a, 15.0).a(bko.d, 0.2F);
   }

   @Override
   protected void a(ase $$0) {
      this.a(bko.n).a(a($$0::j));
   }

   @Override
   protected void gt() {
   }

   @Override
   protected ape w() {
      return this.a(apz.a) ? apf.vv : apf.vr;
   }

   @Override
   protected ape l_() {
      return apf.vs;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.vt;
   }

   @Override
   protected ape aL() {
      if (this.aA()) {
         if (!this.bO()) {
            return apf.vy;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return apf.vw;
         }

         if (this.cu <= 5) {
            return apf.vy;
         }
      }

      return apf.vu;
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
         this.a(apf.vx, 0.4F, 1.0F);
      } else {
         super.gK();
      }
   }

   @Override
   public bjn eR() {
      return bjn.b;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
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
   public bin a(aks $$0, bin $$1) {
      return biw.aK.a((cpx)$$0);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      return !this.gs() ? bha.d : super.b($$0, $$1);
   }
}
