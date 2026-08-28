import net.minecraft.server.MinecraftServer;

public record esd(avd a, jt b, evq c) {
   public static esd a(arq $$0) {
      MinecraftServer $$1 = $$0.p();
      return new esd($$1.be(), $$1.ba(), $$1.aY());
   }
}
