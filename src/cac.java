import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cac extends bzw {
   private final cad bT = new cad(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public cac(bly<? extends cac> $$0, cto $$1) {
      super($$0, $$1);
   }

   public static bnp.a u() {
      return gE().a(bnq.l, 15.0).a(bnq.m, 0.2F);
   }

   public static boolean c(bly<? extends bxx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return !bmo.a($$2) ? bxx.b($$0, $$1, $$2, $$3, $$4) : bmo.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auu $$0) {
      this.a(bnq.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected arq y() {
      return this.a(asl.a) ? arr.wl : arr.wh;
   }

   @Override
   protected arq n_() {
      return arr.wi;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.wj;
   }

   @Override
   protected arq aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return arr.wo;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return arr.wm;
         }

         if (this.cu <= 5) {
            return arr.wo;
         }
      }

      return arr.wk;
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
         this.a(arr.wn, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bmp eS() {
      return bmp.b;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
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
   public blp a(and $$0, blp $$1) {
      return bly.aL.a((cto)$$0);
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      return !this.gt() ? bka.d : super.b($$0, $$1);
   }
}
