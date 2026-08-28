import net.minecraft.server.MinecraftServer;

public enum bno {
   a("client"),
   b("server");

   private final String c;

   private bno(final String $$0) {
      this.c = $$0;
   }

   public static bno a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
