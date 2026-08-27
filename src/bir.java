import net.minecraft.server.MinecraftServer;

public enum bir {
   a("client"),
   b("server");

   private final String c;

   private bir(String $$0) {
      this.c = $$0;
   }

   public static bir a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
