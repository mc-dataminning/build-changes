import net.minecraft.server.MinecraftServer;

public enum bnl {
   a("client"),
   b("server");

   private final String c;

   private bnl(final String $$0) {
      this.c = $$0;
   }

   public static bnl a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
