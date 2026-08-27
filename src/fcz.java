import java.util.function.BooleanSupplier;

public class fcz extends fdb {
   private static final vf a = vf.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public fcz(BooleanSupplier $$0) {
      super(eva.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
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
      this.f.aW().c(vf.c("narrator.ready_to_play"));
      super.aE_();
   }

   @Override
   public boolean k() {
      return false;
   }
}
