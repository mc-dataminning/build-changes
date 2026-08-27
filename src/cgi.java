public class cgi extends cfi {
   private static final int c = 300;
   private static final aim<Boolean> d = aiq.a(cgi.class, aio.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bX;

   public cgi(bpd<? extends cgi> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gq() {
      return this.an().a(d);
   }

   public void w(boolean $$0) {
      this.an.a(d, $$0);
   }

   @Override
   public boolean gp() {
      return this.gq();
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && !this.gd()) {
         if (this.aA) {
            if (this.gq()) {
               this.bX--;
               if (this.bX < 0) {
                  this.gr();
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
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gq() ? this.bX : -1);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bX = $$0;
      this.w(true);
   }

   protected void gr() {
      this.a(bpd.aY, true);
      if (!this.aU()) {
         this.dM().a(null, 1048, this.dm(), 0);
      }
   }

   @Override
   public boolean dA() {
      return false;
   }

   @Override
   protected atx v() {
      return aty.wC;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.wN;
   }

   @Override
   protected atx n_() {
      return aty.wE;
   }

   @Override
   atx s() {
      return aty.wP;
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfm $$4 && $$4.go()) {
         $$4.gp();
         this.a(cqp.uj);
      }
   }
}
