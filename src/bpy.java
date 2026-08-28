import net.minecraft.server.MinecraftServer;

public enum bpy {
   a("client"),
   b("server");

   private final String c;

   private bpy(final String $$0) {
      this.c = $$0;
   }

   public static bpy a(MinecraftServer $$0) {
      return $$0.n() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
