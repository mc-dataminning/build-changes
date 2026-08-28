public class ckj extends cjj {
   private static final int c = 300;
   private static final ajv<Boolean> d = ajz.a(ckj.class, ajx.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int ca;

   public ckj(bsw<? extends ckj> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gp() {
      return this.ar().a(d);
   }

   public void w(boolean $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean go() {
      return this.gp();
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && !this.gb()) {
         if (this.az) {
            if (this.gp()) {
               this.ca--;
               if (this.ca < 0) {
                  this.gq();
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
      $$0.a("StrayConversionTime", this.gp() ? this.ca : -1);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.ca = $$0;
      this.w(true);
   }

   protected void gq() {
      this.a(bsw.aY, true);
      if (!this.aX()) {
         this.dQ().a(null, 1048, this.dq(), 0);
      }
   }

   @Override
   public boolean dE() {
      return false;
   }

   @Override
   protected avn v() {
      return avo.xb;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.xm;
   }

   @Override
   protected avn n_() {
      return avo.xd;
   }

   @Override
   avn t() {
      return avo.xo;
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjn $$4 && $$4.gn()) {
         $$4.go();
         this.a(cur.ul);
      }
   }
}
