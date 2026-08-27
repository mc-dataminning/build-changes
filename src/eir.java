import net.minecraft.server.MinecraftServer;

public class eir implements eit<MinecraftServer> {
   final agg a;

   public eir(agg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eiv<MinecraftServer> $$1, long $$2) {
      agu $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eit.a<MinecraftServer, eir> {
      public a() {
         super(new agg("function"), eir.class);
      }

      public void a(rz $$0, eir $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eir a(rz $$0) {
         agg $$1 = new agg($$0.l("Name"));
         return new eir($$1);
      }
   }
}
