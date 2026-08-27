import net.minecraft.server.MinecraftServer;

public enum bgq {
   a("client"),
   b("server");

   private final String c;

   private bgq(String $$0) {
      this.c = $$0;
   }

   public static bgq a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
