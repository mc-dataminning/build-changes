import net.minecraft.server.MinecraftServer;

public class epc implements epe<MinecraftServer> {
   final ajh a;

   public epc(ajh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, epg<MinecraftServer> $$1, long $$2) {
      ajv $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends epe.a<MinecraftServer, epc> {
      public a() {
         super(new ajh("function"), epc.class);
      }

      public void a(ta $$0, epc $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public epc a(ta $$0) {
         ajh $$1 = new ajh($$0.l("Name"));
         return new epc($$1);
      }
   }
}
