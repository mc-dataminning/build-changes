import net.minecraft.server.MinecraftServer;

public class eds implements edt<MinecraftServer> {
   final acq a;

   public eds(acq $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, edv<MinecraftServer> $$1, long $$2) {
      ade $$3 = $$0.aA();

      for (dn $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends edt.a<MinecraftServer, eds> {
      public a() {
         super(new acq("function_tag"), eds.class);
      }

      public void a(qr $$0, eds $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eds a(qr $$0) {
         acq $$1 = new acq($$0.l("Name"));
         return new eds($$1);
      }
   }
}
