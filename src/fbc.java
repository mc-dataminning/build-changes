import net.minecraft.server.MinecraftServer;

public class fbc implements fbd<MinecraftServer> {
   final alz a;

   public fbc(alz $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbf<MinecraftServer> $$1, long $$2) {
      amo $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fbd.a<MinecraftServer, fbc> {
      public a() {
         super(alz.b("function_tag"), fbc.class);
      }

      public void a(ux $$0, fbc $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbc a(ux $$0) {
         alz $$1 = alz.a($$0.l("Name"));
         return new fbc($$1);
      }
   }
}
