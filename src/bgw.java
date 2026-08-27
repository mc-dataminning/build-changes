import net.minecraft.server.MinecraftServer;

public enum bgw {
   a("client"),
   b("server");

   private final String c;

   private bgw(String $$0) {
      this.c = $$0;
   }

   public static bgw a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
