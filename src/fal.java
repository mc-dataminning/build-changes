import net.minecraft.server.MinecraftServer;

public class fal implements fam<MinecraftServer> {
   final akv a;

   public fal(akv $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fao<MinecraftServer> $$1, long $$2) {
      alk $$3 = $$0.aE();

      for (il<ex> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fam.a<MinecraftServer, fal> {
      public a() {
         super(akv.b("function_tag"), fal.class);
      }

      public void a(tq $$0, fal $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fal a(tq $$0) {
         akv $$1 = akv.a($$0.l("Name"));
         return new fal($$1);
      }
   }
}
