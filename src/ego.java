import net.minecraft.server.MinecraftServer;

public class ego implements egp<MinecraftServer> {
   final aer a;

   public ego(aer $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egr<MinecraftServer> $$1, long $$2) {
      aff $$3 = $$0.aA();

      for (dm $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends egp.a<MinecraftServer, ego> {
      public a() {
         super(new aer("function_tag"), ego.class);
      }

      public void a(qr $$0, ego $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ego a(qr $$0) {
         aer $$1 = new aer($$0.l("Name"));
         return new ego($$1);
      }
   }
}
