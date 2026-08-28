import net.minecraft.server.MinecraftServer;

public class fdf implements fdh<MinecraftServer> {
   final ale a;

   public fdf(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fdj<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fdh.a<MinecraftServer, fdf> {
      public a() {
         super(ale.b("function"), fdf.class);
      }

      public void a(tx $$0, fdf $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fdf a(tx $$0) {
         ale $$1 = ale.a($$0.l("Name"));
         return new fdf($$1);
      }
   }
}
