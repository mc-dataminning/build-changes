public class chz extends cgz {
   private static final int c = 300;
   private static final ajk<Boolean> d = ajo.a(chz.class, ajm.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public chz(bqr<? extends chz> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gs() {
      return this.an().a(d);
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
      if (!this.dN().B && this.bB() && !this.gf()) {
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
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gs() ? this.bY : -1);
   }

   @Override
   public void a(ty $$0) {
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
      this.a(bqr.aX, true);
      if (!this.aU()) {
         this.dN().a(null, 1048, this.dn(), 0);
      }
   }

   @Override
   public boolean dB() {
      return false;
   }

   @Override
   protected auy v() {
      return auz.wM;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.wX;
   }

   @Override
   protected auy o_() {
      return auz.wO;
   }

   @Override
   auy u() {
      return auz.wZ;
   }

   @Override
   protected void a(bpj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chd $$4 && $$4.gq()) {
         $$4.gr();
         this.a(csg.ul);
      }
   }
}
