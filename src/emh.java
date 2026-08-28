import net.minecraft.server.MinecraftServer;

public record emh(ava a, kd b, epu c) {
   public static emh a(arm $$0) {
      MinecraftServer $$1 = $$0.o();
      return new emh($$1.bf(), $$1.bb(), $$1.aZ());
   }
}
