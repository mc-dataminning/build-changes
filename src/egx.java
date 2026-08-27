import net.minecraft.server.MinecraftServer;

public class egx implements egy<MinecraftServer> {
   final aex a;

   public egx(aex $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eha<MinecraftServer> $$1, long $$2) {
      afl $$3 = $$0.aA();

      for (dp $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends egy.a<MinecraftServer, egx> {
      public a() {
         super(new aex("function_tag"), egx.class);
      }

      public void a(qy $$0, egx $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egx a(qy $$0) {
         aex $$1 = new aex($$0.l("Name"));
         return new egx($$1);
      }
   }
}
