import net.minecraft.server.MinecraftServer;

public class eza implements ezc<MinecraftServer> {
   final all a;

   public eza(all $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eze<MinecraftServer> $$1, long $$2) {
      ama $$3 = $$0.aE();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends ezc.a<MinecraftServer, eza> {
      public a() {
         super(all.b("function"), eza.class);
      }

      public void a(un $$0, eza $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eza a(un $$0) {
         all $$1 = all.a($$0.l("Name"));
         return new eza($$1);
      }
   }
}
