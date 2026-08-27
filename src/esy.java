import net.minecraft.server.MinecraftServer;

public class esy implements eta<MinecraftServer> {
   final akh a;

   public esy(akh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, etc<MinecraftServer> $$1, long $$2) {
      akw $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eta.a<MinecraftServer, esy> {
      public a() {
         super(new akh("function"), esy.class);
      }

      public void a(ua $$0, esy $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public esy a(ua $$0) {
         akh $$1 = new akh($$0.l("Name"));
         return new esy($$1);
      }
   }
}
