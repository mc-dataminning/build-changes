import net.minecraft.server.MinecraftServer;

public class eva implements evc<MinecraftServer> {
   final alf a;

   public eva(alf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eve<MinecraftServer> $$1, long $$2) {
      alu $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends evc.a<MinecraftServer, eva> {
      public a() {
         super(new alf("function"), eva.class);
      }

      public void a(us $$0, eva $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eva a(us $$0) {
         alf $$1 = new alf($$0.l("Name"));
         return new eva($$1);
      }
   }
}
