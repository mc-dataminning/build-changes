import net.minecraft.server.MinecraftServer;

public enum bmm {
   a("client"),
   b("server");

   private final String c;

   private bmm(String $$0) {
      this.c = $$0;
   }

   public static bmm a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
