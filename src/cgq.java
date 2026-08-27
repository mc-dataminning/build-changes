import javax.annotation.Nullable;

public class cgq extends cgk {
   private final cgr bY = new cgr(this);
   private static final int bZ = 18000;
   private static final brz cb = bsc.aO.n().a(bry.a().a(brx.a, 0.0F, bsc.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cgq(bsc<? extends cgq> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static btx.a s() {
      return gO().a(bty.q, 15.0).a(bty.r, 0.2F);
   }

   public static boolean c(bsc<? extends ceg> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return !bsu.a($$2) ? ceg.b($$0, $$1, $$2, $$3, $$4) : bsu.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bty.m).a(a($$0::j));
   }

   @Override
   protected void gF() {
   }

   @Override
   protected avh v() {
      return this.a(awc.a) ? avi.xf : avi.xb;
   }

   @Override
   protected avh o_() {
      return avi.xc;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.xd;
   }

   @Override
   protected avh aP() {
      if (this.aE()) {
         if (!this.bS()) {
            return avi.xi;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return avi.xg;
         }

         if (this.cx <= 5) {
            return avi.xi;
         }
      }

      return avi.xe;
   }

   @Override
   protected void e(float $$0) {
      if (this.aE()) {
         super.e(0.3F);
      } else {
         super.e(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gV() {
      if (this.be()) {
         this.a(avi.xh, 0.4F, 1.0F);
      } else {
         super.gV();
      }
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? cb : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.u() && this.cd++ >= 18000) {
         this.ao();
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cd = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fl() {
      return 0.96F;
   }

   public boolean u() {
      return this.cc;
   }

   public void w(boolean $$0) {
      if ($$0 != this.cc) {
         this.cc = $$0;
         if ($$0) {
            this.bS.a(1, this.bY);
         } else {
            this.bS.a(this.bY);
         }
      }
   }

   @Nullable
   @Override
   public brq a(aqn $$0, brq $$1) {
      return bsc.aO.a((daz)$$0);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      return !this.gE() ? bpw.d : super.b($$0, $$1);
   }
}
