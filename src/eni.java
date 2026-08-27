import net.minecraft.server.MinecraftServer;

public class eni implements enk<MinecraftServer> {
   final aiy a;

   public eni(aiy $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, enm<MinecraftServer> $$1, long $$2) {
      ajm $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends enk.a<MinecraftServer, eni> {
      public a() {
         super(new aiy("function"), eni.class);
      }

      public void a(sw $$0, eni $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eni a(sw $$0) {
         aiy $$1 = new aiy($$0.l("Name"));
         return new eni($$1);
      }
   }
}
