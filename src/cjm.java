public class cjm extends cim {
   private static final int c = 300;
   private static final ajs<Boolean> d = ajw.a(cjm.class, aju.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public cjm(bsc<? extends cjm> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajw.a $$0) {
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
      this.a(bsc.aY, true);
      if (!this.aW()) {
         this.dP().a(null, 1048, this.dp(), 0);
      }
   }

   @Override
   public boolean dD() {
      return false;
   }

   @Override
   protected avh v() {
      return avi.wY;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.xj;
   }

   @Override
   protected avh o_() {
      return avi.xa;
   }

   @Override
   avh u() {
      return avi.xl;
   }

   @Override
   protected void a(bqp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ciq $$4 && $$4.gq()) {
         $$4.gr();
         this.a(ctt.ul);
      }
   }
}
