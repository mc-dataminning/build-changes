import net.minecraft.server.MinecraftServer;

public class asf implements aix {
   private final MinecraftServer b;
   private final vy c;

   public asf(MinecraftServer $$0, vy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aiu $$0) {
      if ($$0.g() != ait.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajg.b, new asn(this.b, this.c, false));
         this.c.a(ajg.d);
      }
   }

   @Override
   public void a(wa $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
