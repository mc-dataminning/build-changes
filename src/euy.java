import net.minecraft.server.MinecraftServer;

public class euy implements eva<MinecraftServer> {
   final ale a;

   public euy(ale $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evc<MinecraftServer> $$1, long $$2) {
      alt $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends eva.a<MinecraftServer, euy> {
      public a() {
         super(new ale("function"), euy.class);
      }

      public void a(ur $$0, euy $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public euy a(ur $$0) {
         ale $$1 = new ale($$0.l("Name"));
         return new euy($$1);
      }
   }
}
