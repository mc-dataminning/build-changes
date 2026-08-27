import net.minecraft.server.MinecraftServer;

public class elm implements eln<MinecraftServer> {
   final ahh a;

   public elm(ahh $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, elp<MinecraftServer> $$1, long $$2) {
      ahv $$3 = $$0.aC();

      for (hb<ds> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eln.a<MinecraftServer, elm> {
      public a() {
         super(new ahh("function_tag"), elm.class);
      }

      public void a(so $$0, elm $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public elm a(so $$0) {
         ahh $$1 = new ahh($$0.l("Name"));
         return new elm($$1);
      }
   }
}
