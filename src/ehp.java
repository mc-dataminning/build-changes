import net.minecraft.server.MinecraftServer;

public class ehp implements ehq<MinecraftServer> {
   final afw a;

   public ehp(afw $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ehs<MinecraftServer> $$1, long $$2) {
      agk $$3 = $$0.aA();

      for (gx<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ehq.a<MinecraftServer, ehp> {
      public a() {
         super(new afw("function_tag"), ehp.class);
      }

      public void a(rt $$0, ehp $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ehp a(rt $$0) {
         afw $$1 = new afw($$0.l("Name"));
         return new ehp($$1);
      }
   }
}
