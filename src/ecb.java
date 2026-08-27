import net.minecraft.server.MinecraftServer;

public record ecb(asb a, iw b, efm c) {
   public static ecb a(aow $$0) {
      MinecraftServer $$1 = $$0.o();
      return new ecb($$1.be(), $$1.bb(), $$1.aZ());
   }
}
