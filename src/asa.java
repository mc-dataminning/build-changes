import net.minecraft.server.MinecraftServer;

public class asa implements aio {
   private final MinecraftServer b;
   private final vi c;

   public asa(MinecraftServer $$0, vi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ail $$0) {
      if ($$0.g() != aik.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aix.b, new asi(this.b, this.c, false));
         this.c.a(aix.d);
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
