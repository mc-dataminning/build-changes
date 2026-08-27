import net.minecraft.server.MinecraftServer;

public class enb implements end<MinecraftServer> {
   final aiy a;

   public enb(aiy $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, enf<MinecraftServer> $$1, long $$2) {
      ajm $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends end.a<MinecraftServer, enb> {
      public a() {
         super(new aiy("function"), enb.class);
      }

      public void a(sw $$0, enb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public enb a(sw $$0) {
         aiy $$1 = new aiy($$0.l("Name"));
         return new enb($$1);
      }
   }
}
