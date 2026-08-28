import net.minecraft.server.MinecraftServer;

public class eyr implements eys<MinecraftServer> {
   final alh a;

   public eyr(alh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eyu<MinecraftServer> $$1, long $$2) {
      alw $$3 = $$0.aE();

      for (ij<ev> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eys.a<MinecraftServer, eyr> {
      public a() {
         super(alh.b("function_tag"), eyr.class);
      }

      public void a(uj $$0, eyr $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyr a(uj $$0) {
         alh $$1 = alh.a($$0.l("Name"));
         return new eyr($$1);
      }
   }
}
