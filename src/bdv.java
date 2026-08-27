import net.minecraft.server.MinecraftServer;

public enum bdv {
   a("client"),
   b("server");

   private final String c;

   private bdv(String $$0) {
      this.c = $$0;
   }

   public static bdv a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
