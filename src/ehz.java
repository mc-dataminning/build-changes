import net.minecraft.server.MinecraftServer;

public record ehz(atw a, jl b, elk c) {
   public static ehz a(aqm $$0) {
      MinecraftServer $$1 = $$0.o();
      return new ehz($$1.bg(), $$1.bc(), $$1.ba());
   }
}
