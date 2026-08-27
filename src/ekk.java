import net.minecraft.server.MinecraftServer;

public class ekk implements ekm<MinecraftServer> {
   final agt a;

   public ekk(agt $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eko<MinecraftServer> $$1, long $$2) {
      ahh $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ekm.a<MinecraftServer, ekk> {
      public a() {
         super(new agt("function"), ekk.class);
      }

      public void a(sj $$0, ekk $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ekk a(sj $$0) {
         agt $$1 = new agt($$0.l("Name"));
         return new ekk($$1);
      }
   }
}
