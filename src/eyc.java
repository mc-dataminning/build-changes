import net.minecraft.server.MinecraftServer;

public class eyc implements eyd<MinecraftServer> {
   final alc a;

   public eyc(alc $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eyf<MinecraftServer> $$1, long $$2) {
      alr $$3 = $$0.aE();

      for (ih<et> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eyd.a<MinecraftServer, eyc> {
      public a() {
         super(alc.b("function_tag"), eyc.class);
      }

      public void a(uf $$0, eyc $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyc a(uf $$0) {
         alc $$1 = alc.a($$0.l("Name"));
         return new eyc($$1);
      }
   }
}
