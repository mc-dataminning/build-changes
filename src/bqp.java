import net.minecraft.server.MinecraftServer;

public enum bqp {
   a("client"),
   b("server");

   private final String c;

   private bqp(final String $$0) {
      this.c = $$0;
   }

   public static bqp a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
