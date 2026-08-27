import javax.annotation.Nullable;

public class cgo extends cgi {
   private final cgp ch = new cgp(this);
   private static final int ci = 18000;
   private static final bry ck = bsb.aQ.n().a(brx.a().a(brw.a, 0.0F, bsb.aQ.l() - 0.03125F, 0.0F)).a(0.5F);
   private boolean cl;
   private int cm;

   public cgo(bsb<? extends cgo> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static btu.a r() {
      return gX().a(btv.q, 15.0).a(btv.r, 0.2F);
   }

   public static boolean c(bsb<? extends cee> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return !bss.a($$2) ? cee.b($$0, $$1, $$2, $$3, $$4) : bss.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(ayt $$0) {
      this.f(btv.m).a(a($$0::j));
   }

   @Override
   protected void gO() {
   }

   @Override
   protected avn u() {
      return this.a(awj.a) ? avo.xD : avo.xz;
   }

   @Override
   protected avn n_() {
      return avo.xA;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.xB;
   }

   @Override
   protected avn aT() {
      if (this.aE()) {
         if (!this.bX()) {
            return avo.xG;
         }

         this.cG++;
         if (this.cG > 5 && this.cG % 3 == 0) {
            return avo.xE;
         }

         if (this.cG <= 5) {
            return avo.xG;
         }
      }

      return avo.xC;
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
   protected void he() {
      if (this.bi()) {
         this.a(avo.xF, 0.4F, 1.0F);
      } else {
         super.he();
      }
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.t() && this.cm++ >= 18000) {
         this.ao();
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("SkeletonTrap", this.t());
      $$0.a("SkeletonTrapTime", this.cm);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("SkeletonTrap"));
      this.cm = $$0.h("SkeletonTrapTime");
   }

   @Override
   protected float fu() {
      return 0.96F;
   }

   public boolean t() {
      return this.cl;
   }

   public void w(boolean $$0) {
      if ($$0 != this.cl) {
         this.cl = $$0;
         if ($$0) {
            this.cb.a(1, this.ch);
         } else {
            this.cb.a(this.ch);
         }
      }
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return bsb.aQ.a((dca)$$0);
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      return !this.gN() ? bqa.d : super.b($$0, $$1);
   }
}
