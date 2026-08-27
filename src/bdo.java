import net.minecraft.server.MinecraftServer;

public enum bdo {
   a("client"),
   b("server");

   private final String c;

   private bdo(String $$0) {
      this.c = $$0;
   }

   public static bdo a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
