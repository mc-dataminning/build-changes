import net.minecraft.server.MinecraftServer;

public enum bdz {
   a("client"),
   b("server");

   private final String c;

   private bdz(String $$0) {
      this.c = $$0;
   }

   public static bdz a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
