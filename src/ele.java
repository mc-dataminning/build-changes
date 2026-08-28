import net.minecraft.server.MinecraftServer;

public record ele(aus a, kb b, eor c) {
   public static ele a(arg $$0) {
      MinecraftServer $$1 = $$0.o();
      return new ele($$1.bf(), $$1.bb(), $$1.aZ());
   }
}
