import net.minecraft.server.MinecraftServer;

public enum bip {
   a("client"),
   b("server");

   private final String c;

   private bip(String $$0) {
      this.c = $$0;
   }

   public static bip a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
