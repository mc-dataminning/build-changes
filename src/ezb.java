import net.minecraft.server.MinecraftServer;

public class ezb implements ezc<MinecraftServer> {
   final all a;

   public ezb(all $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, eze<MinecraftServer> $$1, long $$2) {
      ama $$3 = $$0.aE();

      for (ik<ew> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends ezc.a<MinecraftServer, ezb> {
      public a() {
         super(all.b("function_tag"), ezb.class);
      }

      public void a(un $$0, ezb $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public ezb a(un $$0) {
         all $$1 = all.a($$0.l("Name"));
         return new ezb($$1);
      }
   }
}
