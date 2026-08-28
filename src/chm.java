import javax.annotation.Nullable;

public class chm extends chg {
   private final chn ca = new chn(this);
   private static final int cb = 18000;
   private static final bst cc = bsw.aO.n().a(bss.a().a(bsr.a, 0.0F, bsw.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean ce;
   private int cf;

   public chm(bsw<? extends chm> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public static but.a s() {
      return gL().a(buu.s, 15.0).a(buu.v, 0.2F);
   }

   public static boolean c(bsw<? extends cfc> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return !btp.a($$2) ? cfc.b($$0, $$1, $$2, $$3, $$4) : btp.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayv $$0) {
      this.f(buu.o).a(a($$0::j));
   }

   @Override
   protected void gC() {
   }

   @Override
   protected avn v() {
      return this.a(awj.a) ? avo.xi : avo.xe;
   }

   @Override
   protected avn n_() {
      return avo.xf;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.xg;
   }

   @Override
   protected avn aQ() {
      if (this.aF()) {
         if (!this.bT()) {
            return avo.xl;
         }

         this.cz++;
         if (this.cz > 5 && this.cz % 3 == 0) {
            return avo.xj;
         }

         if (this.cz <= 5) {
            return avo.xl;
         }
      }

      return avo.xh;
   }

   @Override
   protected void f(float $$0) {
      if (this.aF()) {
         super.f(0.3F);
      } else {
         super.f(Math.min(0.1F, $$0 * 25.0F));
      }
   }

   @Override
   protected void gS() {
      if (this.bf()) {
         this.a(avo.xk, 0.4F, 1.0F);
      } else {
         super.gS();
      }
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cc : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.t() && this.cf++ >= 18000) {
         this.aq();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cf);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cf = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fi() {
      return 0.96F;
   }

   public boolean t() {
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
   public bsk a(aqt $$0, bsk $$1) {
      return bsw.aO.a((dcu)$$0);
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      return !this.gB() ? bqq.e : super.b($$0, $$1);
   }
}
