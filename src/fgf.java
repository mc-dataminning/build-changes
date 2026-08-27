import java.util.function.BooleanSupplier;

public class fgf extends fgh {
   private static final vs a = vs.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public fgf(BooleanSupplier $$0) {
      super(eyc.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
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
      this.f.aX().c(vs.c("narrator.ready_to_play"));
      super.d();
   }

   @Override
   public boolean m() {
      return false;
   }
}
