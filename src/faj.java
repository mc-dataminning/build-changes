import net.minecraft.server.MinecraftServer;

public class faj implements fal<MinecraftServer> {
   final akv a;

   public faj(akv $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fan<MinecraftServer> $$1, long $$2) {
      alk $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fal.a<MinecraftServer, faj> {
      public a() {
         super(akv.b("function"), faj.class);
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
