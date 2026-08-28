import net.minecraft.server.MinecraftServer;

public record esr(avf a, jt b, ewe c) {
   public static esr a(ars $$0) {
      MinecraftServer $$1 = $$0.p();
      return new esr($$1.be(), $$1.ba(), $$1.aY());
   }
}
