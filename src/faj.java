import net.minecraft.server.MinecraftServer;

public class faj implements fal<MinecraftServer> {
   final aku a;

   public faj(aku $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fan<MinecraftServer> $$1, long $$2) {
      alj $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends fal.a<MinecraftServer, faj> {
      public a() {
         super(aku.b("function"), faj.class);
      }

      public void a(tq $$0, faj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public faj a(tq $$0) {
         aku $$1 = aku.a($$0.l("Name"));
         return new faj($$1);
      }
   }
}
