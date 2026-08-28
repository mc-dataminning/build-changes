import javax.annotation.Nullable;

public class cho extends chi {
   private final chp bY = new chp(this);
   private static final int bZ = 18000;
   private static final bsw cb = bsz.aO.n().a(bsv.a().a(bsu.a, 0.0F, bsz.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public cho(bsz<? extends cho> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public static buv.a s() {
      return gP().a(buw.q, 15.0).a(buw.r, 0.2F);
   }

   public static boolean c(bsz<? extends cfe> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return !bts.a($$2) ? cfe.b($$0, $$1, $$2, $$3, $$4) : bts.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azg $$0) {
      this.f(buw.m).a(a($$0::j));
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
   protected avy d(brm $$0) {
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
   public bsw e(bua $$0) {
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
   public bsn a(are $$0, bsn $$1) {
      return bsz.aO.a((dbx)$$0);
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      return !this.gF() ? bqt.e : super.b($$0, $$1);
   }
}
