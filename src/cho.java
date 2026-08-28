import javax.annotation.Nullable;

public class cho extends chi {
   private final chp cc = new chp(this);
   private static final int cd = 18000;
   private static final bsu ce = bsx.aO.n().a(bst.a().a(bss.a, 0.0F, bsx.aO.m() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cg;
   private int ch;

   public cho(bsx<? extends cho> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public static buv.a s() {
      return gK().a(buw.s, 15.0).a(buw.v, 0.2F);
   }

   public static boolean c(bsx<? extends cfe> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return !btr.a($$2) ? cfe.b($$0, $$1, $$2, $$3, $$4) : btr.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayw $$0) {
      this.f(buw.o).a(a($$0::j));
   }

   @Override
   protected void gA() {
   }

   @Override
   protected avo v() {
      return this.a(awk.a) ? avp.xi : avp.xe;
   }

   @Override
   protected avo n_() {
      return avp.xf;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.xg;
   }

   @Override
   protected avo aQ() {
      if (this.aF()) {
         if (!this.bT()) {
            return avp.xl;
         }

         this.cB++;
         if (this.cB > 5 && this.cB % 3 == 0) {
            return avp.xj;
         }

         if (this.cB <= 5) {
            return avp.xl;
         }
      }

      return avp.xh;
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
   protected void gR() {
      if (this.bf()) {
         this.a(avp.xk, 0.4F, 1.0F);
      } else {
         super.gR();
      }
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? ce : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.t() && this.ch++ >= 18000) {
         this.aq();
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.ch);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("SkeletonTrap"));
      this.ch = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fh() {
      return 0.96F;
   }

   public boolean t() {
      return this.cg;
   }

   public void x(boolean $$0) {
      if ($$0 != this.cg) {
         this.cg = $$0;
         if ($$0) {
            this.bW.a(1, this.cc);
         } else {
            this.bW.a(this.cc);
         }
      }
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return bsx.aO.a((dcw)$$0);
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      return !this.gz() ? bqr.e : super.b($$0, $$1);
   }
}
