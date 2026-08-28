import net.minecraft.server.MinecraftServer;

public class fbg implements fbi<MinecraftServer> {
   final aku a;

   public fbg(aku $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbk<MinecraftServer> $$1, long $$2) {
      alj $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fbi.a<MinecraftServer, fbg> {
      public a() {
         super(aku.b("function"), fbg.class);
      }

      public void a(tq $$0, fbg $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbg a(tq $$0) {
         aku $$1 = aku.a($$0.l("Name"));
         return new fbg($$1);
      }
   }
}
