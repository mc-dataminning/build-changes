import net.minecraft.server.MinecraftServer;

public enum bew {
   a("client"),
   b("server");

   private final String c;

   private bew(String $$0) {
      this.c = $$0;
   }

   public static bew a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
