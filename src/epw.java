import net.minecraft.server.MinecraftServer;

public record epw(ava a, kg b, etj c) {
   public static epw a(arn $$0) {
      MinecraftServer $$1 = $$0.p();
      return new epw($$1.be(), $$1.ba(), $$1.aY());
   }
}
