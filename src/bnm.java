import net.minecraft.server.MinecraftServer;

public enum bnm {
   a("client"),
   b("server");

   private final String c;

   private bnm(final String $$0) {
      this.c = $$0;
   }

   public static bnm a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
