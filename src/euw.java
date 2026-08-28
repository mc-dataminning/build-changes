import net.minecraft.server.MinecraftServer;

public class euw implements eux<MinecraftServer> {
   final alb a;

   public euw(alb $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, euz<MinecraftServer> $$1, long $$2) {
      alq $$3 = $$0.aF();

      for (ib<ep> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eux.a<MinecraftServer, euw> {
      public a() {
         super(new alb("function_tag"), euw.class);
      }

      public void a(ur $$0, euw $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public euw a(ur $$0) {
         alb $$1 = new alb($$0.l("Name"));
         return new euw($$1);
      }
   }
}
