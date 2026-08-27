import net.minecraft.server.MinecraftServer;

public class enj implements enk<MinecraftServer> {
   final aiy a;

   public enj(aiy $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, enm<MinecraftServer> $$1, long $$2) {
      ajm $$3 = $$0.aE();

      for (hd<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends enk.a<MinecraftServer, enj> {
      public a() {
         super(new aiy("function_tag"), enj.class);
      }

      public void a(sw $$0, enj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public enj a(sw $$0) {
         aiy $$1 = new aiy($$0.l("Name"));
         return new enj($$1);
      }
   }
}
