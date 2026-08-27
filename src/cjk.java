public class cjk extends cik {
   private static final int c = 300;
   private static final ajr<Boolean> d = ajv.a(cjk.class, ajt.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public cjk(bsa<? extends cjk> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gs() {
      return this.ap().a(d);
   }

   public void w(boolean $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean gr() {
      return this.gs();
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && !this.gf()) {
         if (this.aB) {
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
            this.w(false);
         }
      }

      super.l();
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gs() ? this.bY : -1);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bY = $$0;
      this.w(true);
   }

   protected void gt() {
      this.a(bsa.aY, true);
      if (!this.aW()) {
         this.dP().a(null, 1048, this.dp(), 0);
      }
   }

   @Override
   public boolean dD() {
      return false;
   }

   @Override
   protected avg v() {
      return avh.wY;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.xj;
   }

   @Override
   protected avg o_() {
      return avh.xa;
   }

   @Override
   avg u() {
      return avh.xl;
   }

   @Override
   protected void a(bqn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gq()) {
         $$4.gr();
         this.a(ctr.ul);
      }
   }
}
