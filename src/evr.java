import net.minecraft.server.MinecraftServer;

public class evr implements evs<MinecraftServer> {
   final akk a;

   public evr(akk $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evu<MinecraftServer> $$1, long $$2) {
      akz $$3 = $$0.aG();

      for (ic<eq> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends evs.a<MinecraftServer, evr> {
      public a() {
         super(new akk("function_tag"), evr.class);
      }

      public void a(tx $$0, evr $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evr a(tx $$0) {
         akk $$1 = new akk($$0.l("Name"));
         return new evr($$1);
      }
   }
}
