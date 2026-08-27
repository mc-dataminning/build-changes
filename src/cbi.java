public class cbi extends caj {
   private static final int c = 300;
   private static final afm<Boolean> d = afp.a(cbi.class, afo.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public cbi(bkm<? extends cbi> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      super.b_();
      this.al().a(d, false);
   }

   public boolean gf() {
      return this.al().b(d);
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
      if (!this.dL().B && this.bv() && !this.fU()) {
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gf() ? this.bT : -1);
   }

   @Override
   public void a(rz $$0) {
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
      this.a(bkm.aU, true);
      if (!this.aS()) {
         this.dL().a(null, 1048, this.dl(), 0);
      }
   }

   @Override
   public boolean dz() {
      return false;
   }

   @Override
   protected aqm w() {
      return aqn.vs;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.vD;
   }

   @Override
   protected aqm m_() {
      return aqn.vu;
   }

   @Override
   aqm t() {
      return aqn.vF;
   }

   @Override
   protected void a(bjg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cam $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cle.ts);
      }
   }
}
