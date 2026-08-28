import net.minecraft.server.MinecraftServer;

public class eyg implements eyh<MinecraftServer> {
   final ale a;

   public eyg(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eyj<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aE();

      for (ii<eu> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eyh.a<MinecraftServer, eyg> {
      public a() {
         super(ale.b("function_tag"), eyg.class);
      }

      public void a(ug $$0, eyg $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyg a(ug $$0) {
         ale $$1 = ale.a($$0.l("Name"));
         return new eyg($$1);
      }
   }
}
