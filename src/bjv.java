import net.minecraft.server.MinecraftServer;

public enum bjv {
   a("client"),
   b("server");

   private final String c;

   private bjv(String $$0) {
      this.c = $$0;
   }

   public static bjv a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
