public class ccx extends cby {
   private static final int c = 300;
   private static final agm<Boolean> d = agp.a(ccx.class, ago.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public ccx(blz<? extends ccx> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
   }

   public boolean gf() {
      return this.an().b(d);
   }

   public void w(boolean $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean ge() {
      return this.gf();
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && !this.fU()) {
         if (this.aA) {
            if (this.gf()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gg();
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gf() ? this.bT : -1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gg() {
      this.a(blz.aV, true);
      if (!this.aU()) {
         this.dM().a(null, 1048, this.dm(), 0);
      }
   }

   @Override
   public boolean dA() {
      return false;
   }

   @Override
   protected arr y() {
      return ars.we;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.wp;
   }

   @Override
   protected arr n_() {
      return ars.wg;
   }

   @Override
   arr w() {
      return ars.wr;
   }

   @Override
   protected void a(bkt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ccb $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cnb.ue);
      }
   }
}
