public class cev extends cdw {
   private static final int c = 300;
   private static final aie<Boolean> d = aih.a(cev.class, aig.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bT;

   public cev(bnu<? extends cev> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an().a(d, false);
   }

   public boolean gh() {
      return this.an().b(d);
   }

   public void w(boolean $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean gg() {
      return this.gh();
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && !this.fW()) {
         if (this.az) {
            if (this.gh()) {
               this.bT--;
               if (this.bT < 0) {
                  this.gi();
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
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gh() ? this.bT : -1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bT = $$0;
      this.w(true);
   }

   protected void gi() {
      this.a(bnu.aW, true);
      if (!this.aU()) {
         this.dM().a(null, 1048, this.dm(), 0);
      }
   }

   @Override
   public boolean dA() {
      return false;
   }

   @Override
   protected atj y() {
      return atk.wt;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.wE;
   }

   @Override
   protected atj n_() {
      return atk.wv;
   }

   @Override
   atj w() {
      return atk.wG;
   }

   @Override
   protected void a(bmn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cdz $$4 && $$4.gh()) {
         $$4.gi();
         this.a(cpc.uh);
      }
   }
}
