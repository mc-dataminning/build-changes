import net.minecraft.server.MinecraftServer;

public class evj implements evk<MinecraftServer> {
   final akk a;

   public evj(akk $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evm<MinecraftServer> $$1, long $$2) {
      akz $$3 = $$0.aF();

      for (ic<eq> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends evk.a<MinecraftServer, evj> {
      public a() {
         super(new akk("function_tag"), evj.class);
      }

      public void a(tx $$0, evj $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evj a(tx $$0) {
         akk $$1 = new akk($$0.l("Name"));
         return new evj($$1);
      }
   }
}
