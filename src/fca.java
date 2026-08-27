import java.util.function.BooleanSupplier;

public class fca extends fcc {
   private static final vb a = vb.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public fca(BooleanSupplier $$0) {
      super(euc.a);
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
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
      this.f.aU().c(vb.c("narrator.ready_to_play"));
      super.aF_();
   }

   @Override
   public boolean j() {
      return false;
   }
}
