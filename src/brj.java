import net.minecraft.server.MinecraftServer;

public enum brj {
   a("client"),
   b("server");

   private final String c;

   private brj(final String $$0) {
      this.c = $$0;
   }

   public static brj a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
