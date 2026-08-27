import net.minecraft.server.MinecraftServer;

public enum bgv {
   a("client"),
   b("server");

   private final String c;

   private bgv(String $$0) {
      this.c = $$0;
   }

   public static bgv a(MinecraftServer $$0) {
      return $$0.l() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
