import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzx extends bzr {
   private final bzy bT = new bzy(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bzx(blt<? extends bzx> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static bnk.a u() {
      return gE().a(bnl.l, 15.0).a(bnl.m, 0.2F);
   }

   public static boolean c(blt<? extends bxs> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return !bmj.a($$2) ? bxs.b($$0, $$1, $$2, $$3, $$4) : bmj.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(aup $$0) {
      this.a(bnl.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected arl y() {
      return this.a(asg.a) ? arm.wl : arm.wh;
   }

   @Override
   protected arl n_() {
      return arm.wi;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.wj;
   }

   @Override
   protected arl aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return arm.wo;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return arm.wm;
         }

         if (this.cu <= 5) {
            return arm.wo;
         }
      }

      return arm.wk;
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
   protected void gL() {
      if (this.aZ()) {
         this.a(arm.wn, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bmk eS() {
      return bmk.b;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
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
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bX = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fd() {
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
   public blk a(amz $$0, blk $$1) {
      return blt.aL.a((cti)$$0);
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      return !this.gt() ? bjv.d : super.b($$0, $$1);
   }
}
