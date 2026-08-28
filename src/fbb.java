import net.minecraft.server.MinecraftServer;

public class fbb implements fbc<MinecraftServer> {
   final alp a;

   public fbb(alp $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbe<MinecraftServer> $$1, long $$2) {
      ame $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fbc.a<MinecraftServer, fbb> {
      public a() {
         super(alp.b("function_tag"), fbb.class);
      }

      public void a(um $$0, fbb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbb a(um $$0) {
         alp $$1 = alp.a($$0.l("Name"));
         return new fbb($$1);
      }
   }
}
