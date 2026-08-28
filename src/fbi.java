import net.minecraft.server.MinecraftServer;

public class fbi implements fbj<MinecraftServer> {
   final alz a;

   public fbi(alz $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, fbl<MinecraftServer> $$1, long $$2) {
      amo $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends fbj.a<MinecraftServer, fbi> {
      public a() {
         super(alz.b("function_tag"), fbi.class);
      }

      public void a(ux $$0, fbi $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public fbi a(ux $$0) {
         alz $$1 = alz.a($$0.l("Name"));
         return new fbi($$1);
      }
   }
}
