import net.minecraft.server.MinecraftServer;

public class ejd implements ejf<MinecraftServer> {
   final agi a;

   public ejd(agi $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ejh<MinecraftServer> $$1, long $$2) {
      agw $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ejf.a<MinecraftServer, ejd> {
      public a() {
         super(new agi("function"), ejd.class);
      }

      public void a(rz $$0, ejd $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ejd a(rz $$0) {
         agi $$1 = new agi($$0.l("Name"));
         return new ejd($$1);
      }
   }
}
