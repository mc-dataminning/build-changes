import net.minecraft.server.MinecraftServer;

public enum bqh {
   a("client"),
   b("server");

   private final String c;

   private bqh(final String $$0) {
      this.c = $$0;
   }

   public static bqh a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
