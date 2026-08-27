public class cbv extends caw {
   private static final int c = 300;
   private static final afs<Boolean> d = afv.a(cbv.class, afu.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public cbv(bkz<? extends cbv> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
   }

   public boolean gg() {
      return this.an().b(d);
   }

   public void w(boolean $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean gf() {
      return this.gg();
   }

   @Override
   public void l() {
      if (!this.dN().B && this.bx() && !this.fV()) {
         if (this.aA) {
            if (this.gg()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gh();
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
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gg() ? this.bT : -1);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gh() {
      this.a(bkz.aU, true);
      if (!this.aU()) {
         this.dN().a(null, 1048, this.dn(), 0);
      }
   }

   @Override
   public boolean dB() {
      return false;
   }

   @Override
   protected aqu y() {
      return aqv.vJ;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.vU;
   }

   @Override
   protected aqu n_() {
      return aqv.vL;
   }

   @Override
   aqu w() {
      return aqv.vW;
   }

   @Override
   protected void a(bjt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof caz $$4 && $$4.gg()) {
         $$4.gh();
         this.a(clr.ud);
      }
   }
}
