import net.minecraft.server.MinecraftServer;

public class arz implements aiz {
   private final MinecraftServer b;
   private final wj c;

   public arz(MinecraftServer $$0, wj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aiw $$0) {
      if ($$0.g() != aiv.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aji.a, new asg(this.b, this.c, false));
         this.c.a(aji.b);
      }
   }

   @Override
   public void a(xo $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
