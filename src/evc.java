import net.minecraft.server.MinecraftServer;

public class evc implements eve<MinecraftServer> {
   final alf a;

   public evc(alf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evg<MinecraftServer> $$1, long $$2) {
      alu $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eve.a<MinecraftServer, evc> {
      public a() {
         super(new alf("function"), evc.class);
      }

      public void a(us $$0, evc $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evc a(us $$0) {
         alf $$1 = new alf($$0.l("Name"));
         return new evc($$1);
      }
   }
}
