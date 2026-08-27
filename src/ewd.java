import net.minecraft.server.MinecraftServer;

public class ewd implements ewf<MinecraftServer> {
   final akt a;

   public ewd(akt $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewh<MinecraftServer> $$1, long $$2) {
      ali $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ewf.a<MinecraftServer, ewd> {
      public a() {
         super(new akt("function"), ewd.class);
      }

      public void a(uk $$0, ewd $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewd a(uk $$0) {
         akt $$1 = new akt($$0.l("Name"));
         return new ewd($$1);
      }
   }
}
