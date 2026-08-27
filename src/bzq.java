public class bzq extends byr {
   private static final int c = 300;
   private static final aef<Boolean> d = aei.a(bzq.class, aeh.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public bzq(biu<? extends bzq> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am().a(d, false);
   }

   public boolean ge() {
      return this.am().b(d);
   }

   public void w(boolean $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean gd() {
      return this.ge();
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bw() && !this.fT()) {
         if (this.aA) {
            if (this.ge()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gf();
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
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.ge() ? this.bT : -1);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gf() {
      this.a(biu.aU, true);
      if (!this.aT()) {
         this.dL().a(null, 1048, this.dl(), 0);
      }
   }

   @Override
   public boolean dz() {
      return false;
   }

   @Override
   protected apd w() {
      return ape.vo;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.vz;
   }

   @Override
   protected apd l_() {
      return ape.vq;
   }

   @Override
   apd t() {
      return ape.vB;
   }

   @Override
   protected void a(bho $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byu $$4 && $$4.ge()) {
         $$4.gf();
         this.a(cji.tr);
      }
   }
}
