public class ckk extends cjk {
   private static final int c = 300;
   private static final akj<Boolean> d = akn.a(ckk.class, akl.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public ckk(bsz<? extends ckk> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gt() {
      return this.ap().a(d);
   }

   public void w(boolean $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean gs() {
      return this.gt();
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && !this.gg()) {
         if (this.aB) {
            if (this.gt()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gu();
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
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gt() ? this.bY : -1);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   private void b(int $$0) {
      this.bY = $$0;
      this.w(true);
   }

   protected void gu() {
      this.a(bsz.aY, true);
      if (!this.aW()) {
         this.dP().a(null, 1048, this.dp(), 0);
      }
   }

   @Override
   public boolean dD() {
      return false;
   }

   @Override
   protected avy v() {
      return avz.wY;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.xj;
   }

   @Override
   protected avy o_() {
      return avz.xa;
   }

   @Override
   avy u() {
      return avz.xl;
   }

   @Override
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjo $$4 && $$4.gr()) {
         $$4.gs();
         this.a(cur.ul);
      }
   }
}
