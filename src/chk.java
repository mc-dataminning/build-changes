import javax.annotation.Nullable;

public class chk extends che {
   private final chl bY = new chl(this);
   private static final int bZ = 18000;
   private static final bss cb = bsv.aO.n().a(bsr.a().a(bsq.a, 0.0F, bsv.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cc;
   private int cd;

   public chk(bsv<? extends chk> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public static bur.a s() {
      return gP().a(bus.q, 15.0).a(bus.r, 0.2F);
   }

   public static boolean c(bsv<? extends cfa> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return !bto.a($$2) ? cfa.b($$0, $$1, $$2, $$3, $$4) : bto.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azc $$0) {
      this.f(bus.m).a(a($$0::j));
   }

   @Override
   protected void gG() {
   }

   @Override
   protected avv v() {
      return this.a(awr.a) ? avw.xf : avw.xb;
   }

   @Override
   protected avv o_() {
      return avw.xc;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.xd;
   }

   @Override
   protected avv aP() {
      if (this.aE()) {
         if (!this.bS()) {
            return avw.xi;
         }

         this.cx++;
         if (this.cx > 5 && this.cx % 3 == 0) {
            return avw.xg;
         }

         if (this.cx <= 5) {
            return avw.xi;
         }
      }

      return avw.xe;
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
         this.a(avw.xh, 0.4F, 1.0F);
      } else {
         super.gW();
      }
   }

   @Override
   public bss e(btw $$0) {
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
   public bsj a(arb $$0, bsj $$1) {
      return bsv.aO.a((dbt)$$0);
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      return !this.gF() ? bqp.e : super.b($$0, $$1);
   }
}
