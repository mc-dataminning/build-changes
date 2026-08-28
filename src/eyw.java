import net.minecraft.server.MinecraftServer;

public class eyw implements eyy<MinecraftServer> {
   final ali a;

   public eyw(ali $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eza<MinecraftServer> $$1, long $$2) {
      alx $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eyy.a<MinecraftServer, eyw> {
      public a() {
         super(ali.b("function"), eyw.class);
      }

      public void a(uk $$0, eyw $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyw a(uk $$0) {
         ali $$1 = ali.a($$0.l("Name"));
         return new eyw($$1);
      }
   }
}
