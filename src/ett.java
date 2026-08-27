import net.minecraft.server.MinecraftServer;

public class ett implements etv<MinecraftServer> {
   final akm a;

   public ett(akm $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, etx<MinecraftServer> $$1, long $$2) {
      alb $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends etv.a<MinecraftServer, ett> {
      public a() {
         super(new akm("function"), ett.class);
      }

      public void a(ud $$0, ett $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ett a(ud $$0) {
         akm $$1 = new akm($$0.l("Name"));
         return new ett($$1);
      }
   }
}
