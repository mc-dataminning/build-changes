import net.minecraft.server.MinecraftServer;

public class eyx implements eyy<MinecraftServer> {
   final ali a;

   public eyx(ali $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eza<MinecraftServer> $$1, long $$2) {
      alx $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eyy.a<MinecraftServer, eyx> {
      public a() {
         super(ali.b("function_tag"), eyx.class);
      }

      public void a(uk $$0, eyx $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyx a(uk $$0) {
         ali $$1 = ali.a($$0.l("Name"));
         return new eyx($$1);
      }
   }
}
