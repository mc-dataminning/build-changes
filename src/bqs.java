import net.minecraft.server.MinecraftServer;

public enum bqs {
   a("client"),
   b("server");

   private final String c;

   private bqs(final String $$0) {
      this.c = $$0;
   }

   public static bqs a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
