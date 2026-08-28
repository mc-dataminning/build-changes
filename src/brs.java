import net.minecraft.server.MinecraftServer;

public enum brs {
   a("client"),
   b("server");

   private final String c;

   private brs(final String $$0) {
      this.c = $$0;
   }

   public static brs a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
