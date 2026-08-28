import net.minecraft.server.MinecraftServer;

public record eob(aup a, kf b, ero c) {
   public static eob a(ard $$0) {
      MinecraftServer $$1 = $$0.p();
      return new eob($$1.be(), $$1.ba(), $$1.aY());
   }
}
