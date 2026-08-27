import net.minecraft.server.MinecraftServer;

public enum bms {
   a("client"),
   b("server");

   private final String c;

   private bms(String $$0) {
      this.c = $$0;
   }

   public static bms a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
