import java.util.function.BooleanSupplier;

public class faf extends fah {
   private static final ur a = ur.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public faf(BooleanSupplier $$0) {
      super(esj.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aN_() {
      return false;
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      if (this.k.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.aE_();
      }
   }

   @Override
   public void aE_() {
      this.f.aU().c(ur.c("narrator.ready_to_play"));
      super.aE_();
   }

   @Override
   public boolean j() {
      return false;
   }
}
