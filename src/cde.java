public class cde extends ccf {
   private static final int c = 300;
   private static final agn<Boolean> d = agq.a(cde.class, agp.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bU;

   public cde(bmc<? extends cde> $$0, ctx $$1) {
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
      if (!this.dL().B && this.bx() && !this.fV()) {
         if (this.aA) {
            if (this.gg()) {
               this.bU--;
               if (this.bU < 0) {
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
   public void b(so $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gg() ? this.bU : -1);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bU = $$0;
      this.w(true);
   }

   protected void gh() {
      this.a(bmc.aW, true);
      if (!this.aU()) {
         this.dL().a(null, 1048, this.dl(), 0);
      }
   }

   @Override
   public boolean dz() {
      return false;
   }

   @Override
   protected ars y() {
      return art.wt;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.wE;
   }

   @Override
   protected ars n_() {
      return art.wv;
   }

   @Override
   ars w() {
      return art.wG;
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cci $$4 && $$4.gg()) {
         $$4.gh();
         this.a(cnj.uh);
      }
   }
}
