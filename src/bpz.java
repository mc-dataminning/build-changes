import net.minecraft.server.MinecraftServer;

public enum bpz {
   a("client"),
   b("server");

   private final String c;

   private bpz(final String $$0) {
      this.c = $$0;
   }

   public static bpz a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
