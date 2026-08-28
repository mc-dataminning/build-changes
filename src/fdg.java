import net.minecraft.server.MinecraftServer;

public class fdg implements fdh<MinecraftServer> {
   final ale a;

   public fdg(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fdj<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aE();

      for (hw<ei> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fdh.a<MinecraftServer, fdg> {
      public a() {
         super(ale.b("function_tag"), fdg.class);
      }

      public void a(tx $$0, fdg $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fdg a(tx $$0) {
         ale $$1 = ale.a($$0.l("Name"));
         return new fdg($$1);
      }
   }
}
