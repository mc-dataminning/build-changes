import net.minecraft.server.MinecraftServer;

public class evd implements eve<MinecraftServer> {
   final alf a;

   public evd(alf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evg<MinecraftServer> $$1, long $$2) {
      alu $$3 = $$0.aF();

      for (ib<ep> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eve.a<MinecraftServer, evd> {
      public a() {
         super(new alf("function_tag"), evd.class);
      }

      public void a(us $$0, evd $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evd a(us $$0) {
         alf $$1 = new alf($$0.l("Name"));
         return new evd($$1);
      }
   }
}
