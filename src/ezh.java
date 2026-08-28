import net.minecraft.server.MinecraftServer;

public class ezh implements ezj<MinecraftServer> {
   final alj a;

   public ezh(alj $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ezl<MinecraftServer> $$1, long $$2) {
      aly $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ezj.a<MinecraftServer, ezh> {
      public a() {
         super(alj.b("function"), ezh.class);
      }

      public void a(ul $$0, ezh $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ezh a(ul $$0) {
         alj $$1 = alj.a($$0.l("Name"));
         return new ezh($$1);
      }
   }
}
