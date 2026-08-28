import net.minecraft.server.MinecraftServer;

public class fbg implements fbi<MinecraftServer> {
   final alz a;

   public fbg(alz $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbk<MinecraftServer> $$1, long $$2) {
      amo $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fbi.a<MinecraftServer, fbg> {
      public a() {
         super(alz.b("function"), fbg.class);
      }

      public void a(ux $$0, fbg $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbg a(ux $$0) {
         alz $$1 = alz.a($$0.l("Name"));
         return new fbg($$1);
      }
   }
}
