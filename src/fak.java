import net.minecraft.server.MinecraftServer;

public class fak implements fal<MinecraftServer> {
   final aku a;

   public fak(aku $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fan<MinecraftServer> $$1, long $$2) {
      alj $$3 = $$0.aE();

      for (il<ex> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fal.a<MinecraftServer, fak> {
      public a() {
         super(aku.b("function_tag"), fak.class);
      }

      public void a(tq $$0, fak $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fak a(tq $$0) {
         aku $$1 = aku.a($$0.l("Name"));
         return new fak($$1);
      }
   }
}
