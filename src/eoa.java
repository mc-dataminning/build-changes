import net.minecraft.server.MinecraftServer;

public record eoa(auo a, kf b, ern c) {
   public static eoa a(arc $$0) {
      MinecraftServer $$1 = $$0.p();
      return new eoa($$1.be(), $$1.ba(), $$1.aY());
   }
}
