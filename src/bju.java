import net.minecraft.server.MinecraftServer;

public enum bju {
   a("client"),
   b("server");

   private final String c;

   private bju(String $$0) {
      this.c = $$0;
   }

   public static bju a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
