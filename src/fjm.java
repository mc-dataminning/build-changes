import java.util.function.BooleanSupplier;

public class fjm extends fjo {
   private static final wg a = wg.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;

   public fjm(BooleanSupplier $$0) {
      super(fbh.a);
      this.d = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, a, this.k / 2, this.l / 2 - 50, 16777215);
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.j.aY().c(wg.c("narrator.ready_to_play"));
      super.d();
   }

   @Override
   public boolean k() {
      return false;
   }
}
