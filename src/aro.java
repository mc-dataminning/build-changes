import net.minecraft.server.MinecraftServer;

public class aro implements aio {
   private final MinecraftServer a;
   private final wc b;

   public aro(MinecraftServer $$0, wc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ail $$0) {
      if ($$0.g() != aik.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(aix.a, new arv(this.a, this.b, false));
         this.b.a(aix.b);
      }
   }

   @Override
   public void a(xe $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
