import com.google.common.annotations.VisibleForTesting;

public class cmd extends cld {
   private static final int c = 300;
   private static final ako<Boolean> d = aks.a(cmd.class, akq.k);
   public static final String b = "StrayConversionTime";
   private int e;
   private int bY;

   public cmd(bup<? extends cmd> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public boolean gy() {
      return this.aw().a(d);
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
      if (!this.dY().C && this.bN() && !this.gi()) {
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
   public void b(un $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gy() ? this.bY : -1);
   }

   @Override
   public void a(un $$0) {
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
      this.a(bup.aY, bud.a(this, true, true), $$0 -> {
         if (!this.bd()) {
            this.dY().a(null, 1048, this.dy(), 0);
         }
      });
   }

   @Override
   public boolean dM() {
      return false;
   }

   @Override
   protected awn w() {
      return awo.xa;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.xl;
   }

   @Override
   protected awn o_() {
      return awo.xc;
   }

   @Override
   awn t() {
      return awo.xn;
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clh $$4 && $$4.gx()) {
         $$4.gy();
         this.a(cwj.uD);
      }
   }
}
