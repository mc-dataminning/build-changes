import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzb extends byv {
   private final bzc bT = new bzc(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bzb(bkz<? extends bzb> $$0, csf $$1) {
      super($$0, $$1);
   }

   public static bmq.a u() {
      return gF().a(bmr.l, 15.0).a(bmr.m, 0.2F);
   }

   @Override
   protected void a(atw $$0) {
      this.a(bmr.h).a(a($$0::j));
   }

   @Override
   protected void gv() {
   }

   @Override
   protected aqu y() {
      return this.a(arp.a) ? aqv.vQ : aqv.vM;
   }

   @Override
   protected aqu n_() {
      return aqv.vN;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.vO;
   }

   @Override
   protected aqu aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return aqv.vT;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return aqv.vR;
         }

         if (this.cu <= 5) {
            return aqv.vT;
         }
      }

      return aqv.vP;
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
         this.a(aqv.vS, 0.4F, 1.0F);
      } else {
         super.gM();
      }
   }

   @Override
   public blq eT() {
      return blq.b;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.03125F : 0.28125F) * $$2, 0.0F);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.w() && this.bX++ >= 18000) {
         this.am();
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(sd $$0) {
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
   public bkq a(ami $$0, bkq $$1) {
      return bkz.aK.a((csf)$$0);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      return !this.gu() ? bjb.d : super.b($$0, $$1);
   }
}
