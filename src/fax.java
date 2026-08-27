import java.util.function.BooleanSupplier;

public class fax extends faz {
   private static final uv a = uv.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier k;

   public fax(BooleanSupplier $$0) {
      super(eta.a);
      this.k = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected boolean aP_() {
      return false;
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      if (this.k.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.aG_();
      }
   }

   @Override
   public void aG_() {
      this.f.aU().c(uv.c("narrator.ready_to_play"));
      super.aG_();
   }

   @Override
   public boolean j() {
      return false;
   }
}
