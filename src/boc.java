import net.minecraft.server.MinecraftServer;

public enum boc {
   a("client"),
   b("server");

   private final String c;

   private boc(final String $$0) {
      this.c = $$0;
   }

   public static boc a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
