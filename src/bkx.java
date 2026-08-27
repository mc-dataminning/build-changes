import net.minecraft.server.MinecraftServer;

public enum bkx {
   a("client"),
   b("server");

   private final String c;

   private bkx(String $$0) {
      this.c = $$0;
   }

   public static bkx a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
