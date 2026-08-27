import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzn extends bzh {
   private final bzo bT = new bzo(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public bzn(blj<? extends bzn> $$0, csy $$1) {
      super($$0, $$1);
   }

   public static bna.a u() {
      return gE().a(bnb.l, 15.0).a(bnb.m, 0.2F);
   }

   public static boolean c(blj<? extends bxi> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return !blz.a($$2) ? bxi.b($$0, $$1, $$2, $$3, $$4) : blz.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(auf $$0) {
      this.a(bnb.h).a(a($$0::j));
   }

   @Override
   protected void gu() {
   }

   @Override
   protected arb y() {
      return this.a(arw.a) ? arc.wl : arc.wh;
   }

   @Override
   protected arb n_() {
      return arc.wi;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.wj;
   }

   @Override
   protected arb aN() {
      if (this.aC()) {
         if (!this.bP()) {
            return arc.wo;
         }

         this.cu++;
         if (this.cu > 5 && this.cu % 3 == 0) {
            return arc.wm;
         }

         if (this.cu <= 5) {
            return arc.wo;
         }
      }

      return arc.wk;
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
         this.a(arc.wn, 0.4F, 1.0F);
      } else {
         super.gL();
      }
   }

   @Override
   public bma eS() {
      return bma.b;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
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
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.w());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(sj $$0) {
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
   public bla a(amp $$0, bla $$1) {
      return blj.aL.a((csy)$$0);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      return !this.gt() ? bjl.d : super.b($$0, $$1);
   }
}
