import net.minecraft.server.MinecraftServer;

public enum bfs {
   a("client"),
   b("server");

   private final String c;

   private bfs(String $$0) {
      this.c = $$0;
   }

   public static bfs a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
