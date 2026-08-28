import net.minecraft.server.MinecraftServer;

public class eyq implements eys<MinecraftServer> {
   final alh a;

   public eyq(alh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eyu<MinecraftServer> $$1, long $$2) {
      alw $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eys.a<MinecraftServer, eyq> {
      public a() {
         super(alh.b("function"), eyq.class);
      }

      public void a(uj $$0, eyq $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyq a(uj $$0) {
         alh $$1 = alh.a($$0.l("Name"));
         return new eyq($$1);
      }
   }
}
