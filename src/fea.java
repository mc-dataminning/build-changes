import net.minecraft.server.MinecraftServer;

public class fea implements feb<MinecraftServer> {
   final alg a;

   public fea(alg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fed<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();

      for (hw<ei> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends feb.a<MinecraftServer, fea> {
      public a() {
         super(alg.b("function_tag"), fea.class);
      }

      public void a(tz $$0, fea $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fea a(tz $$0) {
         alg $$1 = alg.a($$0.l("Name"));
         return new fea($$1);
      }
   }
}
