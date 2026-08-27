import net.minecraft.server.MinecraftServer;

public class enc implements end<MinecraftServer> {
   final aiy a;

   public enc(aiy $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, enf<MinecraftServer> $$1, long $$2) {
      ajm $$3 = $$0.aC();

      for (hd<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends end.a<MinecraftServer, enc> {
      public a() {
         super(new aiy("function_tag"), enc.class);
      }

      public void a(sw $$0, enc $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public enc a(sw $$0) {
         aiy $$1 = new aiy($$0.l("Name"));
         return new enc($$1);
      }
   }
}
