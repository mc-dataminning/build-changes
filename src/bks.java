import net.minecraft.server.MinecraftServer;

public enum bks {
   a("client"),
   b("server");

   private final String c;

   private bks(String $$0) {
      this.c = $$0;
   }

   public static bks a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
