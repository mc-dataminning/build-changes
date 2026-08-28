import net.minecraft.server.MinecraftServer;

public class asu implements aji {
   private final MinecraftServer b;
   private final we c;

   public asu(MinecraftServer $$0, we $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ajf $$0) {
      if ($$0.g() != aje.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajr.b, new atc(this.b, this.c, false));
         this.c.a(ajr.d);
      }
   }

   @Override
   public void a(wg $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
