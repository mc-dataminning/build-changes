import net.minecraft.server.MinecraftServer;

public enum bfw {
   a("client"),
   b("server");

   private final String c;

   private bfw(String $$0) {
      this.c = $$0;
   }

   public static bfw a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
