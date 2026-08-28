import net.minecraft.server.MinecraftServer;

public enum bmv {
   a("client"),
   b("server");

   private final String c;

   private bmv(final String $$0) {
      this.c = $$0;
   }

   public static bmv a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
