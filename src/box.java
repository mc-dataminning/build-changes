import net.minecraft.server.MinecraftServer;

public enum box {
   a("client"),
   b("server");

   private final String c;

   private box(final String $$0) {
      this.c = $$0;
   }

   public static box a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
