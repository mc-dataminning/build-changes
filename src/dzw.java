import net.minecraft.server.MinecraftServer;

public record dzw(aqi a, iu b, edh c) {
   public static dzw a(and $$0) {
      MinecraftServer $$1 = $$0.o();
      return new dzw($$1.bc(), $$1.aZ(), $$1.aX());
   }
}
