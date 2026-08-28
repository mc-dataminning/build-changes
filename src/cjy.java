public class cjy extends ciy {
   private static final int c = 300;
   private static final ajp<Boolean> d = ajt.a(cjy.class, ajr.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int ca;

   public cjy(bsm<? extends cjy> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gr() {
      return this.aq().a(d);
   }

   public void w(boolean $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean gq() {
      return this.gr();
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && !this.gd()) {
         if (this.aB) {
            if (this.gr()) {
               this.ca--;
               if (this.ca < 0) {
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
            this.w(false);
         }
      }

      super.l();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gr() ? this.ca : -1);
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

   protected void gs() {
      this.a(bsm.aY, true);
      if (!this.aX()) {
         this.dQ().a(null, 1048, this.dq(), 0);
      }
   }

   @Override
   public boolean dE() {
      return false;
   }

   @Override
   protected avg v() {
      return avh.xb;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.xm;
   }

   @Override
   protected avg o_() {
      return avh.xd;
   }

   @Override
   avg u() {
      return avh.xo;
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof cjc $$3 && $$3.gp()) {
         $$3.gq();
         this.a(cuf.ul);
      }
   }
}
