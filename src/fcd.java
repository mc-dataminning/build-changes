import net.minecraft.server.MinecraftServer;

public class fcd implements fcf<MinecraftServer> {
   final ald a;

   public fcd(ald $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fch<MinecraftServer> $$1, long $$2) {
      als $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fcf.a<MinecraftServer, fcd> {
      public a() {
         super(ald.b("function"), fcd.class);
      }

      public void a(tw $$0, fcd $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fcd a(tw $$0) {
         ald $$1 = ald.a($$0.l("Name"));
         return new fcd($$1);
      }
   }
}
