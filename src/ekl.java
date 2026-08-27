import net.minecraft.server.MinecraftServer;

public class ekl implements ekm<MinecraftServer> {
   final agt a;

   public ekl(agt $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eko<MinecraftServer> $$1, long $$2) {
      ahh $$3 = $$0.aC();

      for (gz<ds> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ekm.a<MinecraftServer, ekl> {
      public a() {
         super(new agt("function_tag"), ekl.class);
      }

      public void a(sj $$0, ekl $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ekl a(sj $$0) {
         agt $$1 = new agt($$0.l("Name"));
         return new ekl($$1);
      }
   }
}
