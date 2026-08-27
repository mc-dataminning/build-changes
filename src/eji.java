import net.minecraft.server.MinecraftServer;

public class eji implements ejk<MinecraftServer> {
   final agm a;

   public eji(agm $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ejm<MinecraftServer> $$1, long $$2) {
      aha $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ejk.a<MinecraftServer, eji> {
      public a() {
         super(new agm("function"), eji.class);
      }

      public void a(sd $$0, eji $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eji a(sd $$0) {
         agm $$1 = new agm($$0.l("Name"));
         return new eji($$1);
      }
   }
}
