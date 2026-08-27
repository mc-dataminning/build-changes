import net.minecraft.server.MinecraftServer;

public class erk implements erl<MinecraftServer> {
   final ajt a;

   public erk(ajt $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ern<MinecraftServer> $$1, long $$2) {
      akh $$3 = $$0.aF();

      for (hf<du> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends erl.a<MinecraftServer, erk> {
      public a() {
         super(new ajt("function_tag"), erk.class);
      }

      public void a(tm $$0, erk $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public erk a(tm $$0) {
         ajt $$1 = new ajt($$0.l("Name"));
         return new erk($$1);
      }
   }
}
