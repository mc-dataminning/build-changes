import net.minecraft.server.MinecraftServer;

public enum bjg {
   a("client"),
   b("server");

   private final String c;

   private bjg(String $$0) {
      this.c = $$0;
   }

   public static bjg a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
