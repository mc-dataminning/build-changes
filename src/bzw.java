public class bzw extends byx {
   private static final int c = 300;
   private static final aef<Boolean> d = aei.a(bzw.class, aeh.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public bzw(bja<? extends bzw> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
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
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gf() ? this.bT : -1);
   }

   @Override
   public void a(qw $$0) {
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
      this.a(bja.aU, true);
      if (!this.aS()) {
         this.dL().a(null, 1048, this.dl(), 0);
      }
   }

   @Override
   public boolean dz() {
      return false;
   }

   @Override
   protected apf w() {
      return apg.vo;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.vz;
   }

   @Override
   protected apf l_() {
      return apg.vq;
   }

   @Override
   apf t() {
      return apg.vB;
   }

   @Override
   protected void a(bhu $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bza $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cjo.tr);
      }
   }
}
