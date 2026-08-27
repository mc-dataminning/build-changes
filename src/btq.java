import javax.annotation.Nullable;

public class btq extends btk {
   private final btr bT = new btr(this);
   private static final int bU = 18000;
   private boolean bW;
   private int bX;

   public btq(bfn<? extends btq> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public static bhf.a q() {
      return gy().a(bhg.a, 15.0).a(bhg.d, 0.2F);
   }

   @Override
   protected void a(apf $$0) {
      this.a(bhg.m).a(a($$0::j));
   }

   @Override
   protected void go() {
   }

   @Override
   protected amg s() {
      return this.a(anb.a) ? amh.vv : amh.vr;
   }

   @Override
   protected amg g_() {
      return amh.vs;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.vt;
   }

   @Override
   protected amg aJ() {
      if (this.ay()) {
         if (!this.bN()) {
            return amh.vy;
         }

         this.ct++;
         if (this.ct > 5 && this.ct % 3 == 0) {
            return amh.vw;
         }

         if (this.ct <= 5) {
            return amh.vy;
         }
      }

      return amh.vu;
   }

   @Override
   protected void e(float $$0) {
      if (this.ay()) {
         super.e(0.3F);
      } else {
         super.e(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gF() {
      if (this.aV()) {
         this.a(amh.vx, 0.4F, 1.0F);
      } else {
         super.gF();
      }
   }

   @Override
   public bge eN() {
      return bge.b;
   }

   @Override
   public double bx() {
      return super.bx() - 0.1875;
   }

   @Override
   public void b_() {
      super.b_();
      if (this.r() && this.bX++ >= 18000) {
         this.ai();
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.r());
      $$0.a("SkeletonTrapTime", this.bX);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.bX = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float eY() {
      return 0.96F;
   }

   public boolean r() {
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
   public bfe a(aif $$0, bfe $$1) {
      return bfn.aK.a((cmm)$$0);
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      return !this.gn() ? bdx.d : super.b($$0, $$1);
   }
}
