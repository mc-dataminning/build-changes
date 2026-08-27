public class cfo extends cep {
   private static final int c = 300;
   private static final aii<Boolean> d = ail.a(cfo.class, aik.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bV;

   public cfo(bol<? extends cfo> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
   }

   public boolean gm() {
      return this.an().b(d);
   }

   public void w(boolean $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean gl() {
      return this.gm();
   }

   @Override
   public void l() {
      if (!this.dJ().B && this.bx() && !this.gb()) {
         if (this.az) {
            if (this.gm()) {
               this.bV--;
               if (this.bV < 0) {
                  this.gn();
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
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gm() ? this.bV : -1);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bV = $$0;
      this.w(true);
   }

   protected void gn() {
      this.a(bol.aW, true);
      if (!this.aU()) {
         this.dJ().a(null, 1048, this.dj(), 0);
      }
   }

   @Override
   public boolean dx() {
      return false;
   }

   @Override
   protected ato y() {
      return atp.wu;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.wF;
   }

   @Override
   protected ato n_() {
      return atp.ww;
   }

   @Override
   ato w() {
      return atp.wH;
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ces $$4 && $$4.gm()) {
         $$4.gn();
         this.a(cpt.uh);
      }
   }
}
