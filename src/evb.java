import net.minecraft.server.MinecraftServer;

public class evb implements evd<MinecraftServer> {
   final alf a;

   public evb(alf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evf<MinecraftServer> $$1, long $$2) {
      alu $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends evd.a<MinecraftServer, evb> {
      public a() {
         super(new alf("function"), evb.class);
      }

      public void a(us $$0, evb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evb a(us $$0) {
         alf $$1 = new alf($$0.l("Name"));
         return new evb($$1);
      }
   }
}
