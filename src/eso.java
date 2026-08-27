import net.minecraft.server.MinecraftServer;

public class eso implements esq<MinecraftServer> {
   final akf a;

   public eso(akf $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, ess<MinecraftServer> $$1, long $$2) {
      akt $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends esq.a<MinecraftServer, eso> {
      public a() {
         super(new akf("function"), eso.class);
      }

      public void a(ty $$0, eso $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public eso a(ty $$0) {
         akf $$1 = new akf($$0.l("Name"));
         return new eso($$1);
      }
   }
}
