import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byw extends byq {
   private final byx bT = new byx(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public byw(bku<? extends byw> $$0, csa $$1) {
      super($$0, $$1);
   }

   public static bml.a u() {
      return gF().a(bmm.l, 15.0).a(bmm.m, 0.2F);
   }

   @Override
   protected void a(ats $$0) {
      this.a(bmm.h).a(a($$0::j));
   }

   @Override
   protected void gv() {
   }

   @Override
   protected aqq y() {
      return this.a(arl.a) ? aqr.vQ : aqr.vM;
   }

   @Override
   protected aqq m_() {
      return aqr.vN;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.vO;
   }

   @Override
   protected aqq aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return aqr.vT;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aqr.vR;
         }

         if (this.cu <= 5) {
            return aqr.vT;
         }
      }

      return aqr.vP;
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
   protected void gM() {
      if (this.aZ()) {
         this.a(aqr.vS, 0.4F, 1.0F);
      } else {
         super.gM();
      }
   }

   @Override
   public bll eT() {
      return bll.b;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.03125F : 0.28125F) * $$2, 0.0F);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.w() && this.bX++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bX = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fe() {
      return 0.96F;
   }

   public boolean w() {
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
   public bkl a(ame $$0, bkl $$1) {
      return bku.aK.a((csa)$$0);
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      return !this.gu() ? bix.d : super.b($$0, $$1);
   }
}
