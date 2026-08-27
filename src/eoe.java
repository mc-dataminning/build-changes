import net.minecraft.server.MinecraftServer;

public class eoe implements eog<MinecraftServer> {
   final ajc a;

   public eoe(ajc $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eoi<MinecraftServer> $$1, long $$2) {
      ajq $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eog.a<MinecraftServer, eoe> {
      public a() {
         super(new ajc("function"), eoe.class);
      }

      public void a(sy $$0, eoe $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eoe a(sy $$0) {
         ajc $$1 = new ajc($$0.l("Name"));
         return new eoe($$1);
      }
   }
}
