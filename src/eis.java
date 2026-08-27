import net.minecraft.server.MinecraftServer;

public class eis implements eit<MinecraftServer> {
   final agg a;

   public eis(agg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eiv<MinecraftServer> $$1, long $$2) {
      agu $$3 = $$0.aA();

      for (gx<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eit.a<MinecraftServer, eis> {
      public a() {
         super(new agg("function_tag"), eis.class);
      }

      public void a(rz $$0, eis $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eis a(rz $$0) {
         agg $$1 = new agg($$0.l("Name"));
         return new eis($$1);
      }
   }
}
