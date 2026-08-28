import net.minecraft.server.MinecraftServer;

public record eiv(aul a, jw b, emg c) {
   public static eiv a(arb $$0) {
      MinecraftServer $$1 = $$0.o();
      return new eiv($$1.bg(), $$1.bc(), $$1.ba());
   }
}
