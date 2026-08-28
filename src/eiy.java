import net.minecraft.server.MinecraftServer;

public record eiy(auo a, jw b, emj c) {
   public static eiy a(are $$0) {
      MinecraftServer $$1 = $$0.o();
      return new eiy($$1.bg(), $$1.bc(), $$1.ba());
   }
}
