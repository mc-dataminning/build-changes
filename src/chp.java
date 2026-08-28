import javax.annotation.Nullable;

public class chp extends chj {
   private final chq bY = new chq(this);
   private static final int bZ = 18000;
   private static final bsx cb = bta.aO.n().a(bsw.a().a(bsv.a, 0.0F, bta.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public chp(bta<? extends chp> $$0, dby $$1) {
      super($$0, $$1);
   }

   public static buw.a s() {
      return gP().a(bux.q, 15.0).a(bux.r, 0.2F);
   }

   public static boolean c(bta<? extends cff> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return !btt.a($$2) ? cff.b($$0, $$1, $$2, $$3, $$4) : btt.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azh $$0) {
      this.f(bux.m).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected avz v() {
      return this.a(awv.a) ? awa.xf : awa.xb;
   }

   @Override
   protected avz o_() {
      return awa.xc;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.xd;
   }

   @Override
   protected avz aP() {
      if (this.aE()) {
         if (!this.bS()) {
            return awa.xi;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return awa.xg;
         }

         if (this.cx <= 5) {
            return awa.xi;
         }
      }

      return awa.xe;
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
   protected void gW() {
      if (this.be()) {
         this.a(awa.xh, 0.4F, 1.0F);
      } else {
         super.gW();
      }
   }

   @Override
   public bsx e(bub $$0) {
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
   public void b(us $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(us $$0) {
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
   public bso a(arf $$0, bso $$1) {
      return bta.aO.a((dby)$$0);
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      return !this.gF() ? bqu.e : super.b($$0, $$1);
   }
}
