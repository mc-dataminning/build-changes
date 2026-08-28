public class cli extends cki {
   private static final int c = 300;
   private static final akg<Boolean> d = akk.a(cli.class, aki.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public cli(btv<? extends cli> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gs() {
      return this.at().a(d);
   }

   public void x(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean gr() {
      return this.gs();
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && !this.ge()) {
         if (this.aw) {
            if (this.gs()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gt();
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
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gs() ? this.bY : -1);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bY = $$0;
      this.x(true);
   }

   protected void gt() {
      this.a(btv.aY, true);
      if (!this.ba()) {
         this.dS().a(null, 1048, this.ds(), 0);
      }
   }

   @Override
   public boolean dG() {
      return false;
   }

   @Override
   protected awd w() {
      return awe.xc;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.xn;
   }

   @Override
   protected awd n_() {
      return awe.xe;
   }

   @Override
   awd t() {
      return awe.xp;
   }

   @Override
   protected void a(arh $$0, bsg $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckm $$4 && $$4.gr()) {
         $$4.gs();
         this.a(cvt.un);
      }
   }
}
