import net.minecraft.server.MinecraftServer;

public class fds implements fdt<MinecraftServer> {
   final alg a;

   public fds(alg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fdv<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();

      for (hw<ei> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fdt.a<MinecraftServer, fds> {
      public a() {
         super(alg.b("function_tag"), fds.class);
      }

      public void a(tz $$0, fds $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fds a(tz $$0) {
         alg $$1 = alg.a($$0.l("Name"));
         return new fds($$1);
      }
   }
}
