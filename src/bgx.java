import net.minecraft.server.MinecraftServer;

public enum bgx {
   a("client"),
   b("server");

   private final String c;

   private bgx(String $$0) {
      this.c = $$0;
   }

   public static bgx a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
