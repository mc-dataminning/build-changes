import net.minecraft.server.MinecraftServer;

public class egm implements ego<MinecraftServer> {
   final aer a;

   public egm(aer $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egq<MinecraftServer> $$1, long $$2) {
      aff $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends ego.a<MinecraftServer, egm> {
      public a() {
         super(new aer("function"), egm.class);
      }

      public void a(qr $$0, egm $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egm a(qr $$0) {
         aer $$1 = new aer($$0.l("Name"));
         return new egm($$1);
      }
   }
}
