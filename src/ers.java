import net.minecraft.server.MinecraftServer;

public class ers implements eru<MinecraftServer> {
   final ajv a;

   public ers(ajv $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, erw<MinecraftServer> $$1, long $$2) {
      akj $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eru.a<MinecraftServer, ers> {
      public a() {
         super(new ajv("function"), ers.class);
      }

      public void a(to $$0, ers $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ers a(to $$0) {
         ajv $$1 = new ajv($$0.l("Name"));
         return new ers($$1);
      }
   }
}
