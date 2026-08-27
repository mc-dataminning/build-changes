public class bzj extends byk {
   private static final int c = 300;
   private static final adz<Boolean> d = aec.a(bzj.class, aeb.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public bzj(bim<? extends bzj> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(d, false);
   }

   public boolean ga() {
      return this.al().b(d);
   }

   public void w(boolean $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean fZ() {
      return this.ga();
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && !this.fQ()) {
         if (this.aA) {
            if (this.ga()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gb();
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
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.ga() ? this.bT : -1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gb() {
      this.a(bim.aU, true);
      if (!this.aS()) {
         this.dK().a(null, 1048, this.dk(), 0);
      }
   }

   @Override
   public boolean dy() {
      return false;
   }

   @Override
   protected aov r() {
      return aow.vo;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.vz;
   }

   @Override
   protected aov h_() {
      return aow.vq;
   }

   @Override
   aov q() {
      return aow.vB;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byn $$4 && $$4.ga()) {
         $$4.gb();
         this.a(cjb.tr);
      }
   }
}
