import net.minecraft.server.MinecraftServer;

public class fce implements fcf<MinecraftServer> {
   final ald a;

   public fce(ald $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fch<MinecraftServer> $$1, long $$2) {
      als $$3 = $$0.aE();

      for (im<ex> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fcf.a<MinecraftServer, fce> {
      public a() {
         super(ald.b("function_tag"), fce.class);
      }

      public void a(tw $$0, fce $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fce a(tw $$0) {
         ald $$1 = ald.a($$0.l("Name"));
         return new fce($$1);
      }
   }
}
