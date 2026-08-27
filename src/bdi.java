import net.minecraft.server.MinecraftServer;

public enum bdi {
   a("client"),
   b("server");

   private final String c;

   private bdi(String $$0) {
      this.c = $$0;
   }

   public static bdi a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
