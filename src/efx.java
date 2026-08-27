import net.minecraft.server.MinecraftServer;

public record efx(atc a, iz b, eji c) {
   public static efx a(aps $$0) {
      MinecraftServer $$1 = $$0.o();
      return new efx($$1.bg(), $$1.bd(), $$1.bb());
   }
}
