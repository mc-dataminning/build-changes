import net.minecraft.server.MinecraftServer;

public class evi implements evk<MinecraftServer> {
   final akk a;

   public evi(akk $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evm<MinecraftServer> $$1, long $$2) {
      akz $$3 = $$0.aF();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   public static class a extends evk.a<MinecraftServer, evi> {
      public a() {
         super(new akk("function"), evi.class);
      }

      public void a(tx $$0, evi $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evi a(tx $$0) {
         akk $$1 = new akk($$0.l("Name"));
         return new evi($$1);
      }
   }
}
