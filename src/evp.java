import net.minecraft.server.MinecraftServer;

public class evp implements evq<MinecraftServer> {
   final akk a;

   public evp(akk $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, evs<MinecraftServer> $$1, long $$2) {
      akz $$3 = $$0.aG();

      for (ic<eq> $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.c());
      }
   }

   public static class a extends evq.a<MinecraftServer, evp> {
      public a() {
         super(new akk("function_tag"), evp.class);
      }

      public void a(tx $$0, evp $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public evp a(tx $$0) {
         akk $$1 = new akk($$0.l("Name"));
         return new evp($$1);
      }
   }
}
