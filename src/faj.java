import net.minecraft.server.MinecraftServer;

public class faj implements fak<MinecraftServer> {
   final akv a;

   public faj(akv $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fam<MinecraftServer> $$1, long $$2) {
      alk $$3 = $$0.aE();

      for (il<ex> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fak.a<MinecraftServer, faj> {
      public a() {
         super(akv.b("function_tag"), faj.class);
      }

      public void a(tq $$0, faj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public faj a(tq $$0) {
         akv $$1 = akv.a($$0.l("Name"));
         return new faj($$1);
      }
   }
}
