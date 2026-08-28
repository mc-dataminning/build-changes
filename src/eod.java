import net.minecraft.server.MinecraftServer;

public record eod(aup a, kf b, erq c) {
   public static eod a(ard $$0) {
      MinecraftServer $$1 = $$0.p();
      return new eod($$1.be(), $$1.ba(), $$1.aY());
   }
}
