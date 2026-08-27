import net.minecraft.server.MinecraftServer;

public class egy implements eha<MinecraftServer> {
   final aey a;

   public egy(aey $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ehc<MinecraftServer> $$1, long $$2) {
      afm $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends eha.a<MinecraftServer, egy> {
      public a() {
         super(new aey("function"), egy.class);
      }

      public void a(qy $$0, egy $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egy a(qy $$0) {
         aey $$1 = new aey($$0.l("Name"));
         return new egy($$1);
      }
   }
}
