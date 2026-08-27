import net.minecraft.server.MinecraftServer;

public enum bli {
   a("client"),
   b("server");

   private final String c;

   private bli(String $$0) {
      this.c = $$0;
   }

   public static bli a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
