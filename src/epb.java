import net.minecraft.server.MinecraftServer;

public class epb implements epc<MinecraftServer> {
   final ajh a;

   public epb(ajh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, epe<MinecraftServer> $$1, long $$2) {
      ajv $$3 = $$0.aF();

      for (hf<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends epc.a<MinecraftServer, epb> {
      public a() {
         super(new ajh("function_tag"), epb.class);
      }

      public void a(ta $$0, epb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public epb a(ta $$0) {
         ajh $$1 = new ajh($$0.l("Name"));
         return new epb($$1);
      }
   }
}
