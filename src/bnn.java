import net.minecraft.server.MinecraftServer;

public enum bnn {
   a("client"),
   b("server");

   private final String c;

   private bnn(final String $$0) {
      this.c = $$0;
   }

   public static bnn a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
