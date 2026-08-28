import net.minecraft.server.MinecraftServer;

public class exo implements exp<MinecraftServer> {
   final alb a;

   public exo(alb $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, exr<MinecraftServer> $$1, long $$2) {
      alq $$3 = $$0.aE();

      for (ih<et> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends exp.a<MinecraftServer, exo> {
      public a() {
         super(alb.b("function_tag"), exo.class);
      }

      public void a(uf $$0, exo $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public exo a(uf $$0) {
         alb $$1 = alb.a($$0.l("Name"));
         return new exo($$1);
      }
   }
}
