import net.minecraft.server.MinecraftServer;

public class fba implements fbc<MinecraftServer> {
   final alp a;

   public fba(alp $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbe<MinecraftServer> $$1, long $$2) {
      ame $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fbc.a<MinecraftServer, fba> {
      public a() {
         super(alp.b("function"), fba.class);
      }

      public void a(um $$0, fba $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fba a(um $$0) {
         alp $$1 = alp.a($$0.l("Name"));
         return new fba($$1);
      }
   }
}
