import net.minecraft.server.MinecraftServer;

public class arh implements aif {
   private final MinecraftServer b;
   private final vp c;

   public arh(MinecraftServer $$0, vp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aic $$0) {
      if ($$0.g() != aib.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aio.a, new aro(this.b, this.c, false));
         this.c.a(aio.b);
      }
   }

   @Override
   public void a(wu $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
