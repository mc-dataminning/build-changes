import net.minecraft.server.MinecraftServer;

public class exn implements exp<MinecraftServer> {
   final alb a;

   public exn(alb $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, exr<MinecraftServer> $$1, long $$2) {
      alq $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends exp.a<MinecraftServer, exn> {
      public a() {
         super(alb.b("function"), exn.class);
      }

      public void a(uf $$0, exn $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public exn a(uf $$0) {
         alb $$1 = alb.a($$0.l("Name"));
         return new exn($$1);
      }
   }
}
