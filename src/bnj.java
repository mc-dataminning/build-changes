import net.minecraft.server.MinecraftServer;

public enum bnj {
   a("client"),
   b("server");

   private final String c;

   private bnj(final String $$0) {
      this.c = $$0;
   }

   public static bnj a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
