import net.minecraft.server.MinecraftServer;

public class etv implements etx<MinecraftServer> {
   final akn a;

   public etv(akn $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, etz<MinecraftServer> $$1, long $$2) {
      alc $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends etx.a<MinecraftServer, etv> {
      public a() {
         super(new akn("function"), etv.class);
      }

      public void a(ud $$0, etv $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public etv a(ud $$0) {
         akn $$1 = new akn($$0.l("Name"));
         return new etv($$1);
      }
   }
}
