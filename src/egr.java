import net.minecraft.server.MinecraftServer;

public class egr implements egt<MinecraftServer> {
   final aeu a;

   public egr(aeu $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egv<MinecraftServer> $$1, long $$2) {
      afi $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends egt.a<MinecraftServer, egr> {
      public a() {
         super(new aeu("function"), egr.class);
      }

      public void a(qu $$0, egr $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egr a(qu $$0) {
         aeu $$1 = new aeu($$0.l("Name"));
         return new egr($$1);
      }
   }
}
