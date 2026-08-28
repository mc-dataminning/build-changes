import javax.annotation.Nullable;

public class chn extends chh {
   private final cho bY = new cho(this);
   private static final int bZ = 18000;
   private static final bsv cb = bsy.aO.n().a(bsu.a().a(bst.a, 0.0F, bsy.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public chn(bsy<? extends chn> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public static buu.a s() {
      return gP().a(buv.q, 15.0).a(buv.r, 0.2F);
   }

   public static boolean c(bsy<? extends cfd> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return !btr.a($$2) ? cfd.b($$0, $$1, $$2, $$3, $$4) : btr.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azf $$0) {
      this.f(buv.m).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected avy v() {
      return this.a(awu.a) ? avz.xf : avz.xb;
   }

   @Override
   protected avy o_() {
      return avz.xc;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.xd;
   }

   @Override
   protected avy aP() {
      if (this.aE()) {
         if (!this.bS()) {
            return avz.xi;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return avz.xg;
         }

         if (this.cx <= 5) {
            return avz.xi;
         }
      }

      return avz.xe;
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
         this.a(avz.xh, 0.4F, 1.0F);
      } else {
         super.gW();
      }
   }

   @Override
   public bsv e(btz $$0) {
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
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cd);
   }

   @Override
   public void a(ur $$0) {
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
   public bsm a(are $$0, bsm $$1) {
      return bsy.aO.a((dbw)$$0);
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      return !this.gF() ? bqs.e : super.b($$0, $$1);
   }
}
