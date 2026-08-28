import net.minecraft.server.MinecraftServer;

public record eiz(auo a, jw b, emk c) {
   public static eiz a(are $$0) {
      MinecraftServer $$1 = $$0.o();
      return new eiz($$1.bg(), $$1.bc(), $$1.ba());
   }
}
