public class cjv extends civ {
   private static final int c = 300;
   private static final ajp<Boolean> d = ajt.a(cjv.class, ajr.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int ca;

   public cjv(bsj<? extends cjv> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gq() {
      return this.ap().a(d);
   }

   public void w(boolean $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean gp() {
      return this.gq();
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && !this.gc()) {
         if (this.aB) {
            if (this.gq()) {
               this.ca--;
               if (this.ca < 0) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gq() ? this.ca : -1);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.ca = $$0;
      this.w(true);
   }

   protected void gr() {
      this.a(bsj.aY, true);
      if (!this.aW()) {
         this.dP().a(null, 1048, this.dp(), 0);
      }
   }

   @Override
   public boolean dD() {
      return false;
   }

   @Override
   protected ave v() {
      return avf.xb;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.xm;
   }

   @Override
   protected ave o_() {
      return avf.xd;
   }

   @Override
   ave u() {
      return avf.xo;
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof ciz $$3 && $$3.go()) {
         $$3.gp();
         this.a(cud.ul);
      }
   }
}
