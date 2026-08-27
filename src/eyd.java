import java.util.function.BooleanSupplier;

public class eyd extends eye {
   private static final tl a = tl.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public eyd(BooleanSupplier $$0) {
      super(eqh.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected boolean aG_() {
      return false;
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void c() {
      if (this.k.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.az_();
      }
   }

   @Override
   public void az_() {
      this.f.aV().c(tl.c("narrator.ready_to_play"));
      super.az_();
   }

   @Override
   public boolean j() {
      return false;
   }
}
