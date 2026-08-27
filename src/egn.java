import net.minecraft.server.MinecraftServer;

public class egn implements egp<MinecraftServer> {
   final aer a;

   public egn(aer $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egr<MinecraftServer> $$1, long $$2) {
      aff $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends egp.a<MinecraftServer, egn> {
      public a() {
         super(new aer("function"), egn.class);
      }

      public void a(qr $$0, egn $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egn a(qr $$0) {
         aer $$1 = new aer($$0.l("Name"));
         return new egn($$1);
      }
   }
}
