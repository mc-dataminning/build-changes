import net.minecraft.server.MinecraftServer;

public class ewl implements ewn<MinecraftServer> {
   final akr a;

   public ewl(akr $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewp<MinecraftServer> $$1, long $$2) {
      alg $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ewn.a<MinecraftServer, ewl> {
      public a() {
         super(akr.b("function"), ewl.class);
      }

      public void a(ub $$0, ewl $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewl a(ub $$0) {
         akr $$1 = akr.a($$0.l("Name"));
         return new ewl($$1);
      }
   }
}
