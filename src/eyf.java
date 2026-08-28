import net.minecraft.server.MinecraftServer;

public class eyf implements eyh<MinecraftServer> {
   final ale a;

   public eyf(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eyj<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eyh.a<MinecraftServer, eyf> {
      public a() {
         super(ale.b("function"), eyf.class);
      }

      public void a(ug $$0, eyf $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyf a(ug $$0) {
         ale $$1 = ale.a($$0.l("Name"));
         return new eyf($$1);
      }
   }
}
