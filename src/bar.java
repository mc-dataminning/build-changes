import net.minecraft.server.MinecraftServer;

public enum bar {
   a("client"),
   b("server");

   private final String c;

   private bar(String $$0) {
      this.c = $$0;
   }

   public static bar a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
