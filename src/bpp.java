import net.minecraft.server.MinecraftServer;

public enum bpp {
   a("client"),
   b("server");

   private final String c;

   private bpp(final String $$0) {
      this.c = $$0;
   }

   public static bpp a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
