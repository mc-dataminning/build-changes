public class cld extends ckd {
   private static final int c = 300;
   private static final akg<Boolean> d = akk.a(cld.class, aki.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bZ;

   public cld(btq<? extends cld> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gr() {
      return this.at().a(d);
   }

   public void x(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean gq() {
      return this.gr();
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && !this.gd()) {
         if (this.aw) {
            if (this.gr()) {
               this.bZ--;
               if (this.bZ < 0) {
                  this.gs();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.x(false);
         }
      }

      super.l();
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gr() ? this.bZ : -1);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bZ = $$0;
      this.x(true);
   }

   protected void gs() {
      this.a(btq.aY, true);
      if (!this.ba()) {
         this.dS().a(null, 1048, this.ds(), 0);
      }
   }

   @Override
   public boolean dG() {
      return false;
   }

   @Override
   protected awc w() {
      return awd.xc;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.xn;
   }

   @Override
   protected awc n_() {
      return awd.xe;
   }

   @Override
   awc t() {
      return awd.xp;
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckh $$4 && $$4.gq()) {
         $$4.gr();
         this.a(cvo.un);
      }
   }
}
