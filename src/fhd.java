import java.util.function.BooleanSupplier;

public class fhd extends fhf {
   private static final vu a = vu.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public fhd(BooleanSupplier $$0) {
      super(eyy.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aM_() {
      return false;
   }

   @Override
   protected boolean aN_() {
      return false;
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
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
      this.f.aY().c(vu.c("narrator.ready_to_play"));
      super.d();
   }

   @Override
   public boolean m() {
      return false;
   }
}
