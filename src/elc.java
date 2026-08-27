import net.minecraft.server.MinecraftServer;

public class elc implements eld<MinecraftServer> {
   final ahg a;

   public elc(ahg $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, elf<MinecraftServer> $$1, long $$2) {
      ahu $$3 = $$0.aC();

      for (hb<ds> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eld.a<MinecraftServer, elc> {
      public a() {
         super(new ahg("function_tag"), elc.class);
      }

      public void a(sn $$0, elc $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public elc a(sn $$0) {
         ahg $$1 = new ahg($$0.l("Name"));
         return new elc($$1);
      }
   }
}
