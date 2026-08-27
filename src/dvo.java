import net.minecraft.server.MinecraftServer;

public record dvo(anm a, hs b, dys c) {
   public static dvo a(akk $$0) {
      MinecraftServer $$1 = $$0.n();
      return new dvo($$1.aX(), $$1.aU(), $$1.aS());
   }
}
