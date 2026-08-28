import net.minecraft.server.MinecraftServer;

public class ewk implements ewl<MinecraftServer> {
   final akr a;

   public ewk(akr $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewn<MinecraftServer> $$1, long $$2) {
      alg $$3 = $$0.aF();

      for (ig<et> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ewl.a<MinecraftServer, ewk> {
      public a() {
         super(akr.b("function_tag"), ewk.class);
      }

      public void a(ub $$0, ewk $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewk a(ub $$0) {
         akr $$1 = akr.a($$0.l("Name"));
         return new ewk($$1);
      }
   }
}
