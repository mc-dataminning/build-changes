import net.minecraft.server.MinecraftServer;

public class euv implements eux<MinecraftServer> {
   final alb a;

   public euv(alb $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, euz<MinecraftServer> $$1, long $$2) {
      alq $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eux.a<MinecraftServer, euv> {
      public a() {
         super(new alb("function"), euv.class);
      }

      public void a(ur $$0, euv $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public euv a(ur $$0) {
         alb $$1 = new alb($$0.l("Name"));
         return new euv($$1);
      }
   }
}
