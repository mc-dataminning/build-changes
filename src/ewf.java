import net.minecraft.server.MinecraftServer;

public class ewf implements ewh<MinecraftServer> {
   final akq a;

   public ewf(akq $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ewj<MinecraftServer> $$1, long $$2) {
      alf $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ewh.a<MinecraftServer, ewf> {
      public a() {
         super(akq.b("function"), ewf.class);
      }

      public void a(ua $$0, ewf $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ewf a(ua $$0) {
         akq $$1 = akq.a($$0.l("Name"));
         return new ewf($$1);
      }
   }
}
