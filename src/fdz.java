import net.minecraft.server.MinecraftServer;

public class fdz implements feb<MinecraftServer> {
   final alg a;

   public fdz(alg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fed<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends feb.a<MinecraftServer, fdz> {
      public a() {
         super(alg.b("function"), fdz.class);
      }

      public void a(tz $$0, fdz $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fdz a(tz $$0) {
         alg $$1 = alg.a($$0.l("Name"));
         return new fdz($$1);
      }
   }
}
