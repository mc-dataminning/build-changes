import net.minecraft.server.MinecraftServer;

public record ebu(asa a, iw b, eff c) {
   public static ebu a(aov $$0) {
      MinecraftServer $$1 = $$0.o();
      return new ebu($$1.bc(), $$1.aZ(), $$1.aX());
   }
}
