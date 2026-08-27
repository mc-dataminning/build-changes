import net.minecraft.server.MinecraftServer;

public class erj implements erl<MinecraftServer> {
   final ajt a;

   public erj(ajt $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ern<MinecraftServer> $$1, long $$2) {
      akh $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends erl.a<MinecraftServer, erj> {
      public a() {
         super(new ajt("function"), erj.class);
      }

      public void a(tm $$0, erj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public erj a(tm $$0) {
         ajt $$1 = new ajt($$0.l("Name"));
         return new erj($$1);
      }
   }
}
