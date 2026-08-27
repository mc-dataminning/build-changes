import net.minecraft.server.MinecraftServer;

public class ell implements eln<MinecraftServer> {
   final ahh a;

   public ell(ahh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, elp<MinecraftServer> $$1, long $$2) {
      ahv $$3 = $$0.aC();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eln.a<MinecraftServer, ell> {
      public a() {
         super(new ahh("function"), ell.class);
      }

      public void a(so $$0, ell $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ell a(so $$0) {
         ahh $$1 = new ahh($$0.l("Name"));
         return new ell($$1);
      }
   }
}
