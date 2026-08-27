import net.minecraft.server.MinecraftServer;

public enum bgg {
   a("client"),
   b("server");

   private final String c;

   private bgg(String $$0) {
      this.c = $$0;
   }

   public static bgg a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
