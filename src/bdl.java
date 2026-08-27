import net.minecraft.server.MinecraftServer;

public enum bdl {
   a("client"),
   b("server");

   private final String c;

   private bdl(String $$0) {
      this.c = $$0;
   }

   public static bdl a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
