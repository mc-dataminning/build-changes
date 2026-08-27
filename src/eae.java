import net.minecraft.server.MinecraftServer;

public record eae(aqj a, iu b, edp c) {
   public static eae a(ane $$0) {
      MinecraftServer $$1 = $$0.o();
      return new eae($$1.bc(), $$1.aZ(), $$1.aX());
   }
}
