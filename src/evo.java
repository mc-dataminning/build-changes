import net.minecraft.server.MinecraftServer;

public class evo implements evq<MinecraftServer> {
   final akk a;

   public evo(akk $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evs<MinecraftServer> $$1, long $$2) {
      akz $$3 = $$0.aG();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends evq.a<MinecraftServer, evo> {
      public a() {
         super(new akk("function"), evo.class);
      }

      public void a(tx $$0, evo $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evo a(tx $$0) {
         akk $$1 = new akk($$0.l("Name"));
         return new evo($$1);
      }
   }
}
