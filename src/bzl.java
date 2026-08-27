public class bzl extends bym {
   private static final int c = 300;
   private static final aec<Boolean> d = aef.a(bzl.class, aee.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public bzl(bip<? extends bzl> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(d, false);
   }

   public boolean gb() {
      return this.al().b(d);
   }

   public void w(boolean $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean ga() {
      return this.gb();
   }

   @Override
   public void l() {
      if (!this.dK().B && this.bv() && !this.fQ()) {
         if (this.aA) {
            if (this.gb()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gc();
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
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gb() ? this.bT : -1);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gc() {
      this.a(bip.aU, true);
      if (!this.aS()) {
         this.dK().a(null, 1048, this.dk(), 0);
      }
   }

   @Override
   public boolean dy() {
      return false;
   }

   @Override
   protected aoy r() {
      return aoz.vo;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.vz;
   }

   @Override
   protected aoy h_() {
      return aoz.vq;
   }

   @Override
   aoy q() {
      return aoz.vB;
   }

   @Override
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byp $$4 && $$4.gb()) {
         $$4.gc();
         this.a(cjd.tr);
      }
   }
}
