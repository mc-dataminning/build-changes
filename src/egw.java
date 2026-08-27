import net.minecraft.server.MinecraftServer;

public class egw implements egy<MinecraftServer> {
   final aex a;

   public egw(aex $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eha<MinecraftServer> $$1, long $$2) {
      afl $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends egy.a<MinecraftServer, egw> {
      public a() {
         super(new aex("function"), egw.class);
      }

      public void a(qx $$0, egw $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egw a(qx $$0) {
         aex $$1 = new aex($$0.l("Name"));
         return new egw($$1);
      }
   }
}
