import com.google.common.annotations.VisibleForTesting;

public class cna extends cma {
   private static final int b = 300;
   private static final ajx<Boolean> c = akb.a(cna.class, ajz.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bF;

   public cna(bvi<? extends cna> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gs() {
      return this.au().a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean x() {
      return this.gs();
   }

   @Override
   public void h() {
      if (!this.dU().C && this.bJ() && !this.gh()) {
         if (this.av) {
            if (this.gs()) {
               this.bF--;
               if (this.bF < 0) {
                  this.gt();
               }
            } else {
               this.d++;
               if (this.d >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.d = -1;
            this.w(false);
         }
      }

      super.h();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gs() ? this.bF : -1);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bF = $$0;
      this.w(true);
   }

   protected void gt() {
      this.a(bvi.br, buu.a(this, true, true), $$0 -> {
         if (!this.bb()) {
            this.dU().a(null, 1048, this.du(), 0);
         }
      });
   }

   @Override
   public boolean dI() {
      return false;
   }

   @Override
   protected avz u() {
      return awa.xL;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.xW;
   }

   @Override
   protected avz l_() {
      return awa.xN;
   }

   @Override
   avz m() {
      return awa.xY;
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.x()) {
         $$4.gs();
         this.a($$0, cxl.vm);
      }
   }
}
