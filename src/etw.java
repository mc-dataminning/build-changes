import net.minecraft.server.MinecraftServer;

public class etw implements etx<MinecraftServer> {
   final akn a;

   public etw(akn $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, etz<MinecraftServer> $$1, long $$2) {
      alc $$3 = $$0.aF();

      for (hq<ee> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends etx.a<MinecraftServer, etw> {
      public a() {
         super(new akn("function_tag"), etw.class);
      }

      public void a(ud $$0, etw $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public etw a(ud $$0) {
         akn $$1 = new akn($$0.l("Name"));
         return new etw($$1);
      }
   }
}
