import net.minecraft.server.MinecraftServer;

public class eva implements evb<MinecraftServer> {
   final ale a;

   public eva(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evd<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aF();

      for (ib<ep> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends evb.a<MinecraftServer, eva> {
      public a() {
         super(new ale("function_tag"), eva.class);
      }

      public void a(ur $$0, eva $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eva a(ur $$0) {
         ale $$1 = new ale($$0.l("Name"));
         return new eva($$1);
      }
   }
}
