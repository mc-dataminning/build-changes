import net.minecraft.server.MinecraftServer;

public class fbb implements fbd<MinecraftServer> {
   final alz a;

   public fbb(alz $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbf<MinecraftServer> $$1, long $$2) {
      amo $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fbd.a<MinecraftServer, fbb> {
      public a() {
         super(alz.b("function"), fbb.class);
      }

      public void a(ux $$0, fbb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbb a(ux $$0) {
         alz $$1 = alz.a($$0.l("Name"));
         return new fbb($$1);
      }
   }
}
