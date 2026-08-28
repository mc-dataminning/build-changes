import net.minecraft.server.MinecraftServer;

public class ewg implements ewh<MinecraftServer> {
   final akq a;

   public ewg(akq $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewj<MinecraftServer> $$1, long $$2) {
      alf $$3 = $$0.aF();

      for (ig<et> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ewh.a<MinecraftServer, ewg> {
      public a() {
         super(akq.b("function_tag"), ewg.class);
      }

      public void a(ua $$0, ewg $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewg a(ua $$0) {
         akq $$1 = akq.a($$0.l("Name"));
         return new ewg($$1);
      }
   }
}
