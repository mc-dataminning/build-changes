import net.minecraft.server.MinecraftServer;

public enum bot {
   a("client"),
   b("server");

   private final String c;

   private bot(final String $$0) {
      this.c = $$0;
   }

   public static bot a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
