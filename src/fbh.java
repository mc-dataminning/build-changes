import net.minecraft.server.MinecraftServer;

public class fbh implements fbj<MinecraftServer> {
   final alz a;

   public fbh(alz $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbl<MinecraftServer> $$1, long $$2) {
      amo $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fbj.a<MinecraftServer, fbh> {
      public a() {
         super(alz.b("function"), fbh.class);
      }

      public void a(ux $$0, fbh $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbh a(ux $$0) {
         alz $$1 = alz.a($$0.l("Name"));
         return new fbh($$1);
      }
   }
}
