import javax.annotation.Nullable;

public class cgy extends cgs {
   private final cgz ca = new cgz(this);
   private static final int cb = 18000;
   private static final bsg cd = bsj.aO.n().a(bsf.a().a(bse.a, 0.0F, bsj.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean ce;
   private int cf;

   public cgy(bsj<? extends cgy> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public static buf.a s() {
      return gM().a(bug.s, 15.0).a(bug.v, 0.2F);
   }

   public static boolean c(bsj<? extends ceo> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return !btc.a($$2) ? ceo.b($$0, $$1, $$2, $$3, $$4) : btc.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bug.o).a(a($$0::j));
   }

   @Override
   protected void gD() {
   }

   @Override
   protected ave v() {
      return this.a(awa.a) ? avf.xi : avf.xe;
   }

   @Override
   protected ave o_() {
      return avf.xf;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.xg;
   }

   @Override
   protected ave aP() {
      if (this.aE()) {
         if (!this.bS()) {
            return avf.xl;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return avf.xj;
         }

         if (this.cz <= 5) {
            return avf.xl;
         }
      }

      return avf.xh;
   }

   @Override
   protected void f(float $$0) {
      if (this.aE()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gT() {
      if (this.be()) {
         this.a(avf.xk, 0.4F, 1.0F);
      } else {
         super.gT();
      }
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.u() && this.cf++ >= 18000) {
         this.ao();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.u());
      $$0.a("SkeletonTrapTime", this.cf);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cf = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fh() {
      return 0.96F;
   }

   public boolean u() {
      return this.ce;
   }

   public void w(boolean $$0) {
      if ($$0 != this.ce) {
         this.ce = $$0;
         if ($$0) {
            this.bU.a(1, this.ca);
         } else {
            this.bU.a(this.ca);
         }
      }
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return bsj.aO.a((dcd)$$0);
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      return !this.gC() ? bqd.e : super.b($$0, $$1);
   }
}
