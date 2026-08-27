import net.minecraft.server.MinecraftServer;

public class ejj implements ejk<MinecraftServer> {
   final agm a;

   public ejj(agm $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ejm<MinecraftServer> $$1, long $$2) {
      aha $$3 = $$0.aC();

      for (hb<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ejk.a<MinecraftServer, ejj> {
      public a() {
         super(new agm("function_tag"), ejj.class);
      }

      public void a(sd $$0, ejj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ejj a(sd $$0) {
         agm $$1 = new agm($$0.l("Name"));
         return new ejj($$1);
      }
   }
}
