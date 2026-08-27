import net.minecraft.server.MinecraftServer;

public class epd implements epe<MinecraftServer> {
   final ajh a;

   public epd(ajh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, epg<MinecraftServer> $$1, long $$2) {
      ajv $$3 = $$0.aF();

      for (hf<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends epe.a<MinecraftServer, epd> {
      public a() {
         super(new ajh("function_tag"), epd.class);
      }

      public void a(ta $$0, epd $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public epd a(ta $$0) {
         ajh $$1 = new ajh($$0.l("Name"));
         return new epd($$1);
      }
   }
}
