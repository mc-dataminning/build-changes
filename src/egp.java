import net.minecraft.server.MinecraftServer;

public class egp implements egq<MinecraftServer> {
   final aep a;

   public egp(aep $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egs<MinecraftServer> $$1, long $$2) {
      afd $$3 = $$0.aA();

      for (dn $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends egq.a<MinecraftServer, egp> {
      public a() {
         super(new aep("function_tag"), egp.class);
      }

      public void a(qs $$0, egp $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egp a(qs $$0) {
         aep $$1 = new aep($$0.l("Name"));
         return new egp($$1);
      }
   }
}
