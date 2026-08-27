public class bzs extends byt {
   private static final int c = 300;
   private static final aeg<Boolean> d = aej.a(bzs.class, aei.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public bzs(biw<? extends bzs> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.al().a(d, false);
   }

   public boolean ge() {
      return this.al().b(d);
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
      if (!this.dL().B && this.bv() && !this.fT()) {
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
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.ge() ? this.bT : -1);
   }

   @Override
   public void a(qy $$0) {
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
      this.a(biw.aU, true);
      if (!this.aS()) {
         this.dL().a(null, 1048, this.dl(), 0);
      }
   }

   @Override
   public boolean dz() {
      return false;
   }

   @Override
   protected ape w() {
      return apf.vo;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.vz;
   }

   @Override
   protected ape l_() {
      return apf.vq;
   }

   @Override
   ape t() {
      return apf.vB;
   }

   @Override
   protected void a(bhq $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byw $$4 && $$4.ge()) {
         $$4.gf();
         this.a(cjk.tr);
      }
   }
}
