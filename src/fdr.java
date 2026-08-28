import net.minecraft.server.MinecraftServer;

public class fdr implements fdt<MinecraftServer> {
   final alg a;

   public fdr(alg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fdv<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fdt.a<MinecraftServer, fdr> {
      public a() {
         super(alg.b("function"), fdr.class);
      }

      public void a(tz $$0, fdr $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fdr a(tz $$0) {
         alg $$1 = alg.a($$0.l("Name"));
         return new fdr($$1);
      }
   }
}
