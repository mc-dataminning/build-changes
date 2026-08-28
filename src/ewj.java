import net.minecraft.server.MinecraftServer;

public class ewj implements ewl<MinecraftServer> {
   final akr a;

   public ewj(akr $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewn<MinecraftServer> $$1, long $$2) {
      alg $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ewl.a<MinecraftServer, ewj> {
      public a() {
         super(akr.b("function"), ewj.class);
      }

      public void a(ub $$0, ewj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewj a(ub $$0) {
         akr $$1 = akr.a($$0.l("Name"));
         return new ewj($$1);
      }
   }
}
