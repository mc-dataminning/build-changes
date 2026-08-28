public class cll extends ckl {
   private static final int c = 300;
   private static final akh<Boolean> d = akl.a(cll.class, akj.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public cll(bty<? extends cll> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gr() {
      return this.at().a(d);
   }

   public void x(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean gq() {
      return this.gr();
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && !this.gd()) {
         if (this.aw) {
            if (this.gr()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gs();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.x(false);
         }
      }

      super.l();
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gr() ? this.bY : -1);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bY = $$0;
      this.x(true);
   }

   protected void gs() {
      this.a(bty.aY, true);
      if (!this.ba()) {
         this.dS().a(null, 1048, this.ds(), 0);
      }
   }

   @Override
   public boolean dG() {
      return false;
   }

   @Override
   protected awf w() {
      return awg.xc;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.xn;
   }

   @Override
   protected awf o_() {
      return awg.xe;
   }

   @Override
   awf t() {
      return awg.xp;
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckp $$4 && $$4.gq()) {
         $$4.gr();
         this.a(cvw.un);
      }
   }
}
