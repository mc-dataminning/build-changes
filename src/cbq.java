public class cbq extends car {
   private static final int c = 300;
   private static final afo<Boolean> d = afr.a(cbq.class, afq.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public cbq(bku<? extends cbq> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      super.b_();
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
      if (!this.dN().B && this.bx() && !this.fV()) {
         if (this.aA) {
            if (this.gg()) {
               this.bT--;
               if (this.bT < 0) {
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gg() ? this.bT : -1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gh() {
      this.a(bku.aU, true);
      if (!this.aU()) {
         this.dN().a(null, 1048, this.dn(), 0);
      }
   }

   @Override
   public boolean dB() {
      return false;
   }

   @Override
   protected aqq y() {
      return aqr.vJ;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.vU;
   }

   @Override
   protected aqq m_() {
      return aqr.vL;
   }

   @Override
   aqq w() {
      return aqr.vW;
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cau $$4 && $$4.gg()) {
         $$4.gh();
         this.a(clm.ud);
      }
   }
}
