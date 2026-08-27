import net.minecraft.server.MinecraftServer;

public class ekv implements ekx<MinecraftServer> {
   final ahd a;

   public ekv(ahd $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ekz<MinecraftServer> $$1, long $$2) {
      ahr $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ekx.a<MinecraftServer, ekv> {
      public a() {
         super(new ahd("function"), ekv.class);
      }

      public void a(sl $$0, ekv $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ekv a(sl $$0) {
         ahd $$1 = new ahd($$0.l("Name"));
         return new ekv($$1);
      }
   }
}
