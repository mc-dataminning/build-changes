import net.minecraft.server.MinecraftServer;

public class ert implements eru<MinecraftServer> {
   final ajv a;

   public ert(ajv $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, erw<MinecraftServer> $$1, long $$2) {
      akj $$3 = $$0.aF();

      for (hh<dv> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eru.a<MinecraftServer, ert> {
      public a() {
         super(new ajv("function_tag"), ert.class);
      }

      public void a(to $$0, ert $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ert a(to $$0) {
         ajv $$1 = new ajv($$0.l("Name"));
         return new ert($$1);
      }
   }
}
