import net.minecraft.server.MinecraftServer;

public class egq implements egs<MinecraftServer> {
   final aez a;

   public egq(aez $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egu<MinecraftServer> $$1, long $$2) {
      afn $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends egs.a<MinecraftServer, egq> {
      public a() {
         super(new aez("function"), egq.class);
      }

      public void a(qw $$0, egq $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egq a(qw $$0) {
         aez $$1 = new aez($$0.l("Name"));
         return new egq($$1);
      }
   }
}
