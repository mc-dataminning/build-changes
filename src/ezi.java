import net.minecraft.server.MinecraftServer;

public class ezi implements ezj<MinecraftServer> {
   final alj a;

   public ezi(alj $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ezl<MinecraftServer> $$1, long $$2) {
      aly $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ezj.a<MinecraftServer, ezi> {
      public a() {
         super(alj.b("function_tag"), ezi.class);
      }

      public void a(ul $$0, ezi $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ezi a(ul $$0) {
         alj $$1 = alj.a($$0.l("Name"));
         return new ezi($$1);
      }
   }
}
