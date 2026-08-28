public class cjz extends ciz {
   private static final int c = 300;
   private static final ajp<Boolean> d = ajt.a(cjz.class, ajr.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int ca;

   public cjz(bsn<? extends cjz> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gq() {
      return this.ar().a(d);
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
      if (!this.dR().B && this.bF() && !this.gc()) {
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
      this.a(bsn.aY, true);
      if (!this.aY()) {
         this.dR().a(null, 1048, this.dr(), 0);
      }
   }

   @Override
   public boolean dF() {
      return false;
   }

   @Override
   protected avg v() {
      return avh.xb;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.xm;
   }

   @Override
   protected avg n_() {
      return avh.xd;
   }

   @Override
   avg t() {
      return avh.xo;
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjd $$4 && $$4.go()) {
         $$4.gp();
         this.a(cug.ul);
      }
   }
}
