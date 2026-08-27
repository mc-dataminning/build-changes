import net.minecraft.server.MinecraftServer;

public class edr implements edt<MinecraftServer> {
   final acq a;

   public edr(acq $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, edv<MinecraftServer> $$1, long $$2) {
      ade $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends edt.a<MinecraftServer, edr> {
      public a() {
         super(new acq("function"), edr.class);
      }

      public void a(qr $$0, edr $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public edr a(qr $$0) {
         acq $$1 = new acq($$0.l("Name"));
         return new edr($$1);
      }
   }
}
