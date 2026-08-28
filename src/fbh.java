import net.minecraft.server.MinecraftServer;

public class fbh implements fbi<MinecraftServer> {
   final alz a;

   public fbh(alz $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbk<MinecraftServer> $$1, long $$2) {
      amo $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fbi.a<MinecraftServer, fbh> {
      public a() {
         super(alz.b("function_tag"), fbh.class);
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
