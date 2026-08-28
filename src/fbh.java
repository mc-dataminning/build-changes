import net.minecraft.server.MinecraftServer;

public class fbh implements fbi<MinecraftServer> {
   final aku a;

   public fbh(aku $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbk<MinecraftServer> $$1, long $$2) {
      alj $$3 = $$0.aE();

      for (il<ex> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fbi.a<MinecraftServer, fbh> {
      public a() {
         super(aku.b("function_tag"), fbh.class);
      }

      public void a(tq $$0, fbh $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbh a(tq $$0) {
         aku $$1 = aku.a($$0.l("Name"));
         return new fbh($$1);
      }
   }
}
