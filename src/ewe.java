import net.minecraft.server.MinecraftServer;

public class ewe implements ewf<MinecraftServer> {
   final akt a;

   public ewe(akt $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewh<MinecraftServer> $$1, long $$2) {
      ali $$3 = $$0.aF();

      for (ht<eh> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ewf.a<MinecraftServer, ewe> {
      public a() {
         super(new akt("function_tag"), ewe.class);
      }

      public void a(uk $$0, ewe $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewe a(uk $$0) {
         akt $$1 = new akt($$0.l("Name"));
         return new ewe($$1);
      }
   }
}
