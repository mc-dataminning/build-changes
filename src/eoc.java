import net.minecraft.server.MinecraftServer;

public record eoc(aup a, kf b, erp c) {
   public static eoc a(arc $$0) {
      MinecraftServer $$1 = $$0.p();
      return new eoc($$1.be(), $$1.ba(), $$1.aY());
   }
}
