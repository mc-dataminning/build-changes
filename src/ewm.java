import net.minecraft.server.MinecraftServer;

public class ewm implements ewn<MinecraftServer> {
   final akr a;

   public ewm(akr $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewp<MinecraftServer> $$1, long $$2) {
      alg $$3 = $$0.aF();

      for (ig<et> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ewn.a<MinecraftServer, ewm> {
      public a() {
         super(akr.b("function_tag"), ewm.class);
      }

      public void a(ub $$0, ewm $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewm a(ub $$0) {
         akr $$1 = akr.a($$0.l("Name"));
         return new ewm($$1);
      }
   }
}
