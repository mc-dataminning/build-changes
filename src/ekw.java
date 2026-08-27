import net.minecraft.server.MinecraftServer;

public class ekw implements ekx<MinecraftServer> {
   final ahd a;

   public ekw(ahd $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ekz<MinecraftServer> $$1, long $$2) {
      ahr $$3 = $$0.aC();

      for (hb<ds> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ekx.a<MinecraftServer, ekw> {
      public a() {
         super(new ahd("function_tag"), ekw.class);
      }

      public void a(sl $$0, ekw $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ekw a(sl $$0) {
         ahd $$1 = new ahd($$0.l("Name"));
         return new ekw($$1);
      }
   }
}
