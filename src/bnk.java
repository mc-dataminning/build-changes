import net.minecraft.server.MinecraftServer;

public enum bnk {
   a("client"),
   b("server");

   private final String c;

   private bnk(final String $$0) {
      this.c = $$0;
   }

   public static bnk a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
