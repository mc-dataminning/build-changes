import net.minecraft.server.MinecraftServer;

public class eyb implements eyd<MinecraftServer> {
   final alc a;

   public eyb(alc $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eyf<MinecraftServer> $$1, long $$2) {
      alr $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eyd.a<MinecraftServer, eyb> {
      public a() {
         super(alc.b("function"), eyb.class);
      }

      public void a(uf $$0, eyb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eyb a(uf $$0) {
         alc $$1 = alc.a($$0.l("Name"));
         return new eyb($$1);
      }
   }
}
