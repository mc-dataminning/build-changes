import net.minecraft.server.MinecraftServer;

public record ekf(aue a, ka b, ens c) {
   public static ekf a(aqu $$0) {
      MinecraftServer $$1 = $$0.o();
      return new ekf($$1.bg(), $$1.bc(), $$1.ba());
   }
}
