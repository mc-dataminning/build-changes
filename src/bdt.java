import net.minecraft.server.MinecraftServer;

public enum bdt {
   a("client"),
   b("server");

   private final String c;

   private bdt(String $$0) {
      this.c = $$0;
   }

   public static bdt a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
