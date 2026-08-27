public class civ extends chv {
   private static final int c = 300;
   private static final ajm<Boolean> d = ajq.a(civ.class, ajo.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public civ(brn<? extends civ> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajq.a $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gs() ? this.bY : -1);
   }

   @Override
   public void a(ua $$0) {
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
      this.a(brn.aX, true);
      if (!this.aU()) {
         this.dN().a(null, 1048, this.dn(), 0);
      }
   }

   @Override
   public boolean dB() {
      return false;
   }

   @Override
   protected avb v() {
      return avc.wN;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.wY;
   }

   @Override
   protected avb o_() {
      return avc.wP;
   }

   @Override
   avb u() {
      return avc.xa;
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof chz $$4 && $$4.gq()) {
         $$4.gr();
         this.a(ctc.ul);
      }
   }
}
