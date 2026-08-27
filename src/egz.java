import net.minecraft.server.MinecraftServer;

public class egz implements eha<MinecraftServer> {
   final aey a;

   public egz(aey $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ehc<MinecraftServer> $$1, long $$2) {
      afm $$3 = $$0.aA();

      for (dp $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }
   }

   public static class a extends eha.a<MinecraftServer, egz> {
      public a() {
         super(new aey("function_tag"), egz.class);
      }

      public void a(qy $$0, egz $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public egz a(qy $$0) {
         aey $$1 = new aey($$0.l("Name"));
         return new egz($$1);
      }
   }
}
