import net.minecraft.server.MinecraftServer;

public class eld implements ele<MinecraftServer> {
   final ahg a;

   public eld(ahg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, elg<MinecraftServer> $$1, long $$2) {
      ahu $$3 = $$0.aC();

      for (hb<ds> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ele.a<MinecraftServer, eld> {
      public a() {
         super(new ahg("function_tag"), eld.class);
      }

      public void a(sn $$0, eld $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eld a(sn $$0) {
         ahg $$1 = new ahg($$0.l("Name"));
         return new eld($$1);
      }
   }
}
