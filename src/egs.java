import net.minecraft.server.MinecraftServer;

public class egs implements egt<MinecraftServer> {
   final aeu a;

   public egs(aeu $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egv<MinecraftServer> $$1, long $$2) {
      afi $$3 = $$0.aA();

      for (dp $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends egt.a<MinecraftServer, egs> {
      public a() {
         super(new aeu("function_tag"), egs.class);
      }

      public void a(qu $$0, egs $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egs a(qu $$0) {
         aeu $$1 = new aeu($$0.l("Name"));
         return new egs($$1);
      }
   }
}
