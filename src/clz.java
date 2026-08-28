import com.google.common.annotations.VisibleForTesting;

public class clz extends ckz {
   private static final int c = 300;
   private static final akl<Boolean> d = akp.a(clz.class, akn.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public clz(bul<? extends clz> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gx() {
      return this.aw().a(d);
   }

   public void x(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean gw() {
      return this.gx();
   }

   @Override
   public void l() {
      if (!this.dX().C && this.bM() && !this.gh()) {
         if (this.aw) {
            if (this.gx()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gy();
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
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gx() ? this.bY : -1);
   }

   @Override
   public void a(uk $$0) {
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

   protected void gy() {
      this.a(bul.aY, btz.a(this, true, true), $$0 -> {
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
   protected awk w() {
      return awl.xa;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.xl;
   }

   @Override
   protected awk o_() {
      return awl.xc;
   }

   @Override
   awk t() {
      return awl.xn;
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cld $$4 && $$4.gw()) {
         $$4.gx();
         this.a(cwf.un);
      }
   }
}
