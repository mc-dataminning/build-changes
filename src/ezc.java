import java.util.function.BooleanSupplier;

public class ezc extends ezd {
   private static final ui a = ui.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public ezc(BooleanSupplier $$0) {
      super(erg.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aB_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      if (this.k.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.aC_();
      }
   }

   @Override
   public void aC_() {
      this.f.aV().c(ui.c("narrator.ready_to_play"));
      super.aC_();
   }

   @Override
   public boolean j() {
      return false;
   }
}
