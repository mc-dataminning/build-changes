import net.minecraft.server.MinecraftServer;

public enum boo {
   a("client"),
   b("server");

   private final String c;

   private boo(final String $$0) {
      this.c = $$0;
   }

   public static boo a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
