import net.minecraft.server.MinecraftServer;

public class eje implements ejf<MinecraftServer> {
   final agi a;

   public eje(agi $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ejh<MinecraftServer> $$1, long $$2) {
      agw $$3 = $$0.aC();

      for (gx<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ejf.a<MinecraftServer, eje> {
      public a() {
         super(new agi("function_tag"), eje.class);
      }

      public void a(rz $$0, eje $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eje a(rz $$0) {
         agi $$1 = new agi($$0.l("Name"));
         return new eje($$1);
      }
   }
}
