import net.minecraft.server.MinecraftServer;

public class esp implements esq<MinecraftServer> {
   final akf a;

   public esp(akf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ess<MinecraftServer> $$1, long $$2) {
      akt $$3 = $$0.aF();

      for (ho<ec> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends esq.a<MinecraftServer, esp> {
      public a() {
         super(new akf("function_tag"), esp.class);
      }

      public void a(ty $$0, esp $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public esp a(ty $$0) {
         akf $$1 = new akf($$0.l("Name"));
         return new esp($$1);
      }
   }
}
