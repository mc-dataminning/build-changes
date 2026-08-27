import net.minecraft.server.MinecraftServer;

public class etu implements etv<MinecraftServer> {
   final akm a;

   public etu(akm $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, etx<MinecraftServer> $$1, long $$2) {
      alb $$3 = $$0.aF();

      for (hq<ee> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends etv.a<MinecraftServer, etu> {
      public a() {
         super(new akm("function_tag"), etu.class);
      }

      public void a(ud $$0, etu $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public etu a(ud $$0) {
         akm $$1 = new akm($$0.l("Name"));
         return new etu($$1);
      }
   }
}
