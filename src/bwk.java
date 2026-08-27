public class bwk extends bvl {
   private static final int c = 300;
   private static final aby<Boolean> d = acb.a(bwk.class, aca.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public bwk(bfn<? extends bwk> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.aj().a(d, false);
   }

   public boolean fZ() {
      return this.aj().b(d);
   }

   public void w(boolean $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean fY() {
      return this.fZ();
   }

   @Override
   public void l() {
      if (!this.dI().B && this.bs() && !this.fQ()) {
         if (this.az) {
            if (this.fZ()) {
               this.bT--;
               if (this.bT < 0) {
                  this.ga();
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
      $$0.a("StrayConversionTime", this.fZ() ? this.bT : -1);
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

   protected void ga() {
      this.a(bfn.aU, true);
      if (!this.aQ()) {
         this.dI().a(null, 1048, this.di(), 0);
      }
   }

   @Override
   public boolean dw() {
      return false;
   }

   @Override
   protected amg s() {
      return amh.vo;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.vz;
   }

   @Override
   protected amg g_() {
      return amh.vq;
   }

   @Override
   amg r() {
      return amh.vB;
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bvo $$4 && $$4.fZ()) {
         $$4.ga();
         this.a(cgc.tr);
      }
   }
}
