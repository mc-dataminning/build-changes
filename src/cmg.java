import com.google.common.annotations.VisibleForTesting;

public class cmg extends clg {
   private static final int b = 300;
   private static final akm<Boolean> c = akq.a(cmg.class, ako.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bY;

   public cmg(bus<? extends cmg> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gp() {
      return this.au().a(c);
   }

   public void x(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean go() {
      return this.gp();
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && !this.fZ()) {
         if (this.av) {
            if (this.gp()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gq();
               }
            } else {
               this.d++;
               if (this.d >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.d = -1;
            this.x(false);
         }
      }

      super.h();
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gp() ? this.bY : -1);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bY = $$0;
      this.x(true);
   }

   protected void gq() {
      this.a(bus.bo, bug.a(this, true, true), $$0 -> {
         if (!this.bb()) {
            this.dV().a(null, 1048, this.dv(), 0);
         }
      });
   }

   @Override
   public boolean dJ() {
      return false;
   }

   @Override
   protected awm t() {
      return awn.xa;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.xl;
   }

   @Override
   protected awm n_() {
      return awn.xc;
   }

   @Override
   awm q() {
      return awn.xn;
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clk $$4 && $$4.go()) {
         $$4.gp();
         this.a($$0, cwq.uD);
      }
   }
}
