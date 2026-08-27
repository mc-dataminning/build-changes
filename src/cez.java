public class cez extends cea {
   private static final int c = 300;
   private static final aie<Boolean> d = aih.a(cez.class, aig.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public cez(bnw<? extends cez> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
   }

   public boolean gh() {
      return this.an().b(d);
   }

   public void w(boolean $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean gg() {
      return this.gh();
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && !this.fW()) {
         if (this.az) {
            if (this.gh()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gi();
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
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gh() ? this.bT : -1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gi() {
      this.a(bnw.aW, true);
      if (!this.aU()) {
         this.dM().a(null, 1048, this.dm(), 0);
      }
   }

   @Override
   public boolean dA() {
      return false;
   }

   @Override
   protected atk y() {
      return atl.wu;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.wF;
   }

   @Override
   protected atk n_() {
      return atl.ww;
   }

   @Override
   atk w() {
      return atl.wH;
   }

   @Override
   protected void a(bmp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof ced $$4 && $$4.gh()) {
         $$4.gi();
         this.a(cpg.uh);
      }
   }
}
