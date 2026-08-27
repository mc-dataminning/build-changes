import java.util.function.BooleanSupplier;

public class ffj extends ffl {
   private static final vq a = vq.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public ffj(BooleanSupplier $$0) {
      super(exg.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aO_() {
      return false;
   }

   @Override
   protected boolean aP_() {
      return false;
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void e() {
      if (this.k.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.f.aX().c(vq.c("narrator.ready_to_play"));
      super.d();
   }

   @Override
   public boolean m() {
      return false;
   }
}
