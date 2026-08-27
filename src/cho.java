public class cho extends cgo {
   private static final int c = 300;
   private static final aja<Boolean> d = aje.a(cho.class, ajc.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bX;

   public cho(bqg<? extends cho> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gq() {
      return this.an().a(d);
   }

   public void w(boolean $$0) {
      this.an.a(d, $$0);
   }

   @Override
   public boolean gp() {
      return this.gq();
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && !this.gd()) {
         if (this.aA) {
            if (this.gq()) {
               this.bX--;
               if (this.bX < 0) {
                  this.gr();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.w(false);
         }
      }

      super.l();
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gq() ? this.bX : -1);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bX = $$0;
      this.w(true);
   }

   protected void gr() {
      this.a(bqg.aX, true);
      if (!this.aU()) {
         this.dM().a(null, 1048, this.dm(), 0);
      }
   }

   @Override
   public boolean dA() {
      return false;
   }

   @Override
   protected aun v() {
      return auo.wF;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.wQ;
   }

   @Override
   protected aun o_() {
      return auo.wH;
   }

   @Override
   aun u() {
      return auo.wS;
   }

   @Override
   protected void a(boy $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgs $$4 && $$4.go()) {
         $$4.gp();
         this.a(crv.uj);
      }
   }
}
