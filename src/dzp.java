import net.minecraft.server.MinecraftServer;

public record dzp(aqc a, iu b, eda c) {
   public static dzp a(amz $$0) {
      MinecraftServer $$1 = $$0.o();
      return new dzp($$1.bc(), $$1.aZ(), $$1.aX());
   }
}
