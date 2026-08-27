import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cad extends bzx {
   private final cae bT = new cae(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public cad(blz<? extends cad> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static bnq.a u() {
      return gE().a(bnr.l, 15.0).a(bnr.m, 0.2F);
   }

   public static boolean c(blz<? extends bxy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return !bmp.a($$2) ? bxy.b($$0, $$1, $$2, $$3, $$4) : bmp.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auv $$0) {
      this.a(bnr.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected arr y() {
      return this.a(asm.a) ? ars.wl : ars.wh;
   }

   @Override
   protected arr n_() {
      return ars.wi;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.wj;
   }

   @Override
   protected arr aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return ars.wo;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return ars.wm;
         }

         if (this.cu <= 5) {
            return ars.wo;
         }
      }

      return ars.wk;
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
         this.a(ars.wn, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bmq eS() {
      return bmq.b;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(sn $$0) {
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
   public blq a(and $$0, blq $$1) {
      return blz.aL.a((ctp)$$0);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      return !this.gt() ? bkb.d : super.b($$0, $$1);
   }
}
