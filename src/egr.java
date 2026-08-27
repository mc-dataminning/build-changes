import net.minecraft.server.MinecraftServer;

public class egr implements egs<MinecraftServer> {
   final aez a;

   public egr(aez $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, egu<MinecraftServer> $$1, long $$2) {
      afn $$3 = $$0.aA();

      for (dp $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends egs.a<MinecraftServer, egr> {
      public a() {
         super(new aez("function_tag"), egr.class);
      }

      public void a(qw $$0, egr $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egr a(qw $$0) {
         aez $$1 = new aez($$0.l("Name"));
         return new egr($$1);
      }
   }
}
