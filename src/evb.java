import net.minecraft.server.MinecraftServer;

public class evb implements evc<MinecraftServer> {
   final alf a;

   public evb(alf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eve<MinecraftServer> $$1, long $$2) {
      alu $$3 = $$0.aF();

      for (ib<ep> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends evc.a<MinecraftServer, evb> {
      public a() {
         super(new alf("function_tag"), evb.class);
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
