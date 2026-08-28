import net.minecraft.server.MinecraftServer;

public class fah implements faj<MinecraftServer> {
   final aku a;

   public fah(aku $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fal<MinecraftServer> $$1, long $$2) {
      alj $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends faj.a<MinecraftServer, fah> {
      public a() {
         super(aku.b("function"), fah.class);
      }

      public void a(tq $$0, fah $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fah a(tq $$0) {
         aku $$1 = aku.a($$0.l("Name"));
         return new fah($$1);
      }
   }
}
