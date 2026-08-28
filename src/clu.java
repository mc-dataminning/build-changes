import com.google.common.annotations.VisibleForTesting;

public class clu extends cku {
   private static final int c = 300;
   private static final akk<Boolean> d = ako.a(clu.class, akm.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public clu(bug<? extends clu> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gy() {
      return this.av().a(d);
   }

   public void x(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean gx() {
      return this.gy();
   }

   @Override
   public void l() {
      if (!this.dX().C && this.bM() && !this.gi()) {
         if (this.aw) {
            if (this.gy()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gz();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.x(false);
         }
      }

      super.l();
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gy() ? this.bY : -1);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bY = $$0;
      this.x(true);
   }

   protected void gz() {
      this.a(bug.aY, btu.a(this, true, true), $$0 -> {
         if (!this.bc()) {
            this.dX().a(null, 1048, this.dx(), 0);
         }
      });
   }

   @Override
   public boolean dL() {
      return false;
   }

   @Override
   protected awj w() {
      return awk.xa;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.xl;
   }

   @Override
   protected awj o_() {
      return awk.xc;
   }

   @Override
   awj t() {
      return awk.xn;
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cky $$4 && $$4.gx()) {
         $$4.gy();
         this.a(cwb.un);
      }
   }
}
