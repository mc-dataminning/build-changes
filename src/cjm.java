public class cjm extends cik {
   private static final int c = 300;
   private static final ajy<Boolean> d = akc.a(cjm.class, aka.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int ch;

   public cjm(bsb<? extends cjm> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gB() {
      return this.ap().a(d);
   }

   public void w(boolean $$0) {
      this.as.a(d, $$0);
   }

   @Override
   public boolean gA() {
      return this.gB();
   }

   @Override
   public void l() {
      if (!this.dU().C && this.bI() && !this.go()) {
         if (this.aF) {
            if (this.gB()) {
               this.ch--;
               if (this.ch < 0) {
                  this.gC();
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
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gB() ? this.ch : -1);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.ch = $$0;
      this.w(true);
   }

   protected void gC() {
      this.a(bsb.bb, true);
      if (!this.ba()) {
         this.dU().a(null, 1048, this.du(), 0);
      }
   }

   @Override
   public boolean dI() {
      return false;
   }

   @Override
   protected avn u() {
      return avo.xw;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.xH;
   }

   @Override
   protected avn n_() {
      return avo.xy;
   }

   @Override
   avn t() {
      return avo.xJ;
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gz()) {
         $$4.gA();
         this.a(cuk.vW);
      }
   }
}
