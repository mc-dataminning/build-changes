import net.minecraft.server.MinecraftServer;

public class ari implements aii {
   private final MinecraftServer a;
   private final vv b;

   public ari(MinecraftServer $$0, vv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(aif $$0) {
      if ($$0.g() != aie.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(air.a, new arp(this.a, this.b, false));
         this.b.a(air.b);
      }
   }

   @Override
   public void a(wx $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
