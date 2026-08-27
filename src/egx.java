import net.minecraft.server.MinecraftServer;

public class egx implements egy<MinecraftServer> {
   final aew a;

   public egx(aew $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eha<MinecraftServer> $$1, long $$2) {
      afk $$3 = $$0.aA();

      for (dp $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends egy.a<MinecraftServer, egx> {
      public a() {
         super(new aew("function_tag"), egx.class);
      }

      public void a(qw $$0, egx $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egx a(qw $$0) {
         aew $$1 = new aew($$0.l("Name"));
         return new egx($$1);
      }
   }
}
