import net.minecraft.server.MinecraftServer;

public record edu(aso a, iz b, ehf c) {
   public static edu a(apf $$0) {
      MinecraftServer $$1 = $$0.o();
      return new edu($$1.bg(), $$1.bd(), $$1.bb());
   }
}
