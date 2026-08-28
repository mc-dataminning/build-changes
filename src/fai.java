import net.minecraft.server.MinecraftServer;

public class fai implements fak<MinecraftServer> {
   final akv a;

   public fai(akv $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fam<MinecraftServer> $$1, long $$2) {
      alk $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fak.a<MinecraftServer, fai> {
      public a() {
         super(akv.b("function"), fai.class);
      }

      public void a(tq $$0, fai $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fai a(tq $$0) {
         akv $$1 = akv.a($$0.l("Name"));
         return new fai($$1);
      }
   }
}
