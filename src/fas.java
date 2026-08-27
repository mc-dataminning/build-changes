import java.util.function.BooleanSupplier;

public class fas extends fau {
   private static final ur a = ur.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public fas(BooleanSupplier $$0) {
      super(esv.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      if (this.k.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.aF_();
      }
   }

   @Override
   public void aF_() {
      this.f.aU().c(ur.c("narrator.ready_to_play"));
      super.aF_();
   }

   @Override
   public boolean j() {
      return false;
   }
}
