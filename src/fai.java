import net.minecraft.server.MinecraftServer;

public class fai implements faj<MinecraftServer> {
   final aku a;

   public fai(aku $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fal<MinecraftServer> $$1, long $$2) {
      alj $$3 = $$0.aE();

      for (il<ex> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends faj.a<MinecraftServer, fai> {
      public a() {
         super(aku.b("function_tag"), fai.class);
      }

      public void a(tq $$0, fai $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fai a(tq $$0) {
         aku $$1 = aku.a($$0.l("Name"));
         return new fai($$1);
      }
   }
}
