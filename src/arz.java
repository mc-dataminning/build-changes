import net.minecraft.server.MinecraftServer;

public class arz implements ain {
   private final MinecraftServer b;
   private final vi c;

   public arz(MinecraftServer $$0, vi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aik $$0) {
      if ($$0.g() != aij.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aiw.b, new ash(this.b, this.c, false));
         this.c.a(aiw.d);
      }
   }

   @Override
   public void a(vk $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
