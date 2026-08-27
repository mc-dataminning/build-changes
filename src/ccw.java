public class ccw extends cbx {
   private static final int c = 300;
   private static final agm<Boolean> d = agp.a(ccw.class, ago.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public ccw(bly<? extends ccw> $$0, cto $$1) {
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
      this.a(bly.aV, true);
      if (!this.aU()) {
         this.dM().a(null, 1048, this.dm(), 0);
      }
   }

   @Override
   public boolean dA() {
      return false;
   }

   @Override
   protected arq y() {
      return arr.we;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.wp;
   }

   @Override
   protected arq n_() {
      return arr.wg;
   }

   @Override
   arq w() {
      return arr.wr;
   }

   @Override
   protected void a(bks $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cca $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cna.ue);
      }
   }
}
