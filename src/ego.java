import net.minecraft.server.MinecraftServer;

public class ego implements egq<MinecraftServer> {
   final aep a;

   public ego(aep $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egs<MinecraftServer> $$1, long $$2) {
      afd $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends egq.a<MinecraftServer, ego> {
      public a() {
         super(new aep("function"), ego.class);
      }

      public void a(qs $$0, ego $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ego a(qs $$0) {
         aep $$1 = new aep($$0.l("Name"));
         return new ego($$1);
      }
   }
}
