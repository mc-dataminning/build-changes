import net.minecraft.server.MinecraftServer;

public class euz implements eva<MinecraftServer> {
   final ale a;

   public euz(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evc<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aF();

      for (ib<ep> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends eva.a<MinecraftServer, euz> {
      public a() {
         super(new ale("function_tag"), euz.class);
      }

      public void a(ur $$0, euz $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public euz a(ur $$0) {
         ale $$1 = new ale($$0.l("Name"));
         return new euz($$1);
      }
   }
}
