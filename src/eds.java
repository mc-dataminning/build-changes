import net.minecraft.server.MinecraftServer;

public record eds(aso a, iz b, ehd c) {
   public static eds a(apf $$0) {
      MinecraftServer $$1 = $$0.o();
      return new eds($$1.bg(), $$1.bd(), $$1.bb());
   }
}
