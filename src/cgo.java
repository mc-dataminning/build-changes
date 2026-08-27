import javax.annotation.Nullable;

public class cgo extends cgi {
   private final cgp bY = new cgp(this);
   private static final int bZ = 18000;
   private static final brx cb = bsa.aO.n().a(brw.a().a(brv.a, 0.0F, bsa.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cgo(bsa<? extends cgo> $$0, dax $$1) {
      super($$0, $$1);
   }

   public static btv.a s() {
      return gO().a(btw.q, 15.0).a(btw.r, 0.2F);
   }

   public static boolean c(bsa<? extends cee> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return !bss.a($$2) ? cee.b($$0, $$1, $$2, $$3, $$4) : bss.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayk $$0) {
      this.f(btw.m).a(a($$0::j));
   }

   @Override
   protected void gF() {
   }

   @Override
   protected avg v() {
      return this.a(awb.a) ? avh.xf : avh.xb;
   }

   @Override
   protected avg o_() {
      return avh.xc;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.xd;
   }

   @Override
   protected avg aP() {
      if (this.aE()) {
         if (!this.bS()) {
            return avh.xi;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return avh.xg;
         }

         if (this.cx <= 5) {
            return avh.xi;
         }
      }

      return avh.xe;
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
         this.a(avh.xh, 0.4F, 1.0F);
      } else {
         super.gV();
      }
   }

   @Override
   public brx e(bta $$0) {
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
   public bro a(aqm $$0, bro $$1) {
      return bsa.aO.a((dax)$$0);
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      return !this.gE() ? bpu.d : super.b($$0, $$1);
   }
}
