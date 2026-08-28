import net.minecraft.server.MinecraftServer;

public enum bqw {
   a("client"),
   b("server");

   private final String c;

   private bqw(final String $$0) {
      this.c = $$0;
   }

   public static bqw a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
