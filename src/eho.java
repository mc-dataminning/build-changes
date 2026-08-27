import net.minecraft.server.MinecraftServer;

public class eho implements ehq<MinecraftServer> {
   final afw a;

   public eho(afw $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ehs<MinecraftServer> $$1, long $$2) {
      agk $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ehq.a<MinecraftServer, eho> {
      public a() {
         super(new afw("function"), eho.class);
      }

      public void a(rt $$0, eho $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eho a(rt $$0) {
         afw $$1 = new afw($$0.l("Name"));
         return new eho($$1);
      }
   }
}
