import net.minecraft.server.MinecraftServer;

public enum bpu {
   a("client"),
   b("server");

   private final String c;

   private bpu(final String $$0) {
      this.c = $$0;
   }

   public static bpu a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
