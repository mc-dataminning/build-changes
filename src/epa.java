import net.minecraft.server.MinecraftServer;

public class epa implements epc<MinecraftServer> {
   final ajh a;

   public epa(ajh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, epe<MinecraftServer> $$1, long $$2) {
      ajv $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends epc.a<MinecraftServer, epa> {
      public a() {
         super(new ajh("function"), epa.class);
      }

      public void a(ta $$0, epa $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public epa a(ta $$0) {
         ajh $$1 = new ajh($$0.l("Name"));
         return new epa($$1);
      }
   }
}
